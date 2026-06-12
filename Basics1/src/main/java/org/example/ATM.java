package org.example;

public class ATM {
    public static void main(String[] args){
        int balance = 5000;
        int withdraw = 1200;

        if(withdraw <= balance && withdraw % 100 == 0){
            System.out.println(" Transaction succ. ");
            balance = balance - withdraw;
            System.out.println(" Remaining bal" + balance);
        }
        else{
            System.out.println("Failed");
        }
    }
}
