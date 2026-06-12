package org.example;

class Animal{

     String name;
     int noOfLegs;
     int height;
}


class Dog extends Animal{
    private String breed;

    public Dog(String b){
        breed = b;
    }

    public void initialize(String n,int no,int h){
        name = n;
        noOfLegs = no;
        height = h;
    }
    void identifyTheAnimal(){
        System.out.println("This is a Dog");
    }
    void printDetails(){
        System.out.println("This dog is of "+ breed);
        System.out.println("this animal have " + noOfLegs+" legs");
        System.out.println("It have "+height+" height");
    }
    void speak(){
        System.out.println("Dog barks");
    }
}
public class Inheritence {
    public static void main(String[] args){
        Dog d = new Dog("Bigal");

        d.initialize("sheeeru",4,2);
        d.identifyTheAnimal();
        d.printDetails();
        d.speak();


    }
}
