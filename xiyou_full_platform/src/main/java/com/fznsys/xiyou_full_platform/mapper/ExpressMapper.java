package com.fznsys.xiyou_full_platform.mapper;

import com.fznsys.xiyou_full_platform.pojo.Express;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


/**
 * @author:罗云继
 * @date 2019/6/4 9:46
 */
@Mapper
@Repository
public interface ExpressMapper {
    /**查询所有快递单*/
    @Select("select * from tb_express")
    ArrayList<Express> findAll();

    /**查看已取货的快递*/
    @Select("select * from tb_express where express_status=1")
    ArrayList<Express> findAlreadyTakenExpress();

    /**查看已取货的快递*/
    @Select("select * from tb_express where express_status=1")
    ArrayList<Express> findNotTakenExpress();

    /**查询单个快递*/
    @Select("select * from tb_express where num=#{num}")
    Express findExpressByNum(String num);

//    /**下单后，修改快递状态*/
//    @Update("update tb_express set status=1,")
//    void updateExpress(Express express,@Param("couriername") String courier);

    /**新增快递单*/
    @Insert("insert into tb_express values(#{id},#{telephone},#{num},#{company},#{adress},#{express_status},#{courier},#{express_id})")
    void addExpress(Express express);

    /**删除快递单*/
    @Delete("delete from tb_express where num=#{num}")
    void deleteExpress(Express express);
}