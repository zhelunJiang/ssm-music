package com.mine.music.controller;

import com.mine.music.entity.TbAdmin;
import com.mine.music.mapper.TbAdminMapper;
import com.mine.music.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("music-manager")
public class LoginController  {

    @Autowired
    private LoginService loginService;

    @RequestMapping("adminLogin")
    public String adminLogin(HttpServletRequest request, TbAdmin admin){

        TbAdmin tbAdmin = loginService.getAdmin(admin);
        System.out.println(tbAdmin.getUsername()+"1");
        if(tbAdmin!=null) {
            tbAdmin.setPassword(null);
            request.setAttribute("admin",tbAdmin);
            System.out.println(tbAdmin.getUsername());
            return "login";
        }else{
            request.setAttribute("error","登陆信息有误");
            System.out.println(tbAdmin.getUsername());
            return "index";
        }
    }
}
