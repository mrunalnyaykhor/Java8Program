package com.tech.service;

public interface Laptop {
    abstract long length(long l);
    abstract int weight(int kg);
    public default String color(String color){
        System.out.println("Black color");
        return "red";
    }
}
