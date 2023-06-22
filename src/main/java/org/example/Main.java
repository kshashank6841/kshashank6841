package org.example;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Address> addresses = List.of(
                new Address("Sasaram"),
                new Address("Bangalore"),
                new Address("Mathura"),
                new Address( "Ayodhya"));

        List<Employee> employees = List.of(
                new Employee("Chhotiya",addresses.get(0)),
                new Employee("Munish",addresses.get(1)),
                new Employee("Krishna",addresses.get(2)),
                new Employee("Ram", addresses.get(3)),
                new Employee("Yogi",addresses.get(3)),
                new Employee("Shashank",addresses.get(2)),
                new Employee("Devanshi", addresses.get(1))
        );

         employees.stream()
                  .collect(Collectors.groupingBy(s->s.address.toString()))
                  .forEach((add,emp)->{
                      System.out.println(add+" = "+emp.stream().map(s-> s.name).toList());
                  });
    }
}