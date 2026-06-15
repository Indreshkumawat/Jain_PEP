package orgs;

import java.util.Scanner;

public class ExceptionHandle {
    public static void main(String[] args){
       // int a;
//        int b;
//
        Scanner sc =  new Scanner(System.in);
//
//        a = sc.nextInt();
//        b = sc.nextInt();
//        int ans = 0;
//        try{
//             ans = a /b;
//        }catch (Exception e){
//            System.out.println("Exception handled properly here " + e);
//        }

        int age;

        age = sc.nextInt();

        try{
            if(age < 18){
                throw new Exception("Age should be great3er than 18");
            }
        }catch (Exception e){
            System.out.println("Exceptionn handled : " + e);
        }




//        System.out.println(ans);
//
//        System.out.println(a * b);

        System.out.println("Done with exe");
    }
}
