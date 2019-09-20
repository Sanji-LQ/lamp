package com.vip.wifi.mapper;

import com.vip.wifi.domain.entity.Lamp;

public interface LampMapper {
    int deleteByPrimaryKey(Integer lampId);

    int insert(Lamp record);

    int insertSelective(Lamp record);

    Lamp selectByPrimaryKey(Integer lampId);

    int updateByPrimaryKeySelective(Lamp record);

    int updateByPrimaryKey(Lamp record);
}