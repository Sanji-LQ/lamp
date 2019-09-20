package com.vip.wifi.domain.entity;

import lombok.Data;

@Data
public class WifiProperties {
    /**
    * wifi属性主键id
    */
    private Integer wifiPropertiesId;

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

    private Integer wifiId;

    private String keyValueId;

    private Integer speedLimit;
}