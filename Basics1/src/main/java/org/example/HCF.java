package org.example;
import java.util.*;
public class HCF {
    public static void main(String[] args){
        int a = 5;
        int b = 7;

        int res = Math.min(a,b);
        while(res > 0){
            if(a % res == 0 && b % res == 0){
                break;
            }
            res--;
        }

        System.out.println(res);
    }
}
