package com.fznsys.xiyou_full_platform.controller.Order;

import com.alibaba.fastjson.JSONObject;
import com.fznsys.xiyou_full_platform.pojo.Merchant;
import com.fznsys.xiyou_full_platform.service.MerchantService;
import com.fznsys.xiyou_full_platform.util.LayuiJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MerchantController {

    @Autowired
    MerchantService merchantService;

    @RequestMapping("/getmerchantlist")

    public JSONObject getlist(){
        return LayuiJSON.layuiJSON(merchantService.getlistAll());
    }
    @RequestMapping("/getmerchantById")
    public  Merchant getlist(String id){
        return merchantService.getMerchantById(id);
    }

    @RequestMapping("/insertmerchant")
    public List<Merchant> insertmerchant(Merchant merchant){
        return merchantService.insertMerchant(merchant);
    }
    @RequestMapping("/deletemerchantById")
    public List<Merchant> deletemerchant(String id){

        return merchantService.deleteMerchant(id);
    }
}
