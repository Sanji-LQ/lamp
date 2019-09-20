package com.vip.light.service;

import com.vip.light.domain.entity.Light;
import com.vip.light.utils.result.ResponseEntity;

public interface LightService {
    ResponseEntity save(Light light);

    ResponseEntity setUp(Light light);


}
