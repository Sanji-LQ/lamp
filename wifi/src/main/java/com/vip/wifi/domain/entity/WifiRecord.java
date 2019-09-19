package com.vip.wifi.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class WifiRecord {
    /**
    * 序号
    */
    private Integer wrId;

    private Integer wifiId;

    /**
    * 运行时间
    */
    private Date runtime;

    private Integer wmId;
}