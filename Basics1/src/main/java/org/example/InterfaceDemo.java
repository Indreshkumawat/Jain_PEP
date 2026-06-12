package org.example;
interface PrintAble{
    int sum();
    int sub();
}
class PrintImpl implements PrintAble{
    public int sum(){
        return 5;
    }
    public int sub(){
        return 10;
    }
}
public class InterfaceDemo {
    public static void main(String[] args){
        PrintImpl p = new PrintImpl();
        System.out.println(p.sub());
        System.out.println(p.sum());
    }
}
