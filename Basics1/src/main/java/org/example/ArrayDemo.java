package org.example;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args){
        int []arr = new int[6];

//        Scanner sc = new Scanner(System.in);
//
//        for(int i = 0;i<5;i++){
//            int a = sc.nextInt();
//            arr[i] = a;
//        }

        arr[0] = 10;
        arr[1] = 1;
        arr[2] = 12;
        arr[3] = 15;
        arr[4] = 13;
        int pos = 2;
        int val = 18;

//        for(int i = arr.length - 1;i> pos;i--){
//            arr[i] = arr[i-1];
//        }
//        arr[pos] = val;

        for(int i = 0;i<arr.length - 1;i++){
            arr[i] = arr[i+1];
        }

        for(int i = pos;i<arr.length - 1;i++){
            arr[i] = arr[i+1];
        }

        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
