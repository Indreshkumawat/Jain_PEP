package DSA.Recursion;

import java.util.HashMap;

public class RecursionDemo {
    public static void print(int n){
        if(n == 0){
            return;
        }

        print(n - 1);
        System.out.println(n);
        return;
    }
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        int temp = n + sum(n-1);
        return temp;
    }
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        int temp = n * fact(n-1);
        return temp;
    }
    //public static int count = 0;
    public static int countNo(int n){
        if(n == 0) return 0;
        int count =  1 + countNo(n/10);
        return count;
    }
    public static int fab(int n){
        if(n <= 1){
            return n;
        }
        return fab(n-1) + fab(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
       // print(5);
//        System.out.println(sum(n));
//        System.out.println(fact(n));
//        System.out.println(countNo(625));

//        System.out.println(fab(4));

        HashMap<Character,Integer> mp = new HashMap<>();

        mp.put('A',2);
        mp.put('B',5);
        mp.put('D',2);
        mp.put('Z',1);

        System.out.println(mp.get('Z'));


    }
}
