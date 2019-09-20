package com.vip.light.utils;

public enum Region {
    //区域1
    //'龙川溪','龙潭峡','金峰峡','千岛湖石林','深林氧吧','九咆界','林海归真'
    REGION_1("龙川溪"),
    REGION_2("龙潭峡"),
    REGION_3("金峰峡"),
    REGION_4("千岛湖石林"),
    REGION_5("深林氧吧"),
    REGION_6("九咆界"),
    REGION_7("林海归真");

    private String name;

    Region(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
