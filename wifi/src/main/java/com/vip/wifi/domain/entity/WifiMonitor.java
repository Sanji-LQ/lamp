package com.vip.wifi.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class WifiMonitor {
    /**
    * 主键id
    */
    private Integer wmId;

    /**
    * 当前时间
    */
    private Date currentTime;

    /**
    * 下行速率
    */
    private Integer downStreamRate;

    /**
    * 当前接入人数
    */
    private Integer currentAccessQuantity;

    /**
    * 上行速率
    */
    private Integer upLinkRate;
}