package com.tech.model;

import com.tech.entity.Activity;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EmployeeTest {

    private static final Double PASS_THRESHOLD = 62465.333;

    public static void main(String[] args) {


        Employee employee1 = new Employee(1L,"Amol","Bhandara",1234589123l,"amol@gmail.com",32465.333,"Cricket","Mechanical");
        Employee employee2 = new Employee(234L,"Lankesh","Nagpur",1234569123l,"lankesh@gmail.com",33465.333,"Cricket","Electrical");
        Employee employee3 = new Employee(3L,"Geeta","Pune",12345834523l,"geeta@gmail.com",62465.333,"Reading","IT");
        Employee employee4 = new Employee(4l,"Seeta","Hyderabade",1234589125l,"seets@gmail.com",22465.333,"Swimming","CT");
        Employee employee5 = new Employee(5l,"Ram","Banglore",1234589123l,"ram@gmail.com",17465.333,"Kabaddi","CS");
        Employee employee6 = new Employee(6l,"Girish","Nagpur",1234569123l,"girish@gmail.com",35465.333,"Kho-Kho","Electrical");
        Employee employee7 = new Employee(7l,"abhay","Nagpur",1234569123l,"abhay@gmail.com",20465.333,"HolyBall","Electrical");
        List<Employee> employeeList= new ArrayList<Employee>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);

        Activity activity1=new Activity("Cricket","Amol");
        Activity activity2=new Activity("Cricket","Lankesh");
        List<Activity> activities= new ArrayList<>();
        activities.add(activity1);
        activities.add(activity2);

        List<Employee> employees= Stream.of
                (new Employee(1L,"Amol","Bhandara",1234589123l,"amol@gmail.com",32465.333,"Cricket","Mechanical"),
         new Employee(234L,"Lankesh","Nagpur",1234569123l,"lankesh@gmail.com",33465.333,"Cricket","Electrical"),
         new Employee(3L,"Geeta","Pune",12345834523l,"geeta@gmail.com",62465.333,"Kabaddi","IT"),
        new Employee(4l,"Seeta","Hyderabade",1234589125l,"seets@gmail.com",22465.333,"HolyBall","CS"),
        new Employee(5l,"Ram","Banglore",1234589123l,"ram@gmail.com",17465.333,"Kabaddi","CS"),
        new Employee(6l,"Girish","Nagpur",1234569123l,"girish@gmail.com",35465.333,"Kho-Kho","Electrical"),
        new Employee(7l,"abhay","Nagpur",1234569123l,"abhay@gmail.com",20465.333,"Reading","Electrical")).collect(Collectors.toList());

        List<String> list =employees.stream().map(Employee::getEmployeeName).collect(Collectors.toList());
        System.out.println(list);
        Set<String> set = employees.stream().map(Employee::getDepartment).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);
        String joined = set.stream().map(Object::toString).collect(Collectors.joining(", "));
        System.out.println(joined);

        Double collect = employees.stream().collect(Collectors.summingDouble(Employee::getEmployeeSalary));
        System.out.println(collect);
        Map<String, List<Employee>> byDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(byDept);
        Map<String, Double> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getEmployeeSalary)));
       System.out.println(collect1);

        Map<Boolean, List<Employee>> passingFailing = employees.stream().collect(Collectors.partitioningBy(s -> s.getEmployeeSalary() >= PASS_THRESHOLD));
        System.out.println(passingFailing);

        List<Activity> hobbies = Stream.of
                (new Activity("Cricket","Amol"),
                new Activity("Cricket","Lankesh"),
                new Activity("Kabaddi","Geeta"),
                new Activity("BasketBall","Seeta")).collect(Collectors.toList());
//        List<Employee> employeeHobbieslist= employees.stream().map(emp -> {
//            if (hobbies.stream().anyMatch(ho -> ho.getName().equals(emp.getEmployeeName()))) {
//                hobbies.stream().filter(ho -> ho.getName().equals(emp.getEmployeeName())).findAny().ifPresent(ac ->
//                        ac.getHobbies());
//            }
//        } ).collect(Collectors.toList());
      //  System.out.println(employeeHobbieslist);
        List<Activity> hobiesList=hobbies.stream().filter(h->h.getHobbies()
                .equals("Cricket")).collect(Collectors.toList());
        System.out.println(hobiesList);

        Map  map =new HashMap();
        map.put(1,employeeList);
        map.put(2,activities);




        List<String> hobbiess= new ArrayList<String>();
        hobbiess.add("Cricket");
        hobbiess.add("Cricket");
        hobbiess.add("Swimming");
        hobbiess.add("chess");
        List<String> name=new ArrayList<String>();
        name.add("Virat");
        name.add("Sachin");
        name.add("Rohit");
        name.add("Dravid");
        List<List<String>>  arrayListlist = new ArrayList();
        arrayListlist.add(hobbiess);
        arrayListlist.add(name);
        arrayListlist.stream().forEach(System.out::println);


        //List<Integer> cricket = set.stream().filter(e -> e.equals("Cricket")).collect(Collectors.toList());
       // System.out.println(cricket);


//        List<String> emailList= employees.stream()
//                .map(Employee::getEmailId).collect(Collectors.toList());
//        System.out.println(emailList);
//        System.err.println("Employee salary >= 40000");
//        employeeList.stream().map(e ->e.getEmployeeSalary()>=40000).forEach(System.out::println);
//
//        List<Employee> list= employeeList.stream().collect(Collectors.toList());
//        System.out.println("----------EmployeeList-----------");
//        System.out.println(list);
//        System.out.println("-------secondHighestSalary-----------");
//      Double secondHighestSalary =  employeeList.stream().map(e -> e.getEmployeeSalary()).sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
//        System.out.println(secondHighestSalary);
//        System.out.println("-------secondLowestSalary-----------");
//        Double secondlwestsalary = employeeList.stream().map(e ->e.getEmployeeSalary())
//                .sorted(Comparator.naturalOrder()).skip(1).findFirst().orElse(null);
//        System.out.println(secondlwestsalary);
//       employeeList.stream()
//                .filter(e -> e.getEmployeeSalary() > 30000 && e.getEmployeeAddress().equals("Nagpur") ).forEach(System.out::println);

//       employeeList.stream().map(e->
//            (e.getEmployeeSalary() >= 20000 && e.getEmployeeAddress().equals("Nagpur"))
//           (10 / e.getEmployeeSalary())*100);
//       })
//        List<Employee> salaryIncrement = employeeList.stream().filter(e -> e.getEmployeeSalary() >= 30000)
//                .map(employee -> {
//            if(employee.getEmployeeAddress().equals("Nagpur")) {
//
//                employee.setEmployeeSalary(employee.getEmployeeSalary()/10 + employee.getEmployeeSalary());
//
//            } else {
//                employee.setEmployeeSalary(employee.getEmployeeSalary()/5 +employee.getEmployeeSalary());
//            }
//
//            return employee;
//        }).collect(Collectors.toList());
//        System.out.println(salaryIncrement);
//        System.out.println("***********Increment EmployeeList*****************");
//        Map<String, Double> incrementList = salaryIncrement.stream().collect(
//                Collectors.toMap(x -> x.getEmployeeName(), x -> x.getEmployeeSalary()));
//
//        System.out.println("Increment EmployeeList Name : " + incrementList);
      //  nagpur.stream().collect(Collectors.toMap())

    }

}
