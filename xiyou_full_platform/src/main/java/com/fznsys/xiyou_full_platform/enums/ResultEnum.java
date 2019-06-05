package com.fznsys.xiyou_full_platform.enums;

import lombok.Getter;

/**
 * @author:罗云继
 * @date 2019/6/5 10:30
 */
@Getter
public enum  ResultEnum {

    PARAM_ERROR(1,"参数不正确"),


    ;
    private Integer code;

    private String message;

    ResultEnum(Integer code,String message){
        this.code=code;
        this.message=message;
    }
}
