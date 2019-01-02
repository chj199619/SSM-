package org.lanqiao.ssm.controller;

import org.lanqiao.ssm.pojo.Emp;
import org.lanqiao.ssm.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
   IEmpService empService ;

    @RequestMapping("/queryEmp.do")
    public String  queryEmp(Integer empNo, Model model){
       Emp emp  =  empService.findEmpNById(empNo);
        model.addAttribute("emp",emp);
        return "success";
    }
    @RequestMapping("/queryAll.do")
    public String queryEmpAll(Model model){
       List<Emp> empList =  empService.findAll();
       model.addAttribute("empList" ,empList);
       return  "empList";
    }
}
