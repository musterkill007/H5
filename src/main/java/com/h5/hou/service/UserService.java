package com.h5.hou.service;


import com.h5.hou.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    int insert(User record);

    int insertSelective(User record);

    User selectByUserIdAndUserPwd(Integer userId,String userPwd);
}
