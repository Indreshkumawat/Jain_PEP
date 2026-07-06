package DSA.SectionC;

import java.lang.reflect.GenericArrayType;
import java.util.*;

class GraphList{
    HashMap<Integer,ArrayList<Integer>> adj = new HashMap<>();
    void addEdge(int u,int v,boolean direction){
        adj.putIfAbsent(u,new ArrayList<>());
        adj.putIfAbsent(v,new ArrayList<>());

        adj.get(u).add(v);

        if(!direction){
            adj.get(v).add(u);
        }
    }
}




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
    public void BFS(int start, boolean visited[], ArrayList<Integer> ans){
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

    void DFS(int start, boolean visited[], ArrayList<Integer> ans){
        visited[start] = true;
        ans.add(start);

        for(int i = 0;i< vertices;i++){
            if(adj[start][i] == 1 && !visited[i]){
                visited[i] = true;
                DFS(i,visited,ans);
            }
        }
    }
    public void print(){
        for(int i = 0;i<vertices;i++){
            for(int j = 0;j<vertices;j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }

}
public class GraphImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no the nodes");
        int n = sc.nextInt();

        System.out.println("enter no the edges");
        int m = sc.nextInt();

        Graph graph = new Graph(n);

        for(int i = 0;i<m;i++){
            System.out.println("Enter the u and v");
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdge(u,v,false);
        }

        graph.print();

        // BFS

        boolean visited[]= new boolean[n];

        ArrayList<Integer> ans = new ArrayList<>();

        graph.BFS(0,visited,ans);

        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}
