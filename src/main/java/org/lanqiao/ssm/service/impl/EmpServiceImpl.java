package org.lanqiao.ssm.service.impl;

import org.lanqiao.ssm.mapper.EmpMapper;
import org.lanqiao.ssm.pojo.Emp;
import org.lanqiao.ssm.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpServiceImpl implements IEmpService {
    @Autowired
     EmpMapper empMapper;


    @Override
    @Transactional
    public Emp findEmpNById(Integer id) {
        return empMapper.selectEmpById(id);
    }

    @Override
    public List<Emp> findAll() {
        return empMapper.selectAllToList();
    }
}
