package com.vip.light.controller;

import com.vip.light.domain.entity.Light;
import com.vip.light.mapper.LightMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class TestController {
    @Resource
    LightMapper lightMapper;

    @GetMapping("/findById")
    Light findById(Integer id){
        return lightMapper.selectByPrimaryKey(id);
    }


}
