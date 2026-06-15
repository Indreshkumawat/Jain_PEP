package orgs;

class Demo{
    public static int num = 10;
    public static void print(){
        System.out.println("Hello");
    }
}

public class Stat {
    public static void main(String[] args){

        Demo d1 = new Demo();

        Demo.num = 20;
        Demo.print();

        System.out.println(Demo.num);

        int n = d1.num;
        System.out.println(d1.num);




    }
}
