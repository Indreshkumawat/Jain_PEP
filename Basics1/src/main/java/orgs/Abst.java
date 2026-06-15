package orgs;
abstract class Vehicle{
    abstract void engine();
    void run(){
        System.out.println("Vehicle is running for now !!!");
    }
}
class Bike extends Vehicle{
    void engine(){
        System.out.println("Bike have 125CC engine");
    }

}
public class Abst {
    public static void main(String[] args){
       Vehicle b1 = new Bike();
       b1.run();
       b1.engine();

    }
}
