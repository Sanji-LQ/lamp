package com.vip.wifi.mapper;

import com.vip.wifi.domain.entity.WifiProperties;
import com.vip.wifi.domain.vo.WifiPropertiesVo;
import org.apache.ibatis.annotations.Param;

public interface WifiPropertiesMapper {

    int insert(@Param("wifiId") Integer wifiId);

    WifiPropertiesVo selectByPrimaryKey(@Param("wifiId") Integer wifiId);

    int updateByPrimaryKey(WifiProperties record);

}