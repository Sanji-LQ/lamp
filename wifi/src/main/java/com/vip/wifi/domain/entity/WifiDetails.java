package com.vip.wifi.domain.entity;

import lombok.Data;

@Data
public class WifiDetails {
    private Integer wdId;

    private Integer wifiId;

    private Integer wmId;

    private Integer wifiPropertiesId;

    /**
    * 1表示正在使用
      2表示失效
    */
    private Integer isDelete;
}