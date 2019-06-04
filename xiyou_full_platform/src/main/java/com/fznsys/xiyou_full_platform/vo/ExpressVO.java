package com.fznsys.xiyou_full_platform.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author:罗云继
 * @date 2019/6/4 12:13
 */
@Data
public class ExpressVO {

    private String id;

    /*@JsonProperty("userid")
    private String reciveid;*/

    @JsonProperty("telephone")
    private String phonenumber;

    @JsonProperty("username")
    private String recivename;

    @JsonProperty("company")
    private String company;

    @JsonProperty("address")
    private String address;

    @JsonProperty("num")
    private String expressnum;

    /*@JsonProperty("courierid")
    private String courierid;*/

    @JsonProperty("courier")
    private String couriername;

    @JsonProperty("status")
    private int express_status;


}
