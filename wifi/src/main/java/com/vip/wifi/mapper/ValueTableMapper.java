package com.vip.wifi.mapper;

import com.vip.wifi.domain.entity.ValueTable;

public interface ValueTableMapper {
    int deleteByPrimaryKey(Integer vid);

    int insert(ValueTable record);

    int insertSelective(ValueTable record);

    ValueTable selectByPrimaryKey(Integer vid);

    int updateByPrimaryKeySelective(ValueTable record);

    int updateByPrimaryKey(ValueTable record);
}