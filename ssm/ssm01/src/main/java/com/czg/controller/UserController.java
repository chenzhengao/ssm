package com.czg.controller;

import com.czg.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @program: ssm
 * @description:
 * @author: czg
 * @create: 2019-10-06 20:35
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource(name="userService")
    private UserService userService;



    @RequestMapping("/allUser")
    public String getAllUsers(Model model){
        model.addAttribute("userList",userService.getUsers());
        return "all";
    }
}
