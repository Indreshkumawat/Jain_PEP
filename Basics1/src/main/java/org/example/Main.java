package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the units : ");
        int units = sc.nextInt();

       // int units = 160;

        int bill_Amount = 0;

        if(units <= 100){
           bill_Amount = units*5;
        }
        else if(units<=200){
            bill_Amount = 100*5 + (units-100)*7;
        }else{
            bill_Amount = 100 * 5 + 100 * 7 + (units - 200)*10;
        }
        System.out.println(bill_Amount);
    }
}