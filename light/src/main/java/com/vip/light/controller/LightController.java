package com.vip.light.controller;

import com.vip.light.domain.entity.Light;
import com.vip.light.service.LightService;
import com.vip.light.utils.result.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class LightController {
    @Resource
    LightService lightService;

    @PostMapping("/save")
    ResponseEntity save(@RequestBody Light light){
        return lightService.save(light);
    }

    @GetMapping("/test")
    Light test(){
        Light light = new Light();
        light.setFounder("璇哥");
        return light;
    }



}
