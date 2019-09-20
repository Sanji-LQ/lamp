package com.vip.light;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

    public static void main(String[] args) {
        String stateTime = "2019-08-15 16:39:00";
        String endTime = "2019-08-16 17:40:01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date start = sdf.parse(stateTime);
            Date end = sdf.parse(endTime);
            long workTime = end.getTime()-start.getTime();
            System.out.println("毫秒值："+workTime);
            long hour = workTime/1000/60/60;
            long minutes = workTime/1000/60%60;
            long seconds = workTime/1000%60;
            System.out.println("小时："+hour);
            System.out.println("分钟："+minutes);
            System.out.println("秒："+seconds);


        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
