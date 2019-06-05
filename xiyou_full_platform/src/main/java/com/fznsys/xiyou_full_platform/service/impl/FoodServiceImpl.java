package com.fznsys.xiyou_full_platform.service.impl;

import com.fznsys.xiyou_full_platform.mapper.FoodMapper;
import com.fznsys.xiyou_full_platform.pojo.Food;
import com.fznsys.xiyou_full_platform.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    FoodMapper foodMapper;
    @Override
    public ArrayList<Food> getlistAll() {
        return foodMapper.select();
    }

    @Override
    public List<Food> insertfood(Food food) {
        return foodMapper.insert(food);
    }

    @Override
    public List<Food> deletefood(String id) {
        return foodMapper.delete(id);
    }

    @Override
    public Food getFoodById(String id) {
        return foodMapper.selectByFoodId(id);
    }
}
