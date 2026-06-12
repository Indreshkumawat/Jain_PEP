package org.example;

public class Method {
    public static void  print(){
        System.out.println("hello everyone good Morning!!!");
    }
    public static void printValue(int a,String name){
        System.out.println(" My name is : " + name);
        System.out.println("My age is : "+ a);
    }

    public static int returnValue(){
        int a = 20;
        int b = 50;
        int c = 70;

        return a+b+c;
    }
    public static int Sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static String returnString(){

        return "Indresh";
    }
    public static void main(String[] args){
        print();
        printValue(27,"Indresh");
        int val = returnValue();
        System.out.println(val);
        System.out.println(Sum(10,30,40,60));

        System.out.println(returnString());
    }
}
