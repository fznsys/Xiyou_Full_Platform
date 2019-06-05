package com.fznsys.xiyou_full_platform.service.impl;

import com.fznsys.xiyou_full_platform.mapper.OrderMapper;
import com.fznsys.xiyou_full_platform.pojo.Order;
import com.fznsys.xiyou_full_platform.pojo.OrderFood;
import com.fznsys.xiyou_full_platform.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@CacheConfig(cacheNames = "order", cacheManager = "cacheManager")
@Service
public class OrderServiceImpl implements OrderService {
   @Autowired
   OrderMapper orderMapper;


    @Override
    @Cacheable()
    public ArrayList<Order> getlistAll() {
        return orderMapper.findAll();
    }

    @Override

    public List<Order> insertorder(Order order) {
        return orderMapper.insert(order);
    }

    @Override
    public List<Order> insertorder(OrderFood orderfood) {
        return null;
    }

    @Override
    @CacheEvict(key = "#id")
    public List<Order> deleteorder(String id) {
        return orderMapper.delete(id);
    }
    @Override
    @CacheEvict(key = "#id")
    public Order getOrderById(String id) {
        return orderMapper.selectById(id);
    }
}
