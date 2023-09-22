package com.tech.model;

import com.tech.service.CalculatorService;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class NoteBook {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
   //     System.out.println("List of numbers: " + list);
//        double average = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
//
//        System.out.println("Average value of the  numbers: " + average);
        List<String> strings = Arrays.asList("Table", "Chair", "cup", "Tv", "Pen", "Laptop", "Fan");
        List<String> uppercaselist = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppercaselist);
//
//        strings.stream().filter(a->a.startsWith("T")).forEach(System.out::println);
//        List<String> lowercaseString =strings.stream().map(String::toLowerCase).collect(Collectors.toList());
//        System.out.println(lowercaseString);

        List<Integer> numbers = Arrays.asList(1,2,22,4,1,4,3,5,7,6,8,9,10,12,28,21);

//        Integer sumOfEvenNos = numbers.stream().filter(a-> a%2==0).mapToInt(Integer::intValue).sum();
//        System.out.println("sum of even Numbers :"+sumOfEvenNos);
//        Integer sumOfOddNos= numbers.stream().filter(n -> n%2!=0).mapToInt(Integer::intValue).sum();
//        System.out.println(" Sum of odd no :"+sumOfOddNos);

//        List<Integer> al = Arrays.asList(1,2,22,4,1,4,3,5,7,6,8,9,10,12,28,21);
//        List<Integer> removeDuplicatesElement= al.stream().distinct().collect(Collectors.toList());
//        System.out.println(removeDuplicatesElement);

        List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink","Gray", "Brown");

//        char startingLetter= 'G';
//        long ch=colors.stream().filter(s ->s.startsWith(String.valueOf(startingLetter))).count();
//        System.out.println("Number of colors starting with '" + startingLetter + "': " + ch);
//
//        List<String>  values= Arrays.asList("Pink","AA","BB","CC","DD","BBB","Black");
//        List<String> list1= values.stream().sorted().collect(Collectors.toList());
//        System.out.println("Ascending order"+list1);
//        List<String> list2 = values.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println("Descending Order"+list2);

        List < Integer > element = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);

//        Integer max_val = element.stream().max(Integer::compare).orElse(null);
//        System.out.println(max_val);
//
//        Integer min_Val = element.stream().min(Integer::compare).orElse(null);
//        System.out.println(min_Val);

        Integer secondSmallest = element.stream().distinct().sorted().skip(1).findFirst().orElse(null);
        System.out.println(secondSmallest);


        Integer secondLargest = element.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(secondLargest);
    }
}
