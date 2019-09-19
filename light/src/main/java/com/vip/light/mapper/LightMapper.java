package com.vip.light.mapper;

import com.vip.light.domain.entity.Light;

public interface LightMapper {
    int deleteByPrimaryKey(Integer lightId);

    int insert(Light record);

    int insertSelective(Light record);

    Light selectByPrimaryKey(Integer lightId);

    int updateByPrimaryKeySelective(Light record);

    int updateByPrimaryKey(Light record);
}