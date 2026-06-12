package orgs;
class Employee{
    void print(){
        System.out.println("I am in Employee class");
    }
    void Run(){
        System.out.println("employee is running ");
    }
}
class Teacher extends Employee{
    void print(){
        System.out.println("I have redefined the print in B");
    }
    void teaching(){
        System.out.println("Teacher is teaching in B ");
    }
}
public class OverRiding {
    public static void main(String[] args){
        Employee t1 = new Teacher();

        t1.print();

        t1.Run();

    }
}
