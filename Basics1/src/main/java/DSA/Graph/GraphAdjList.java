package DSA.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class GraphList{
    HashMap<Integer, ArrayList<Integer>> adj = new HashMap<>();

    void addEdge(int u,int v,boolean direction){
        adj.putIfAbsent(u,new ArrayList<>());
        adj.putIfAbsent(v,new ArrayList<>());

        adj.get(u).add(v);
        if(!direction){
            adj.get(v).add(u);
        }
    }
    void print(){
        for(Map.Entry<Integer,ArrayList<Integer>> mp : adj.entrySet())
        {
            System.out.println(mp.getKey() + "->");

            for(int neigh : mp.getValue()){
                System.out.println(neigh);
            }

            System.out.println();
        }

    }

}
public class GraphAdjList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of node you need");
        int n = sc.nextInt();

        System.out.println("enter no of edges you need");
        int m = sc.nextInt();

        GraphList graph = new GraphList();

        for(int i = 0;i<m;i++){
            System.out.println("Enter u and v for edge");
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdge(u,v,false);
        }

        graph.print();

    }
}
