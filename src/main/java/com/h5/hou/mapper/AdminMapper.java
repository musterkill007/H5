package com.h5.hou.mapper;

import com.h5.hou.entity.Admin;
import org.mapstruct.Mapper;

@Mapper
public interface AdminMapper {
    int deleteByPrimaryKey(Integer adminId);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByAdminIdAndAdminPwd(Integer adminId,String adminPwd);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}