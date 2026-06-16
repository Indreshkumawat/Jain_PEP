package org.example;


import java.util.Scanner;

public class ThrowsDemo {
    public static void checkAge(int age) throws ArithmeticException{
        if(age < 18){
            throw new ArithmeticException("Age is less than 18 not eligible ");
        }

        System.out.println("Eligible to vote");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        try{
            checkAge(age);
        }catch (ArithmeticException e){
            System.out.println("Exception handled in main method " + e);
        }

        System.out.println("Age checked");

    }
}
