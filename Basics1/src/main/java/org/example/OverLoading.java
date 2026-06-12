package org.example;
class Adder{
    public int add(int a,int b){
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }
    public String add(String x, String y){
        return x + y;
    }
    public String add(String x, String y,String z){
        return x + y + z;
    }
}
public class OverLoading {
    public static void main(String[] args){
        Adder c1  = new Adder();

        System.out.println(c1.add(2,3));
        System.out.println(c1.add(2.23,3.789));
        System.out.println(c1.add("Indresh","Kumawat"));
        System.out.println(c1.add("Mr.","Indresh","Kumawat"));

    }
}
