package com.vip.wifi.mapper;

import com.vip.wifi.domain.entity.WifiRecord;

public interface WifiRecordMapper {
    int deleteByPrimaryKey(Integer wrId);

    int insert(WifiRecord record);

    int insertSelective(WifiRecord record);

    WifiRecord selectByPrimaryKey(Integer wrId);

    int updateByPrimaryKeySelective(WifiRecord record);

    int updateByPrimaryKey(WifiRecord record);
}