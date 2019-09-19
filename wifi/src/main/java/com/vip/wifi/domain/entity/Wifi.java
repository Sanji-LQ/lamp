package com.vip.wifi.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Wifi {
    /**
    * wifi设备编号

    */
    private Integer wifiId;

    /**
    * 灯杆编号外键
    */
    private Integer lampId;

    /**
    * 所在区域
    */
    private String yourRegion;

    /**
    * 1表示在线
      2表示异常
    */
    private Integer connectionStatus;

    /**
    * 1表示开启
      2表示关闭
    */
    private Integer wirelessStatus;

    /**
    * 设备厂家
    */
    private String equipmentManufacturer;

    /**
    * 序列号
    */
    private String serialNumber;

    /**
    * 设备型号
    */
    private String equipmentModel;

    /**
    * 出厂时间
    */
    private Date factoryTime;

    /**
    * 创建时间
    */
    private Date creationTime;

    /**
    * 创建人
    */
    private String founder;

    /**
    * 1表示可用
      2表示报废
    */
    private Integer isDelete;
}