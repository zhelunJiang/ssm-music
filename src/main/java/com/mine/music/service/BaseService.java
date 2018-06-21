package com.mine.music.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class BaseService<T> {
    protected Class<T> entityClass;//类
    protected T entity;//类的实例
    public BaseService(){
        try{
            ParameterizedType type = (ParameterizedType)getClass().getGenericSuperclass();
            entityClass = (Class<T>) type.getActualTypeArguments()[0];
            entity =  entityClass.newInstance();
            System.out.println("构造:"+entityClass.getName()+"...."+entity);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Autowired
    private Mapper<T> mapper;
    public List<T> getByEntity(T entity){
        return mapper.select(entity);
    }

    public T getOne(String id){
       return mapper.selectByPrimaryKey(id);
    }

    public List<T> queryAll(){
        try {
            T entity = entityClass.newInstance();
            Method setDr = entityClass.getDeclaredMethod("setDr",Integer.class);
            setDr.invoke(entity,0);
            return mapper.select(entity);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<T> queryListByEntity(T entity){
        return mapper.select(entity);
    }

    public PageInfo<T> getPage(T entity, Integer page, Integer rows){
        PageHelper pageHelper = new PageHelper();
        pageHelper.startPage(page,rows);
        List<T> list = this.queryListByEntity(entity);
        return new PageInfo<T>(list);
    }

    public int delete(String id) {
        T entity = this.getOne(id);
        try{
            Method setDr = entity.getClass().getDeclaredMethod("setDr",Integer.class);
            //反射调用方法
            setDr.invoke(entity,1);
            System.out.println( "(delete)invoke调用方法后得到的:"+ entity);
            return mapper.updateByPrimaryKey(entity);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("invoke失败或删除出错");
            return 0;
        }
    }
    public int save(T entity)  {
        try{
            String uuid = UUID.randomUUID().toString().replace("-","");
            Method setID = entity.getClass().getDeclaredMethod("setId",String.class);
            Method setDr = entity.getClass().getDeclaredMethod("setDr",Integer.class);
            Method setCreateTime = entity.getClass().getDeclaredMethod("setCreate",Date.class);
            setCreateTime.invoke(entity,new Date());
            setID.invoke(entity,uuid);
            setDr.invoke(entity,0);
            System.out.println("(save)invoke调用方法后得到的:"+ entity);
            return mapper.insert(entity);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("invoke失败或插入失败");
        }
        return 0;
    }
    public int update(T entity){
        try {
            Method setUpdateTime = entity.getClass().getDeclaredMethod("setUpdate",Date.class);
            setUpdateTime.invoke(entity,new Date());
            System.out.println("(update)invoke调用方法后得到的:"+ entity);
            return mapper.updateByPrimaryKey(entity);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("invoke失败或更新失败");
        }
        return 0;
    }
}
