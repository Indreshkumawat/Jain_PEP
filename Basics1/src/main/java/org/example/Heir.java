package org.example;
class Vechile{
    int noOfTyers;
    int noOfSeats;
    public void printBasicDetails(){
        System.out.println("Tyers : "+ noOfTyers);
        System.out.println("Seats : "+ noOfSeats);
    }
}
class Bike extends Vechile{

    int bikeSpeed;

    public Bike(int s) {
        bikeSpeed = s;
    }

    void bikeHave(){
        noOfSeats = 1;
        noOfTyers = 2;
        printBasicDetails();
        System.out.println("Speed" + bikeSpeed);
    }
}
class Car extends Vechile{
    int carSpeed;

    public Car(int s) {
        carSpeed = s;
    }

    void carHave(){
        noOfSeats = 5;
        noOfTyers = 4;
        printBasicDetails();
        System.out.println("Speed" + carSpeed);
    }
}
class Truck extends Vechile{
    int truckSpeed;

    public Truck(int s) {
        truckSpeed = s;
    }

    void truckHave(){
        noOfSeats = 3;
        noOfTyers = 10;
        printBasicDetails();
        System.out.println("Speed" + truckSpeed);
    }
}
public class Heir {
    public static void main(String[] args){
        Bike b1 = new Bike(100);
        b1.bikeHave();

        Car c1 = new Car(200);
        c1.carHave();

        Truck t1 = new Truck(150);
        t1.truckHave();
    }
}
