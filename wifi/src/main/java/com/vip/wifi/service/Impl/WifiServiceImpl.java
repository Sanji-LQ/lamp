package com.vip.wifi.service.Impl;

import com.vip.wifi.common.ErrorResult;
import com.vip.wifi.common.Result;
import com.vip.wifi.common.SuccessResult;
import com.vip.wifi.domain.entity.Wifi;
import com.vip.wifi.domain.vo.KeyTableVo;
import com.vip.wifi.domain.vo.WifiVo;
import com.vip.wifi.mapper.KeyTableMapper;
import com.vip.wifi.mapper.WifiMapper;
import com.vip.wifi.mapper.WifiPropertiesMapper;
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
}
