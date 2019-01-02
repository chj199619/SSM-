package org.lanqiao.ssm.mapper;

import org.lanqiao.ssm.pojo.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmpMapper {
    public Emp selectEmpById(Integer empNo);
    public List<Emp> selectAllToList();
    //删除数据
    public  void   deleteEmpById(Integer empno);
}
