package org.example;

class Super{
    public static int a = 10;
    static void print(){
        System.out.println("Hello");
    }
}
public class StaticDemo {
    public static void main(String[] args){

        Super.print();

    }
}
