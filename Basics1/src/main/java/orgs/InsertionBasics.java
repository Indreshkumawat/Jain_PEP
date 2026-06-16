package orgs;

import java.util.Scanner;

public class InsertionBasics {
    public static void main(String[] args){
       int arr[] = new int[10];

        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            arr[i] = sc.nextInt();
        }

        int n = 5;
        int val = 18;

        for(int i = n-1;i>=0;i--){
            arr[i+1] = arr[i];
        }

        arr[0] = val;
        n++;

        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }


    }
}
