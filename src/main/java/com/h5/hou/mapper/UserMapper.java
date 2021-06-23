package com.h5.hou.mapper;

import com.h5.hou.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByUserIdAndUserPwd(Integer userId,String userPwd);

}