package orgs;
class Student{
    private int id;
    private String name;
    private String branch;
    private int age;


    //default constructor
    public Student(){
        System.out.println("Hello Students!!!");
    }
    public Student(int i,String n,String b,int a){
        id = i;
        name = n;
        branch = b;
        age = a;
    }

    public void print(){
        System.out.println(age);
        System.out.println(id);
        System.out.println(name);
        System.out.println(branch);
    }
}
public class classesIntro {
    public static void main(String[] args){
        Student s1 = new Student(101,"indresh","CSE",27);

        s1.print();

        Student s2 = new Student(102,"Sita","ECE",26);

        s2.print();

        Student s3 = new Student();

    }
}
