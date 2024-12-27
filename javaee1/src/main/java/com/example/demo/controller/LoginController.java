package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
                        @RequestParam("userroleID") Integer userroleID, Model model) {
        User user = userService.getUserByUsernameAndPassword(username, password, userroleID);

        // 检查用户是否为空或者用户角色是否匹配
        if (user != null && user.getUserroleID() != null && user.getUserroleID() == userroleID) {
            return "redirect:/success";
        } else {
            model.addAttribute("error", "Invalid username, password, or role");
            return "login";
        }
    }

    // 新增注册用户的Controller方法
    @PostMapping("/register")
    public String register(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("userroleID") Integer userroleID, Model model) {
        if (userroleID == 1) { // 禁止注册为管理员
            model.addAttribute("error", "Registration as an administrator is not allowed");
            return "register";
        }
        int a = userService.getUserWithMaxUserId().getUserId()+1;
        int result = userService.registerUser(a,username, password, userroleID);
        if (result > 0) {
            return "redirect:/login";
        } else {
            model.addAttribute("error", "Registration failed");
            return "register";
        }
    }

    @GetMapping("/register")
    public String register(Model model) {
        return "register";
    }
    @GetMapping("/success")
    public String success() {
        return "success";
    }
}