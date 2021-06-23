package com.h5.hou.service.serviceImpl;

import com.h5.hou.entity.Admin;
import com.h5.hou.mapper.AdminMapper;
import com.h5.hou.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    public AdminMapper adminMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer adminId) {
        return adminMapper.deleteByPrimaryKey(adminId);
    }

    @Override
    public int insert(Admin record) {
        return adminMapper.insert(record);
    }

    @Override
    public int insertSelective(Admin record) {
        return 0;
    }

    @Override
    public Admin selectByAdminIdAndAdminPwd(Integer adminId,String adminPwd) {
        return adminMapper.selectByAdminIdAndAdminPwd(adminId,adminPwd);
    }

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return 0;
    }
}
