package com.tech.model;

import com.tech.service.Laptop;

public class Lenovo implements Laptop {
    @Override
    public long length(long l) {
        System.out.println("1feet");
        return 2;

    }
    @Override
    public int weight(int kg) {
        System.out.println("1kg");
        return 1;
    }

    public static void main(String[] args) {
        Laptop l = new Lenovo();
        l.length(2);
        l.weight(4);
        l.color("Black");
    }


}
