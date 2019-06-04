package com.fznsys.xiyou_full_platform.controller;

import com.fznsys.xiyou_full_platform.pojo.Express;
import com.fznsys.xiyou_full_platform.service.ExpressService;
import com.fznsys.xiyou_full_platform.vo.ExpressVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author:罗云继
 * @date 2019/6/4 10:56
 */
@RestController
@RequestMapping("/express")
public class ExpressController {

    @Autowired
    private ExpressService expressService;

    @RequestMapping("/findAll")
    public ArrayList<ExpressVO> findAll(){

        ArrayList<Express> expressArrayList = expressService.findAll();
        System.out.println(expressArrayList.toString());
        ArrayList<ExpressVO> expressVOArrayList=new ArrayList<>();
        for (Express express : expressArrayList) {
            ExpressVO expressVO = new ExpressVO();
            BeanUtils.copyProperties(express,expressVO);
            expressVOArrayList.add(expressVO);
        }

        return expressVOArrayList;
    }


}
