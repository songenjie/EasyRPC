package com.github.yeecode.easyrpc.client.controller;

import com.github.yeecode.easyrpc.client.remoteservice.SchoolService;
import com.github.yeecode.easyrpc.client.remoteservice.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private UserService userService;
    @Autowired
    private SchoolService schoolService;

    @RequestMapping("/getUserCount")
    public String getUserCount() {
        System.out.println("songenjie getUserCount");
        Integer userCount = userService.getUserCount();
        System.out.println("songenjie "+ userCount.toString());
        return userCount.toString();
    }

    @RequestMapping("/getUserInfo")
    public String getUserInfo() {
        System.out.println("songenjie getUserInfo");
        String userInfo = userService.getUserInfo(1);
        System.out.println("songenjie "+ userInfo.toString());
        return userInfo;
    }

    @RequestMapping("/addUser")
    public String addUser() {
        System.out.println("songenjie addUser");
        Integer userId = userService.addUser("name", "abc@gmail.com", 16, 0, "Garden School");
        System.out.println("songenjie "+ userId.toString());
        return userId.toString();
    }

    @RequestMapping("/querySchoolName")
    public String querySchoolName() {
        System.out.println("songenjie querySchoolName");
        return schoolService.querySchoolName(5);
    }
}