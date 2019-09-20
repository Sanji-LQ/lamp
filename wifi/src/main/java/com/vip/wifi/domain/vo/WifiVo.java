package com.vip.wifi.domain.vo;

import com.vip.wifi.domain.entity.Wifi;
import lombok.Data;

import java.util.List;

@Data
public class WifiVo extends Wifi {
    List<KeyTableVo> keyTableVoList;
}
