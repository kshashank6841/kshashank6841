package org.example;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierFI {
    public static void main(String[] args) {


        //1
        Supplier<Date> supplier1 = Date::new;
        System.out.println("Current Date = "+supplier1.get());


        //2
        Supplier<String> supplier2 = ()->{
            String str[] = {"Ram", "Shyam","Krishn","Hari"};
            int x = (int) (Math.random()*4);
//            System.out.println(x);
//            System.out.println(Math.random()); //0<=x<1
            return str[x];
        };
        System.out.println("Random name from an array = "+supplier2.get());


        //3-to generate 6-digit-otp
        Supplier<String> supplier3 = ()->{
            String otp = "";
            for(int i=0;i<6;i++){
                otp=otp + (int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println("6-digit random otp = "+supplier3.get());


        //4- generate random 9 char password
        Supplier<String> supplier4 = ()->{
            String pwd="";
            Supplier<Integer> integerSupplier = ()->(int)(Math.random()*10);
            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@#$";
            Supplier<Character> characterSupplier = ()-> symbols.charAt((int)(Math.random()*55));
            for (int i =0;i<8;i++){
                if(i%2 ==0) pwd+= integerSupplier.get();
                else pwd+=characterSupplier.get();
            }
            return pwd;
        };
        System.out.println("9 - digit random password = "+supplier4.get());
    }
}
