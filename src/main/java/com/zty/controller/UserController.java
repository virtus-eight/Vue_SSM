package com.zty.controller;

import com.zty.domian.User;
import com.zty.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Autowired
    private IUserService iUserService;

    //@ResponseBody的作用  转换成json格式
    /**
     * 查询所有**/
    @RequestMapping("/findAll")
    public  List<User> findAll(){
        return iUserService.findAll();
    }
    /**
     * 查询根据ID**/
    @RequestMapping("/findById")
    public User findById(Integer id){
        return iUserService.findById(id);
    }
    /**
     * 更新**/
    @RequestMapping("/updateUser")
    public void updateUser(User user){
        iUserService.updateUser(user);
    }
}
