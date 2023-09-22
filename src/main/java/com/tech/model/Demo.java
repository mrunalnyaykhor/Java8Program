package com.tech.model;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        System.out.println("********Predicate********");
        Predicate<Integer> p = x -> x>50;
        System.out.println(p.test(56));
        System.out.println(p.test(30));
        System.out.println("********BiPredicate********");
        BiPredicate<Integer,Integer> pp = (x,y) -> x>y;
        System.out.println(pp.test(50,30));
        System.out.println("********Consumer********");
        Consumer<String> consumer=x-> System.out.println(x.length());
        consumer.accept("Program");
        consumer.accept("Welcome To Nagpur");
        System.out.println("********BiConsumer********");
        BiConsumer<String,String> con=(a,b)-> System.out.println(a+":"+b);
        con.accept("Sita","Ram");
        System.out.println("********function********");
        Function<Integer,Boolean>fun =x-> x>50;
        System.out.println(fun.apply(105));

        System.out.println("********Supplier********");
        Supplier<Integer> sup= ()->404;
        System.out.println(sup.get());

        System.out.println("********UnaryOperator********");
        UnaryOperator<String> u= x->"Hello";
        System.out.println(u.apply("program"));


        System.out.println("**********IntBinaryOperator********");
        IntBinaryOperator integer = (a,b)-> a+b;
        System.out.println(integer.applyAsInt(20,50));  //return result


 List<String > list = Arrays.asList("aa","bc","","","hg","classmate","Nagpur");
        Long count = list.stream() .filter(x -> x.isEmpty()) .count();
        System.out.println(count);
        System.out.println("_______Length count______");
       long num = list.stream().filter(x ->x.length()>3).count();
        System.out.println(num);
      String listJoining =list. stream().map(x -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println(listJoining);
        System.out.println("************IntSummaryStatistics**************");
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics intSummaryStatistics = primes.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics);
        // Count the empty strings
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        long counts = strList.stream() .filter(x -> x.isEmpty()) .count();
        System.out.printf("List %s has %d empty strings %n", strList, counts);
        // Count String with length more than 3
        long nums = strList.stream() .filter(x -> x.length()> 3) .count();
        System.out.printf("List %s has %d strings of length more than 3 %n", strList, nums);





    }

}
