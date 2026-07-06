package org.example.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Graph{
    int adj[][];
    int vertices;

    public Graph(int vertices){
        this.vertices = vertices;
        adj = new int[vertices][vertices];
    }

    public void addEdge(int u,int v,boolean direction){
        adj[u][v] = 1;
        if(!direction){
            adj[v][u] = 1;
        }
    }

    public void BFS(int start, boolean []visited, ArrayList<Integer> ans){
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);

            for(int i = 0;i<vertices;i++){
                if(adj[node][i] == 1 && !visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public void print(){
        for(int i  = 0;i<vertices;i++){
            for(int j = 0;j<vertices;j++){
                System.out.print(adj[i][j] + " ");
            }

            System.out.println();
        }
    }

}
public class GraphImpl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices");
        int n = sc.nextInt();
        System.out.println("Enter Number of edges");
        int m = sc.nextInt();

         Graph graph = new Graph(n);

         for(int i = 0;i<m;i++){
             int u = sc.nextInt();
             int v = sc.nextInt();

             graph.addEdge(u,v,false);

         }
         graph.print();


         // BFS impl

         ArrayList<Integer> ans = new ArrayList<>();

         boolean visited[] = new boolean[n];

         graph.BFS(0,visited,ans);

         for(int i : ans){
             System.out.print(i + " ");
         }


    }
}
