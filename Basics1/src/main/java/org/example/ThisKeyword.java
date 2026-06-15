package org.example;

class Person{
    int age;
    String name;

    public Person(){
        this("AnyName",10);
        System.out.println("In default constructor");
    }
    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }
    public void changeName(String name){
        this.name = name;
    }
    public Person getObject(){
        return this;
    }
}
public class ThisKeyword {
    public static void main(String[] args){
        Person p1 = new Person();
        System.out.println(p1.age);
//        p1.changeName("Ind");

        Person x = p1.getObject();
        System.out.println(x.age);

    }
}
