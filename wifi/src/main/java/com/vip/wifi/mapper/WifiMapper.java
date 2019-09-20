package com.vip.wifi.mapper;

import com.vip.wifi.domain.entity.Wifi;
import com.vip.wifi.domain.vo.WifiVo;
import org.apache.ibatis.annotations.Param;

public interface WifiMapper {
    int deleteByPrimaryKey(Integer wifiId);

    int insert(@Param("wifi") Wifi record);

    WifiVo selectByPrimaryKey(Integer wifiId);

}