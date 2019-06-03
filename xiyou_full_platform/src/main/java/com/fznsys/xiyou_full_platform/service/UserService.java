package com.fznsys.xiyou_full_platform.service;


import com.fznsys.xiyou_full_platform.pojo.User;

import java.util.ArrayList;

public interface UserService {
    User getUser(String username);
    ArrayList<User> getAll();
    ArrayList<User>  update(User user);
    String delete(Integer id);

    String insert(User user);

    User getUserById(Integer id);
}


