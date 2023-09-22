package com.tech.model;

import com.tech.service.MobileService;

public class Mobile {
    public static void main(String[] args) {
        MobileService mobileService = (int a,int b) -> a + b;
        MobileService mobileService1 = ( a, b) -> a - b;


        System.out.println(mobileService.add(80,20));
        System.out.println(mobileService1.add(80,20));
    }
}
