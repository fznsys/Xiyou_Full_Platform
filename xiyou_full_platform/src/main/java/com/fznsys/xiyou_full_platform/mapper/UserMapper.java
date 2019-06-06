package com.fznsys.xiyou_full_platform.mapper;

import com.fznsys.xiyou_full_platform.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository("userMapper")
public interface UserMapper {

    @Select("select * from tb_user_user where username=#{username} and password=md5(#{password})")
    User LoginByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    @Select("  SELECT * FROM tb_user_user WHERE username = #{username}")
    User findByUsername(String username);

    @Select(" SELECT * FROM tb_user_user")
    ArrayList<User> findAll();

    @Select("select * from tb_user_user where id=#{id}")
    User findById(String id);

    @Update("update tb_user_user set username = #{username}, password = #{password}, role=#{role}  where id = #{id}")
    void update(User user);

    @Delete("delete from tb_user_user where  id=#{id,jdbcType=INTEGER}")
    String delete(User user);

    @Insert("insert into tb_user_user(username, password, role) values (#{username},#{password},#{role})")
    String insert(User user);

}
