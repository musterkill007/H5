package com.h5.hou.controller;

import com.h5.hou.entity.Admin;
import com.h5.hou.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(tags = "管理员模块")
@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Resource
    public AdminService adminService;

    @ApiOperation(value = "管理员登录")
    @GetMapping("/login")
    public Admin Login(int adminId,String adminPwd){return adminService.selectByAdminIdAndAdminPwd(adminId,adminPwd); }

}
