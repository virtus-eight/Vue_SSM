package com.zty.service.Imp;

import com.zty.dao.IUserDao;
import com.zty.domian.User;
import com.zty.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserServiceImp implements IUserService {
    @Autowired
    private IUserDao iUserDao;
    @Override
    public List<User> findAll() {
        return iUserDao.findAll();
    }

    @Override
    public User findById(Integer userId) {
        return iUserDao.findById(userId);
    }

    @Override
    public void updateUser(User user) {
        iUserDao.updateUser(user);
    }
}
