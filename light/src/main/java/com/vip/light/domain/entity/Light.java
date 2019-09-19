package com.vip.light.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Light {
    /**
    * 设备编号
    */
    private Integer lightId;

    /**
    * 灯杆编号
    */
    private Integer lampId;

    /**
    * 设备编号
    */
    private String serialNumber;

    /**
    * 设备产家
    */
    private String equipmentManufacturer;

    /**
    * 设备型号
    */
    private String equipmentModel;

    /**
    * 出厂时间
    */
    private Date factoryTime;

    /**
    * 所在区域
    */
    private Object yourRegion;

    /**
    * 连接状态,1表示连接，0表示未连接
    */
    private Byte connectionStatus;

    /**
    * 创建时间
    */
    private Date creationTime;

    /**
    * 创建人
    */
    private String founder;
}