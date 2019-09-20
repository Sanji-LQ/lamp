package com.vip.wifi.mapper;

import com.vip.wifi.domain.vo.KeyTableVo;
import com.vip.wifi.domain.vo.WifiVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class KeyTableMapperTest
{
    @Resource
    WifiMapper wifiMapper;
    @Resource
    KeyTableMapper keyTableMapper;

    @Test
    public void selectValue() {
        WifiVo wifiVo = wifiMapper.selectByPrimaryKey(1);
        List<KeyTableVo> keyTableVos = keyTableMapper.selectValue(1);
        wifiVo.setKeyTableVoList(keyTableVos);
        log.error(wifiVo+"");
    }

    @Test
    public void selectValues() {
    }
}