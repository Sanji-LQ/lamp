package com.vip.wifi.service.Impl;

import com.vip.wifi.common.ErrorResult;
import com.vip.wifi.common.Result;
import com.vip.wifi.common.SuccessResult;
import com.vip.wifi.domain.entity.Wifi;
import com.vip.wifi.domain.entity.WifiDetails;
import com.vip.wifi.domain.entity.WifiMonitor;
import com.vip.wifi.domain.entity.WifiProperties;
import com.vip.wifi.domain.vo.KeyTableVo;
import com.vip.wifi.domain.vo.WifiDetailsVo;
import com.vip.wifi.domain.vo.WifiPropertiesVo;
import com.vip.wifi.domain.vo.WifiVo;
import com.vip.wifi.mapper.*;
import com.vip.wifi.service.WifiService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WifiServiceImpl implements WifiService {
    @Resource
    WifiMapper wifiMapper;
    @Resource
    KeyTableMapper keyTableMapper;
    @Resource
    WifiPropertiesMapper wifiPropertiesMapper;
    @Resource
    WifiDetailsMapper wifiDetailsMapper;
    @Resource
    WifiMonitorMapper wifiMonitorMapper;

    @Override
    public WifiVo selectByPrimaryKey(Integer wifiId) {
        if(wifiId>0){
            WifiVo wifi = wifiMapper.selectByPrimaryKey(wifiId);
            List<KeyTableVo> keyTableVos = keyTableMapper.selectValue(wifiId);
            wifi.setKeyTableVoList(keyTableVos);
            return wifi;
        }
        return null;
    }

    @Override
    public int deleteByPrimaryKey(Integer wifiId) {
        if (wifiId>0) {
            return wifiMapper.deleteByPrimaryKey(wifiId);
        }
        return 0;
    }

    @Override
    public int insert(Wifi record) {
        if (record!=null){
            int insert = wifiMapper.insert(record);
            wifiPropertiesMapper.insert(record.getWifiId());
            return insert;
        }
        return 0;
    }

    @Override
    public int updateByPrimaryKey(WifiProperties record) {
        if (record!=null){
            int insert = wifiPropertiesMapper.updateByPrimaryKey(record);
            return insert;
        }
        return 0;
    }

    @Override
    public WifiDetailsVo selectByDetails(Integer wdId) {
        if(wdId>0){
            WifiDetailsVo wifiDetails = wifiDetailsMapper.selectByPrimaryKey(wdId);
            Integer wifiId = wifiDetails.getWifiId();
            Integer wmId = wifiDetails.getWmId();
            WifiMonitor wifiMonitor = wifiMonitorMapper.selectByPrimaryKey(wmId);
            wifiDetails.setWifiMonitor(wifiMonitor);
            WifiPropertiesVo wifiPropertiesVo = selectByProper(wifiId);
            WifiVo wifiVo = selectByPrimaryKey(wifiId);
            wifiDetails.setWifiPropertiesVo(wifiPropertiesVo);
            wifiDetails.setWifiVo(wifiVo);
            return wifiDetails;
        }
        return null;
    }

    @Override
    public WifiPropertiesVo selectByProper(Integer wifiId) {
        if(wifiId>0){
            WifiPropertiesVo wifiProperties = wifiPropertiesMapper.selectByPrimaryKey(wifiId);
            List<KeyTableVo> keyTableVos = keyTableMapper.selectValues(wifiId);
            wifiProperties.setKeyTableVoList(keyTableVos);
            return wifiProperties;
        }
        return null;
    }
}
