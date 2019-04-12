package com.mzw.controller;

import com.mzw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController{
    @Autowired
    private UserService userService;


    @RequestMapping("login")
    public String  login(String username, String password, HttpSession session,String code){



        return null;
    }

}
