package com.fznsys.xiyou_full_platform.controller.order;

import com.alibaba.fastjson.JSONObject;
import com.fznsys.xiyou_full_platform.pojo.Order;
import com.fznsys.xiyou_full_platform.service.OrderService;
import com.fznsys.xiyou_full_platform.util.LayuiJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;


    @RequestMapping("/getorderlist")
    public JSONObject getlist(){

        return LayuiJSON.layuiJSON( orderService.getlistAll());

    }
    @RequestMapping("/getorderById")
    public  Order getlist(String id){
        return orderService.getOrderById(id);
    }

    @RequestMapping("/insertorder")
    public List<Order> insertorder(Order order){
        return orderService.insertorder(order);
    }
    @RequestMapping("/deleteorderById")
    public List<Order> deleteorder(String id){
        return orderService.deleteorder(id);
    }

}
