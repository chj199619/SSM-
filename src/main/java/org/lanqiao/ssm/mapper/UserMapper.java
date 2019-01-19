package org.lanqiao.ssm.mapper;

import org.lanqiao.ssm.pojo.Condition;
import org.lanqiao.ssm.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("UserMapper")
public interface UserMapper {
    //获取所有USER
    public List<User> selectAllToList(Condition condition);
    //查询用户总人数
    public int getUserCount(Condition condition);
}
