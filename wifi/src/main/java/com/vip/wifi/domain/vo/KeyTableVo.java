package com.vip.wifi.domain.vo;

import com.vip.wifi.domain.entity.KeyTable;
import com.vip.wifi.domain.entity.ValueTable;
import lombok.Data;

@Data
public class KeyTableVo extends KeyTable {
    private ValueTable valueTable;
}
