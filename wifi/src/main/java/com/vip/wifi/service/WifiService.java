package com.vip.wifi.service;

import com.vip.wifi.common.Result;
import com.vip.wifi.domain.entity.Wifi;
import com.vip.wifi.domain.entity.WifiDetails;
import com.vip.wifi.domain.entity.WifiProperties;
import com.vip.wifi.domain.vo.WifiDetailsVo;
import com.vip.wifi.domain.vo.WifiPropertiesVo;
import com.vip.wifi.domain.vo.WifiVo;
import org.apache.ibatis.annotations.Param;

public interface WifiService {
    //查询无线设备首页
    WifiVo selectByPrimaryKey(Integer wifiId);
    //报废无线设备
    int deleteByPrimaryKey(Integer wifiId);
    //新增设备
    int insert(Wifi record);
    //设置设备
    int updateByPrimaryKey(WifiProperties record);
    //查询详情
    WifiDetailsVo selectByDetails(Integer wdId);
    //查询属性
    WifiPropertiesVo selectByProper(@Param("wifiId") Integer wifiId);

}
