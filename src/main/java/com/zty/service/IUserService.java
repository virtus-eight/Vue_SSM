package com.zty.service;

import com.zty.domian.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 用户的业务层接口**/
public interface IUserService {
    List<User> findAll();
    User findById(Integer userId);
    void updateUser(User user);
}
