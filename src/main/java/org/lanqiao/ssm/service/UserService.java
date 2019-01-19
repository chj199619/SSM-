package org.lanqiao.ssm.service;

import org.lanqiao.ssm.pojo.Condition;
import org.lanqiao.ssm.pojo.User;

import java.util.List;

public interface UserService {
    //查询所有
    public List<User> findAll(Condition condition);
    //获取总数
    public int getUserCount(Condition condition);
}
