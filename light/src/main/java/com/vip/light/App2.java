package com.vip.light;

import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        String num = input.next();
        System.out.println("各位数字之和为："+calculate(num));
    }

    static int calculate(String num){
        int count = 0;
        for (int i = 0; i < num.length(); i++) {
             count+=(num.charAt(i)-'0');
        }
        return count;
    }

}
