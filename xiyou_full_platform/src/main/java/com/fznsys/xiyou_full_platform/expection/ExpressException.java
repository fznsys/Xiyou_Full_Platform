package com.fznsys.xiyou_full_platform.expection;

import com.fznsys.xiyou_full_platform.enums.ResultEnum;

/**
 * @author:罗云继
 * @date 2019/6/5 10:28
 */
public class ExpressException extends RuntimeException{
    private Integer code;

    public ExpressException(ResultEnum resultEnum){
        super(resultEnum.getMessage());

        this.code=resultEnum.getCode();
    }
    public ExpressException(Integer code,String message){
        super(message);
        this.code=code;
    }
}
