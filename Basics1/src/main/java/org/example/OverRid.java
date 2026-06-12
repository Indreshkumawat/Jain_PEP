package org.example;
class Parent{
    public void print(){
        System.out.println("hello i am A");
    }
}
class Child extends Parent{
    public void print(){
        System.out.println("hello i am B");
    }
    public void Hello(){
        System.out.println("Saying hello from B only");
    }

}

public class OverRid {
    public static void main(String[] args){
        Parent c = new Child();
        c.print();
    }
}
