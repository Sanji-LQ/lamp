package com.vip.wifi.mapper;

import com.vip.wifi.domain.entity.WifiProperties;
import org.apache.ibatis.annotations.Param;

public interface WifiPropertiesMapper {

    int insert(@Param("wifiId") Integer wifiId);

    WifiProperties selectByPrimaryKey(@Param("lampId") Integer lampId,@Param("wifiId") Integer wifiId,@Param("valueId")String valueId);

    int updateByPrimaryKey(WifiProperties record);

}