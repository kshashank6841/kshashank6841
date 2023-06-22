package org.example;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class OccurrenceOfChar1 {


    public static void main(String[] args) {
        String s = "Hello WOrld!";
        Map<String, Long> m = Arrays.stream(s.split(""))
                                    .map(String::toLowerCase)
                                    .collect(Collectors.groupingBy(s1->s1,Collectors.counting()));
        System.out.println(m);

        String stmt= "This is our house";
        Map<String, Long> result = Arrays.stream(stmt.split(""))
                .map(String::toLowerCase) //s->s.toLowerCase
                .collect(Collectors.groupingBy(s1 -> s1,LinkedHashMap :: new, Collectors.counting()));// args -> new LinkedHashMap(args)
        System.out.println(result);
    }



}
