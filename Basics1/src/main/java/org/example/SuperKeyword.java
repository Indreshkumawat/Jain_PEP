package org.example;
class SeaAnimal{
    String color;


    public SeaAnimal(){
        System.out.println("In default constructor in parent");
    }
    public SeaAnimal(String color){
        this.color = color;
    }


}
class fish extends SeaAnimal{
    String color;
    public fish(String color){
        super("white");
        this.color = color;
    }
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }

}
public class SuperKeyword {
    public static void main(String[] args){
        fish f1 = new fish("Black");
        f1.printColor();

    }
}
