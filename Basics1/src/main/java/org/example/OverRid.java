package org.example;
class Parent{
    public void print(){
        System.out.println("hello i am A");

    }
    public void Hello(){
        System.out.println("Saying hello from A only");
    }
}
class Child extends Parent{
    public void print(){
        System.out.println("hello i am B");
    }
    public void HelloB(){
        System.out.println("hello in B class how are u ");
    }
}

public class OverRid {
    public static void main(String[] args){
        Child c = new Child();
        c.print();
        c.Hello();
    }
}
