package com.vip.wifi.mapper;

import com.vip.wifi.domain.entity.WifiProperties;

public interface WifiPropertiesMapper {
    int deleteByPrimaryKey(Integer wifiPropertiesId);

    int insert(WifiProperties record);

    int insertSelective(WifiProperties record);

    WifiProperties selectByPrimaryKey(Integer wifiPropertiesId);

    int updateByPrimaryKeySelective(WifiProperties record);

    int updateByPrimaryKey(WifiProperties record);
}