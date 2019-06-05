package com.fznsys.xiyou_full_platform.controller.User;

import com.alibaba.fastjson.JSONObject;
import com.fznsys.xiyou_full_platform.pojo.User;
import com.fznsys.xiyou_full_platform.service.UserService;
import com.fznsys.xiyou_full_platform.util.LayuiJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController // 声明这是Controller层

public class UserController {

    // 依赖注入
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)

    public User login(User user) {
        // 调用dao层
        return userService.LoginByUsernameAndPassword(user.getUsername(),user.getPassword());
//        System.out.println("前端" + user);
//        User u = userService.getUser(user.getUsername());
//        System.out.println("数据库" + u);
//        if (u.getPassword().equals(user.getPassword())) {
//            return u;
//        }
//        return null;
    }

    @RequestMapping(value = "/getUser")
     public JSONObject getAll() {
        ArrayList userList = userService.getAll();
        return LayuiJSON.layuiJSON(userList);
        /*JSONObject rootObject = new JSONObject();
        rootObject.put("code", 0);
        rootObject.put("msg", "");
        rootObject.put("count", 1000);
        rootObject.put("date",userList);
        return rootObject;*/
    }

    @RequestMapping(value = "/getUserById")

    public JSONObject getUserById(String id) {

        User user = userService.getUserById(id);

        return LayuiJSON.layuiJSON(user);
    }

    @RequestMapping(value = "/deleteUser")

    public String delete(String id) {
        User user = new User();
        user.setId(id);
        String msg = userService.delete(id);
        return msg;

    }

    @RequestMapping(value = "/updateUser")
    public ArrayList update(String id) {
        User user = new User();
        user.setId(id);
        user.setUsername("111");
        user.setPassword("111");
        user.setRole("www");
        ArrayList msg = userService.update(user);
        return msg;

    }

    @RequestMapping(value = "/insertUser")

    public String insert(User user) {
        String msg = "成功";
        userService.insert(user);

        return msg;

    }
}
