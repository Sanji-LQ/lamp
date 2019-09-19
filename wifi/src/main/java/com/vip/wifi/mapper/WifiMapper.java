package com.vip.wifi.mapper;

import com.vip.wifi.domain.entity.Wifi;

public interface WifiMapper {
    int deleteByPrimaryKey(Integer wifiId);

    int insert(Wifi record);

    Wifi selectByPrimaryKey(Integer wifiId);

}