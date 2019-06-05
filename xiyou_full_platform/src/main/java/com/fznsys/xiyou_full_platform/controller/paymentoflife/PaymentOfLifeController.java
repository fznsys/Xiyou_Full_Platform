package com.fznsys.xiyou_full_platform.controller.paymentoflife;

import com.alibaba.fastjson.JSONObject;
import com.fznsys.xiyou_full_platform.service.LifePaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * Author:朱中雨
 * Date:2019-6-5
 * Target:
 */
@Controller
public class PaymentOfLifeController {
    @Autowired
    private LifePaymentService lifePaymentService;

    @RequestMapping(value = "/getlifetest")
    @ResponseBody
    public JSONObject getlifetest()
    {
        ArrayList list = lifePaymentService.getLifePaymentByUserid("22");
        JSONObject rootObject = new JSONObject();
        rootObject.put("code", 0);
        rootObject.put("msg", "");
        rootObject.put("count", list.size());
        rootObject.put("data", list);

        return rootObject;
    }
}
