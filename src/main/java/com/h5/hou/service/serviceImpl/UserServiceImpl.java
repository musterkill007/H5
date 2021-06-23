package com.h5.hou.service.serviceImpl;

import com.h5.hou.entity.User;
import com.h5.hou.mapper.UserMapper;
import com.h5.hou.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    public UserMapper usermapper;

    @Override
    public int insert(User record) {
        return usermapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return usermapper.insertSelective(record);
    }

    @Override
    public User selectByUserIdAndUserPwd(Integer userId, String userPwd) {
        return usermapper.selectByUserIdAndUserPwd(userId,userPwd);
    }
}
