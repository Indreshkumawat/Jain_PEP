package org.example;

abstract class Demo{
    public abstract void print();
    public abstract void walk();
    public void run(){
        System.out.println("Running");
    }
}
abstract class DemoImpl extends  Demo{
    public abstract void print();
}
class DemoImplChild extends DemoImpl{
    public void print(){

    }
    public void walk(){

    }
}
public class AbstractDemo {
    public static void main(String[] args){
        DemoImplChild d = new DemoImplChild();
        d.print();
        d.run();
    }
}
