package org.example;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        int age;


        Scanner sc = new Scanner(System.in);

        age = sc.nextInt();


        try{
           if(age<18){
               throw new Exception("Age should be more than 18");
           }
        } catch (Exception e) {
            System.out.println("I have handled the ex."+e);
        }

        System.out.println("hello");
    }
}
