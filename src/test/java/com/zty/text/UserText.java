package com.zty.text;

import com.zty.domian.User;
import com.zty.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 用户的业务层测试**/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:applicationContext.xml")
public class UserText {
    @Autowired
    private IUserService iUserService;
    @Test
    public void testfindall(){
        List<User> users = iUserService.findAll();
        System.out.println(users);
    }
    @Test
    public void testfindById(){
        User userbyid = iUserService.findById(1);
        System.out.println(userbyid);
    }
    @Test
    public void testUpdate(){
        User user = iUserService.findById(1);
        System.out.println("修改之前的用户："+user);
        user.setAge(55);
        iUserService.updateUser(user);
        System.out.println(iUserService.findById(1));
    }
}
