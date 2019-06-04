package com.fznsys.xiyou_full_platform.service.impl;

import com.fznsys.xiyou_full_platform.mapper.UserMapper;
import com.fznsys.xiyou_full_platform.pojo.User;
import com.fznsys.xiyou_full_platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@CacheConfig(cacheNames = "user", cacheManager = "cacheManager")
@Service
public class UserServiceImpl implements UserService {
    // 依赖注入
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(String username) {

        return userMapper.findByUsername(username);
    }

    @Override

    @Cacheable()
    public User getUserById(Integer id) {
        System.out.println("getUserByIdService");
        return userMapper.findById(id);
    }

    @Override
    @Cacheable()
    public ArrayList<User> getAll() {
        System.out.println("Redis中无此数据");
        return userMapper.findAll();
    }

    @Override
    @CachePut(key = "#user.id")

    public ArrayList<User> update(User user) {
        System.err.println("执行这里，更新数据库，更新缓存....");
        userMapper.update(user);
        ArrayList<User> userArrayList = userMapper.findAll();

        return userArrayList;

    }

    @Override
    @CacheEvict(key = "#id")
    public String delete(Integer id) {
        User user = new User();
        user.setId(id);
        String msg = userMapper.delete(user);

        return "成功";

    }

    @Override
    public String insert(User user) {
        userMapper.insert(user);

        return "成功";

    }

    @Override
    public User LoginByUsernameAndPassword(String username, String password) {
        return userMapper.LoginByUsernameAndPassword(username,password);
    }
}
