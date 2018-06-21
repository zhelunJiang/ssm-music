package com.mine.music.controller;

import com.github.pagehelper.PageInfo;
import com.mine.music.service.BaseService;
import com.mine.music.utils.WriteJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class BaseController<T>{
    @Autowired
    private BaseService<T> baseService;

    @RequestMapping("getAll")
    @ResponseBody
    public WriteJson getAll(){
        List<T> list  = baseService.queryAll();
        WriteJson writeJson = new WriteJson(list);
        return writeJson;
    }

    @RequestMapping("page")
    @ResponseBody
    public WriteJson getPage(T entity, Integer page, Integer row){
        PageInfo<T> pageInfo = baseService.getPage(entity,page,row);
        return new WriteJson(pageInfo);
    }

    @RequestMapping("get")
    @ResponseBody
    public WriteJson getOne(String id){
        T entity = baseService.getOne(id);
        return  new WriteJson(entity);
    }

    @RequestMapping("save")
    @ResponseBody
    public int save(@RequestBody T entity) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("doSave");
        Method getId = entity.getClass().getDeclaredMethod("getId");
        String id = (String) getId.invoke(entity);
        if(id==null||id.equals("")){
            return baseService.save(entity);
        }else{
            return baseService.update(entity);
        }
    }
    @RequestMapping("delete")
    @ResponseBody
    public int delete(String id){
        System.out.println(id);
        return baseService.delete(id);
    }
}
