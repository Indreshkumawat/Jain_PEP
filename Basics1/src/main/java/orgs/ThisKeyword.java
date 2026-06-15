package orgs;
class SeaAnimal{

    public String color;

    public SeaAnimal(String color){
        this.color = color;
    }
    public SeaAnimal(){
        System.out.println("I am in parent class");
    }

    public void print(){
        System.out.println(color);
    }

}
class shark extends SeaAnimal{
    public String name;

    public shark(String name){
        super("blue");
        this.name = name;
       super.print();

    }

}

public class ThisKeyword {
    public static void main(String[] args){
        shark s = new shark("Nemmo");
        System.out.println(s.name);
    }
}
