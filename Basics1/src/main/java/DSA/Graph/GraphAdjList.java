package DSA.Graph;

import java.util.*;


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

    void shortesPath(int start,int des,int n){
        Queue<Integer> q = new LinkedList<>();

        boolean []visited = new boolean[n];

        int []parent= new int[n];

        Arrays.fill(parent,-1);

        visited[start] = true;

        q.add(start);

        while(!q.isEmpty()){
            int front = q.poll();

            for(int i : adj.get(front)){
                if(!visited[i]){
                    visited[i] = true;
                    parent[i] = front;
                    q.add(i);
                }
            }
        }

        int curr = des;

        ArrayList<Integer> path = new ArrayList<>();
         path.add(des);

        while(curr != -1){
            path.add(curr);
            curr = parent[curr];
        }

        Collections.reverse(path);

        for(int i : path){
            System.out.println(i);
        }

        System.out.println("Distance " + (path.size()-1));
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

        int s = 0;
        int e = 6;

        graph.shortesPath(s,e,n);

    }
}
