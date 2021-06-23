package com.h5.hou.controller;

import com.h5.hou.entity.User;
import com.h5.hou.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(tags = "用户模块")
@RestController
@RequestMapping("/api/user")
@ResponseBody
public class UserController {
    @Resource
    public UserService userService;

    @ApiOperation(value = "登录")
    @GetMapping("/login")
    public User Login(int userId,String userPwd){return userService.selectByUserIdAndUserPwd(userId,userPwd);}

   @ApiOperation(value = "注册")
   @GetMapping("/register")
    public int Register(User record){
    return userService.insert(record);
    }
}
