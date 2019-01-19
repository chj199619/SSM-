package org.lanqiao.ssm.service.impl;

import org.lanqiao.ssm.mapper.UserMapper;
import org.lanqiao.ssm.pojo.Condition;
import org.lanqiao.ssm.pojo.User;
import org.lanqiao.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll(Condition condition) {
//        return userMapper.selectAllToList();
        List<User> userList = userMapper.selectAllToList(condition);
        return userList;
    }

    @Override
    public int getUserCount(Condition condition) {
        return userMapper.getUserCount(condition);
    }
}
