package org.example;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

//        int num[][] = {
//                       {1,2,3},
//                       {4,5,6},
//                       {7,8,9},
//                       {3,3,4}
//                      };

        int [][] arr = new int[3][4];
        int w = 1;
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){

                arr[i][j] = sc.nextInt();
                //arr[i][j] = w;
//                w++;
            }
        }

//        for(int i = 0;i<3;i++){
//            int sum = 0;
//            for(int j = 0;j<4;j++){
//               sum += arr[i][j];
//            }
//            System.out.println(sum);
       // }

        int numbers[][] = new int[3][4];

        Scanner s =  new Scanner(System.in);
       for(int i = 0;i<3;i++){
           for(int j = 0;j<4;j++){
               int a = s.nextInt();
               numbers[i][j] = a;
           }
       }






    }
}
