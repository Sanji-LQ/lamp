package com.vip.wifi.mapper;

import com.vip.wifi.domain.entity.WifiDetails;

public interface WifiDetailsMapper {
    int deleteByPrimaryKey(Integer wdId);

    int insert(WifiDetails record);

    int insertSelective(WifiDetails record);

    WifiDetails selectByPrimaryKey(Integer wdId);

    int updateByPrimaryKeySelective(WifiDetails record);

    int updateByPrimaryKey(WifiDetails record);
}