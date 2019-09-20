package com.vip.wifi.mapper;

import com.vip.wifi.domain.entity.WifiDetails;
import com.vip.wifi.domain.vo.WifiDetailsVo;

public interface WifiDetailsMapper {
    int deleteByPrimaryKey(Integer wdId);

    int insert(WifiDetails record);

    int insertSelective(WifiDetails record);
    //查询详情
    WifiDetailsVo selectByPrimaryKey(Integer wdId);

    int updateByPrimaryKeySelective(WifiDetails record);

    int updateByPrimaryKey(WifiDetails record);
}