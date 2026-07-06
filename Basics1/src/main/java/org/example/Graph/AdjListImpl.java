package org.example.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class graph{
    HashMap<Integer, ArrayList<Integer>> adj = new HashMap<>();

    public void addEdge(int u,int v,boolean direction){
        adj.putIfAbsent(u,new ArrayList<>());
        adj.putIfAbsent(v,new ArrayList<>());

        adj.get(u).add(v);

        if(!direction){
            adj.get(v).add(u);
        }
    }
    public void print(){
           for(Map.Entry<Integer,ArrayList<Integer>> mp : adj.entrySet()){

           }
    }
}
public class AdjListImpl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices");
        int n = sc.nextInt();
        System.out.println("Enter Number of edges");
        int m = sc.nextInt();

        Graph graph = new Graph(n);


    }

}
