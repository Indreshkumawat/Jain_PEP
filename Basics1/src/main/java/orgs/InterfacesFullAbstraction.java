package orgs;

interface AquaticAnimals{
    void swim();
    void eat();
}
class Fish implements AquaticAnimals{
    public void swim(){
        System.out.println("fishes used gills to breadth and swim");
    }
    public void eat(){
        System.out.println("fishes can eat food inside sea ");
    }
}
class Peguine implements AquaticAnimals{

    public void swim() {
        System.out.println("peguine come outside to breadth");
    }
    public void eat() {
        System.out.println("pegiune have to come outside the  sea to eat food");
    }
}
public class InterfacesFullAbstraction {
        public static void main(String[] args){
           AquaticAnimals a1 = new Fish();
           AquaticAnimals a2 = new Peguine();

           a1.eat();
           a1.swim();

           a2.eat();
           a2.swim();

        }
}
