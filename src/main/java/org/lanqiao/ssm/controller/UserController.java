package org.lanqiao.ssm.controller;

import org.lanqiao.ssm.pojo.Condition;
import org.lanqiao.ssm.pojo.User;
import org.lanqiao.ssm.service.UserService;
import org.lanqiao.ssm.utils.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService ;
//    @RequestMapping("/aa.do")
//    public String queryUserAll(Model model){
//       List<User> userList =  userService.findAll();
//       model.addAttribute("userList",userList);
//        System.out.println(userList.size());
//       return  "userList";
//
//
//    }
@RequestMapping("/aa.do")
public ModelAndView getUserList(HttpServletRequest request){
    int pageSize = 2;
    int pageNum = 1;
    if(!StringUtils.isEmpty(request.getParameter("currentPage"))){
        pageNum = Integer.valueOf(request.getParameter("currentPage"));
    }
    Condition condition = Condition.builder().build();
    System.out.println(condition+"============");
    int totalRecords = userService.getUserCount(condition);
    System.out.println("用户总人数"+totalRecords+"用户总人数");
    PageModel pm = new PageModel(pageNum,totalRecords,pageSize);
    System.out.println(pm+"pageNum,totalRecords,pageSize");
//    if("add".equals(mark)){
//        pageNum = pm.getEndPage();
//    }else if("update".equals(mark)){
//        pageNum = Integer.valueOf(request.getParameter("currentPage"));
//    }else{
        //如果当前页大于总页数，但是排除查询不到数据的情况。当前页等于最大页
        if(pageNum > pm.getTotalPageNum() && pm.getTotalPageNum() != 0){
            pageNum = pm.getTotalPageNum();
        }
//    }
    PageModel pageModel = new PageModel(pageNum,totalRecords,pageSize);
    //分页
    condition.setPageSize(pageSize);
    condition.setCurrentPage(pageModel.getStartIndex());
    System.out.println(condition);
    List<User> userList = userService.findAll(condition);
    System.out.println("-----------"+userList);
    ModelAndView mv = new ModelAndView();
    mv.addObject("userList",userList);
    mv.addObject("pm",pageModel);
    mv.addObject("condition",condition);
    mv.addObject("currentPage",pageNum);

    mv.setViewName("userList");
    return mv;
}
}
