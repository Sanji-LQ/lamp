package com.vip.wifi.service;

import com.vip.wifi.common.Result;
import com.vip.wifi.domain.entity.Wifi;
import com.vip.wifi.domain.vo.WifiVo;

public interface WifiService {
    //查询无线设备首页
    WifiVo selectByPrimaryKey(Integer wifiId);
    //报废无线设备
    int deleteByPrimaryKey(Integer wifiId);
    //新增设备
    int insert(Wifi record);
}
