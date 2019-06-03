package com.fznsys.xiyou_full_platform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
    @RequestMapping("/index")
    public String index()
    {
        return "index";
    }
}
