package org.example;

import java.util.Scanner;

public class ArrayTwo {
    public static void main(String[] args){

        int num[] = {1,2,10,4,5,6};

       int maxi = 0;
       int secMax = 0;
        for(int i = 0;i<num.length;i++){
          if(num[i] > maxi){
              secMax = maxi;
              maxi = num[i];
          }else if(num[i] > secMax && num[i] != maxi){
              secMax = num[i];
          }
        }
        System.out.println(secMax);
    }
}
