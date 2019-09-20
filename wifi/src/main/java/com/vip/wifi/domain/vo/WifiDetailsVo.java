package com.vip.wifi.domain.vo;

import com.vip.wifi.domain.entity.WifiDetails;
import com.vip.wifi.domain.entity.WifiMonitor;
import lombok.Data;

@Data
public class WifiDetailsVo extends WifiDetails {
    private WifiVo wifiVo;
    private WifiPropertiesVo wifiPropertiesVo;
    private WifiMonitor wifiMonitor;
}
