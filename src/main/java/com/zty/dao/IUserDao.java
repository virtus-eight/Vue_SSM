package com.zty.dao;

import com.zty.domian.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 用户持久层接口**/
public interface IUserDao {
    /**
     * 查询用户列表**/
    @Select("select* from user")
    List<User> findAll();
    /**
     * 根据ID查询用户**/
    @Select("select * from user where id=#{userId}")
    User findById(Integer userId);
    /**
     * 修改**/
    @Update("update user set username=#{username},password=#{password},age=#{age},sex=#{sex},email=#{email} where id=#{id}")
    void updateUser(User user);
}
