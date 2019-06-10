package com.fznsys.xiyou_full_platform.mapper;

import com.fznsys.xiyou_full_platform.pojo.Merchant;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository("mechantmapper")
public interface MerchantMapper {

    @Select(" SELECT * FROM tb_takeout_merchant")
    ArrayList<Merchant> select();

    @Insert(" insert into tb_takeout_merchant  values (#{Merchant})")
    ArrayList<Merchant> insert(Merchant merchant);

    @Delete("delete from tb_takeout_merchant where id=#{id}")
    void  delete(String id);

    @Select(" SELECT * FROM tb_takeout_merchant where id=#{id}")
    Merchant selectByMerchantId(String id);
}
