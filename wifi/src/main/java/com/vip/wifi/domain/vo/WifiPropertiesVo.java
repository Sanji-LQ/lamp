package com.vip.wifi.domain.vo;


import com.vip.wifi.domain.entity.WifiProperties;
import lombok.Data;

import java.util.List;

@Data
public class WifiPropertiesVo extends WifiProperties {
    List<KeyTableVo> keyTableVoList;
}
