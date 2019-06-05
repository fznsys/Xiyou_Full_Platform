package com.fznsys.xiyou_full_platform.controller;

import com.fznsys.xiyou_full_platform.convert.ExpressForm2ExpressConvert;
import com.fznsys.xiyou_full_platform.enums.ResultEnum;
import com.fznsys.xiyou_full_platform.expection.ExpressException;
import com.fznsys.xiyou_full_platform.form.ExpressForm;
import com.fznsys.xiyou_full_platform.pojo.Express;
import com.fznsys.xiyou_full_platform.pojo.User;
import com.fznsys.xiyou_full_platform.service.ExpressService;
import com.fznsys.xiyou_full_platform.service.UserService;
import com.fznsys.xiyou_full_platform.vo.ExpressVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;

/**
 * @author:罗云继
 * @date 2019/6/4 10:56
 */
@RestController
@RequestMapping("/express")
@Slf4j
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

    @RequestMapping("/insert")
    public void insertExpress(@Valid ExpressForm expressForm, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            log.error("[创建订单] 参数不正确");
            throw new ExpressException(ResultEnum.PARAM_ERROR.getCode(),bindingResult.getFieldError().getDefaultMessage());
        }
        Express express = ExpressForm2ExpressConvert.convert(expressForm);

        expressService.addExpress(express);
    }
}
