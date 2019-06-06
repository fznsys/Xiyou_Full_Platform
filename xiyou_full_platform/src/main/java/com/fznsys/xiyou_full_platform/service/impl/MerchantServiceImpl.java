package com.fznsys.xiyou_full_platform.service.impl;

import com.fznsys.xiyou_full_platform.mapper.MerchantMapper;
import com.fznsys.xiyou_full_platform.pojo.Merchant;
import com.fznsys.xiyou_full_platform.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MerchantServiceImpl implements MerchantService {
    @Autowired
    MerchantMapper merchantMapper;
    @Override
    public ArrayList<Merchant> getlistAll() {
        return merchantMapper.select();
    }

    @Override
    public List<Merchant> insertMerchant(Merchant merchant) {
        return merchantMapper.insert(merchant);
    }

    @Override
    public List<Merchant> deleteMerchant(String id) {
        return merchantMapper.delete(id);
    }



    @Override
    public Merchant getMerchantById(String id) {
        return merchantMapper.selectByMerchantId(id);
    }
}