package org.example.homework_nr_12;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Artiom", "Levitchii", 31, true, true);
        Employee employee2 = new Employee("John", "Brzenk", 55, true, true);
        Employee employee3 = new Employee("Davon", "Larratt", 18, false, false);
        Employee employee4 = new Employee("Alex", "Bespalov", 25, true, false);
        Employee employee5 = new Employee("Elena", "Bobeika", 44, true, true);
        Employee employee6 = new Employee("Elena", "Dorotova", 19, false, true);
        Employee employee7 = new Employee("Oleg", "Saricev", 36, false, false);
        Employee employee8 = new Employee("Iurii", "Burea", 40, false, true);
        Employee employee9 = new Employee("Nicolai", "Perpelita", 22, false, false);
        Employee employee10 = new Employee("Maria", "Evleeva", 25, true, true);

        List<Employee> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(0, employee1);
        listOfEmployee.add(1, employee2);
        listOfEmployee.add(2, employee3);
        listOfEmployee.add(3, employee4);
        listOfEmployee.add(4, employee5);
        listOfEmployee.add(5, employee6);
        listOfEmployee.add(6, employee7);
        listOfEmployee.add(7, employee8);
        listOfEmployee.add(8, employee9);
        listOfEmployee.add(9, employee10);


        System.out.println("Employee who is older 25y.o.,can conduct interview and is payed by hour:");
        listOfEmployee.stream()
                .filter(employee -> employee.getAge() > 25 && employee.getCanConductInterview() && employee.getPayedByHour())
                .map(employee -> employee.getName())
                .limit(5)
                .forEach(System.out::println);

        //---------------------------------------------
        System.out.println("-----------------------------------");
        System.out.println("Employee who is older 30y.o., and is not payed by hour:");
        listOfEmployee.stream()
                .filter(employee -> employee.getAge() >= 30 && !employee.getPayedByHour())
                .map(employee -> employee.getName())
                .sorted()
                .forEach(System.out::println);
        //---------------------------------------------
        System.out.println("-----------------------------------");
        System.out.println("Optional check:");
        Optional<Employee> tempEployee = listOfEmployee.stream()
                .filter(employee -> employee.getPayedByHour() && employee.getCanConductInterview())
                .findFirst();

        if (tempEployee.isPresent()) {
            System.out.println(tempEployee.get().getName());
        } else {
            System.out.println("Employee was not found!");
        }
        //---------------------------------------------
        System.out.println("-----------------------------------");
        listOfEmployee.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(listOfEmployee.toString());
    }
}
