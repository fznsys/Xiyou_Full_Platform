package com.fznsys.xiyou_full_platform.service.impl;

import com.fznsys.xiyou_full_platform.pojo.Express;
import com.fznsys.xiyou_full_platform.service.ExpressService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * @author:罗云继
 * @date 2019/6/4 12:42
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ExpressServiceImplTest {

    @Autowired
    private ExpressService expressService;
    @Test
    public void findAll() {
        ArrayList<Express> serviceAll = expressService.findAll();
        System.out.println(serviceAll.toString());
    }
}