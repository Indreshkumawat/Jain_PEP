package org.example;


public class FinallyBlock {
    public static void main(String[] args) {

        try {
            int data = 25 / 0;

        } catch (NullPointerException e) {
            System.out.println("Handled!!1");
        } finally {
            System.out.println("I am in finally block!!");
        }

        System.out.println("Age checked");

    }
}

