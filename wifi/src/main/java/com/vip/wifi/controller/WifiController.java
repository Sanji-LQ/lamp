package com.vip.wifi.controller;

import com.vip.wifi.common.ErrorResult;
import com.vip.wifi.common.Result;
import com.vip.wifi.common.SuccessResult;
import com.vip.wifi.domain.entity.Wifi;
import com.vip.wifi.service.WifiService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class WifiController {
    @Resource
    WifiService wifiService;

    @RequestMapping("/wff")
    public Result selectByPrimaryKey(Integer wifiId){
        try {
            if(wifiId>0) {
                Wifi wifi = wifiService.selectByPrimaryKey(wifiId);
                if(wifi!=null) {return SuccessResult.success(wifi);}
                else {throw new RuntimeException();}
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ErrorResult.error();
    }

    //报废无线设备
    @RequestMapping("/wfd")
    public Result deleteByPrimaryKey(Integer wifiId){
        try {
            if(wifiId>0) {
                int i = wifiService.deleteByPrimaryKey(wifiId);
                if(i==0) {throw new RuntimeException();}
                else {
                    return SuccessResult.success();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ErrorResult.error();
    }
    //新增设备
    @RequestMapping(value = "/wfi",method = RequestMethod.POST, produces = "application/json")
    public Result insert(@RequestBody Wifi record){
        try {
            int insert = wifiService.insert(record);
            if(insert==0){throw new RuntimeException();}
            else {
                return SuccessResult.success();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ErrorResult.error();
    }
}
