package com.h5.hou.service;

import com.h5.hou.entity.Admin;

public interface AdminService {
    int deleteByPrimaryKey(Integer adminId);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByAdminIdAndAdminPwd(Integer adminId,String adminPwd);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}
