package com.vip.wifi.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class WifiProperties {
    /**
    * wifi属性主键id
    */
    private Integer wifiPropertiesId;

    /**
    * 信道
    */
    private String channelValue;

    /**
    * 验证方式:
    1表示开启
    2表示关闭
    */
    private Integer waysOfIdentifying;

    /**
    * 密码

    */
    private String password;

    /**
    * 开启时间
    */
    private Date openingTime;

    /**
    * 关闭时间
    */
    private Date closeTime;

    private Integer wifiId;
}