package com.vip.wifi.mapper;

import com.vip.wifi.domain.entity.WifiMonitor;

public interface WifiMonitorMapper {
    int deleteByPrimaryKey(Integer wmId);

    int insert(WifiMonitor record);

    int insertSelective(WifiMonitor record);

    WifiMonitor selectByPrimaryKey(Integer wmId);

    int updateByPrimaryKeySelective(WifiMonitor record);

    int updateByPrimaryKey(WifiMonitor record);
}