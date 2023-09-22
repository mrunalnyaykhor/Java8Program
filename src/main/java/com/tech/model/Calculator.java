package com.tech.model;

import com.tech.service.impl.CalculatorServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Calculator {
    public static void main(String[] args) {
        CalculatorServiceImpl sq=new CalculatorServiceImpl();

        System.out.println(sq.findSquareRoot(100));

        BiConsumer<String,String> strConsumer = (x, y)->{
            System.out.println("x: "+x+" y:"+y);
        };





    }
}
