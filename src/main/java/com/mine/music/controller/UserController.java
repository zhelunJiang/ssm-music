package com.mine.music.controller;

import com.mine.music.entity.TbUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("music-manager/user")
public class UserController extends BaseController<TbUser>{
    /*@Autowired
    private UserService userService;

    @RequestMapping("getAll")
    @ResponseBody
    public List<TbUser> getAllUser(){
        List<TbUser> list = userService.queryAll();
        return list;
    }
    @RequestMapping("get")
    @ResponseBody
    public TbUser getUser(String id){
        return  userService.getOne(id);
    }
    @RequestMapping("save")
    @ResponseBody
    public Integer save(TbUser entity){
        if(entity.getId()!=null){
            return userService.update(entity);
        }else{
            return  userService.save(entity);
        }
    }*/
}
