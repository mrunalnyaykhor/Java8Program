package com.tech.model;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.fasterxml.jackson.databind.type.LogicalType.Collection;

public class OptionalDemo {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = (s) -> System.out.println("The value stored in Optional object - " + s);
        Runnable runnable = () -> System.out.println("No value stored in the Optional object");

        String test = "hello-educative";
        Optional<String> stringOptional = Optional.ofNullable(test);

        System.out.println("When a value is present - ");
        stringOptional.ifPresentOrElse(stringConsumer, runnable);

        System.out.println("----------");
        test = null;

        System.out.println("When no value is present - ");

        stringOptional = Optional.ofNullable(test);
        stringOptional.ifPresentOrElse(stringConsumer, runnable);

        List<String> companyNames = Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");
        Optional<List<String>> listOptional = Optional.of(companyNames);
        System.out.println(listOptional);
        int size = listOptional.map(List::size).orElse(0);
        System.out.println(size);

        String password = " password ";
        Optional<String> passOpt = Optional.of(password);
        boolean correctPassword = passOpt.filter(pass -> pass.equals("password")).isPresent();
        System.out.println(correctPassword);

        correctPassword = passOpt.map(String::trim).filter(pass -> pass.equals("password")).isPresent();
        System.out.println(correctPassword);
        System.out.println("*******Year Optional************");
        Integer year = 2016;
        Optional<Integer> yearOptional = Optional.of(year);
        boolean is2016 = yearOptional.filter(y -> y == 2016).isPresent();
        System.out.println(is2016);

        boolean is2017 = yearOptional.filter(y -> y == 2017).isPresent();
        System.out.println(is2017);

        String s = null;
        String name = Optional.ofNullable(s).orElseGet(() -> "Ganesh");
        System.out.println(name);

        String sName = "Rajendra";
        String ssName = Optional.of(sName).orElseGet(() -> "Naresh");
        System.out.println(ssName);

        List<Integer> list = Arrays.asList(1, 2, 3, 2, 1, 4);
        Optional<Integer> first = list.stream().findFirst();
        if (first.isPresent()) {
            Integer integer = first.get();

            System.out.println(integer);
        } else {
            System.out.println("no value present");
        }
        Optional<Integer> first1 = list.stream().filter(x -> x > 1).findFirst();
        if (first1.isPresent()) {
            System.out.println(first1.get());
        } else {
            System.out.println("No Value");
        }

        List<String> vilageList = Arrays.asList("Warthi","Bhandara","Gondia","Nagpur");
        Optional<String> vilage = vilageList.stream().filter(x -> !x.equalsIgnoreCase("Mumbai")).findAny();
        if(vilage.isPresent())
        {
            System.out.println(vilage.get());
        }
        else {
            System.out.println("No vilages");
        }

        List<String > treelist = Arrays.asList("Mango Tree","Jack-fruit Tree","Lemon Tree","Banyan Tree");
        Optional<String> tree = treelist.stream().filter(x -> !x.equalsIgnoreCase("PinApple Tree")).findAny();
        if(tree.isPresent()){
            System.out.println(tree.get());
        }else {
            System.out.println("There is no tree");
        }

        List<String > Bhandara = Arrays.asList("Warthi","Mohadi","Tumsar");
        List<String> Nagpur= Arrays.asList("Pardi","Kharbi","Hingna");
        List<String> Gondia =Arrays.asList("Tiroda","Dongargadh","Adani");

//        List<String> districtList = Stream.of(Bhandara, Nagpur, Gondia)
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList());
//        districtList.forEach(System.out::println);

    }
}
