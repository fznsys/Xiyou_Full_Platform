package com.fznsys.xiyou_full_platform.controller.order;

import com.alibaba.fastjson.JSONObject;
import com.fznsys.xiyou_full_platform.pojo.Food;
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
        List<Order> orders= orderService.getlistAll();
        String a=null;
        for (int i=0;i<orders.size();i++){

            a=a+"+"+orders.get(i).getId();
        }
        System.out.println(a);
        JSONObject jsonObject=LayuiJSON.layuiJSON( orderService.getlistAll());
        //jsonObject.put("data2",a);
        System.out.println(jsonObject);
        return jsonObject;


    }
    @RequestMapping("/getorderById")
    public  Order getlist(String id){
        return orderService.getOrderById(id);
    }

    @RequestMapping("/insertorder")
    public void insertorder(String data){
    String a[]=data.split("-");
    for (int i=0;i<a.length;i++){
        System.out.println(a[i]);
        orderService.insertorder(a[i]);
    }


    }
    @RequestMapping("/deleteorderById")
    public List<Order> deleteorder(String id){
        return orderService.deleteorder(id);
    }

}
