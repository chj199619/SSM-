package org.lanqiao.ssm.service;

import org.lanqiao.ssm.pojo.Emp;

import java.util.List;

public interface IEmpService {
    public Emp findEmpNById(Integer id);
    public List<Emp> findAll();
}
