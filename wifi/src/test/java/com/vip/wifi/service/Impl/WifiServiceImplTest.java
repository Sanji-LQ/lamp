package com.vip.wifi.service.Impl;

import com.vip.wifi.domain.entity.Wifi;
import com.vip.wifi.domain.entity.WifiProperties;
import com.vip.wifi.mapper.KeyTableMapper;
import com.vip.wifi.mapper.WifiMapper;
import com.vip.wifi.mapper.WifiPropertiesMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class WifiServiceImplTest {
    @Resource
    WifiMapper wifiMapper;
    @Resource
    KeyTableMapper keyTableMapper;
    @Resource
    WifiPropertiesMapper wifiPropertiesMapper;


    @Test
    public void insert() {
        Wifi wifi=new Wifi();
        wifi.setEquipmentManufacturer("11");
        wifi.setEquipmentModel("11");
        wifi.setSerialNumber("1");
        wifi.setLampId(2);
        wifiMapper.insert(wifi);
        WifiProperties wifiProperties=new WifiProperties();
        wifiProperties.setWifiId(wifi.getWifiId());
    }
}