package org.example;
class A{
    int a;
}
class B extends A{
    int b;
}
class C extends B{
    int c;
    public void print(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
public class MultiLevel {
    public static void main(String [] args){
        C ca = new C();
        ca.a = 10;
        ca.b = 20;
        ca.c = 30;
        ca.print();
    }
}
