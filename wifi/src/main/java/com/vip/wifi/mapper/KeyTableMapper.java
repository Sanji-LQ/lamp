package com.vip.wifi.mapper;

import com.vip.wifi.domain.entity.KeyTable;import com.vip.wifi.domain.vo.KeyTableVo;import org.apache.ibatis.annotations.Param;import java.util.List;

public interface KeyTableMapper {
    List<KeyTableVo> selectValue(@Param("wifiId") Integer wifiId);

    List<KeyTableVo> selectValues(@Param("wifiPropertiesId") Integer wifiPropertiesId);
}