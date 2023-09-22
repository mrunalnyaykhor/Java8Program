package com.tech.service.impl;

import com.tech.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double findSquareRoot(int n) {
        return Math.sqrt(n);
    }

    @Override
    public int sum(int a, int b) {
        int c= a+b;
        return c;
    }


}
