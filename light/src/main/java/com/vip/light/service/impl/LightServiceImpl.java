package com.vip.light.service.impl;

import com.vip.light.domain.entity.Light;
import com.vip.light.mapper.LightMapper;
import com.vip.light.service.LightService;
import com.vip.light.utils.result.ResponseEntity;
import com.vip.light.utils.result.ResponseStatus;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LightServiceImpl implements LightService {
    @Resource
    LightMapper lightMapper;


    @Override
    public ResponseEntity setUp(Light light) {
        int row = lightMapper.updateByPrimaryKeySelective(light);

return null;

    }

    /**
     * 新增照明设备
     * @param light
     * @return
     */
    @Override
    public ResponseEntity save(Light light) {
        int row = lightMapper.insertSelective(light);
        return (row>0)?ResponseEntity.success():ResponseEntity.error(ResponseStatus.DATA_IS_WRONG);

    }



}
