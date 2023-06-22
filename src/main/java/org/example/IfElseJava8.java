package org.example;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IfElseJava8 {

    public static void isEvenUsingJava8IFElse(int num) {

        String result = Optional.of(num)
                .filter(i -> i % 2 == 0)
                .map(integer -> "Even")
                .orElse("ODD");

        System.out.println(result);
    }
    public static void main(String[] args) {

        //If-else
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

                System.out.println(Optional.of(list)
                .map(Collection::stream)
                .map(integerStream ->
                        integerStream
                                .filter(i -> i % 2 == 0)
                                .collect(Collectors.toList())
                ));

               list.forEach(IfElseJava8::isEvenUsingJava8IFElse);
    }
}
