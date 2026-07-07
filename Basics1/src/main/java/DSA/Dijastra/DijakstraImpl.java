package DSA.Dijastra;


import java.util.*;

class Pair{
    int weight;
    int node;

    Pair(int node,int weight){
        this.node = node;
        this.weight = weight;
    }
}

class GraphList{
    HashMap<Integer, ArrayList<Pair>> adj = new HashMap<>();

    void addEdge(int u,int v,int weight,boolean direction){
        adj.putIfAbsent(u,new ArrayList<>());
        adj.putIfAbsent(v,new ArrayList<>());

        adj.get(u).add(new Pair(v,weight));
        if(!direction){
            adj.get(v).add(new Pair(u,weight));
        }
    }
//    void print(){
//        for(Map.Entry<Integer,ArrayList<Integer>> mp : adj.entrySet())
//        {
//            System.out.println(mp.getKey() + "->");
//
//            for(int neigh : mp.getValue()){
//                System.out.println(neigh);
//            }
//
//            System.out.println();
//        }
//
//    }

    void dijkstra(int start,int n){
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> a.weight - b.weight);

        int dist[] = new int[n];

        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start] = 0;

        pq.add(new Pair(start,0));

        while(!pq.isEmpty()){
            Pair curr = pq.poll();

            int node = curr.node;
            int weight = curr.weight;

            if(weight > dist[node]){
                continue;
            }

            for(Pair neigh : adj.getOrDefault(node,new ArrayList<>())){

                if(dist[node] + neigh.weight < dist[neigh.weight]){
                    dist[neigh.node] = dist[node] + neigh.weight;

                    pq.add(new Pair(neigh.node,dist[neigh.node]));
                }
            }
        }

        for(int i = 0;i<n;i++){
            System.out.println(dist[i]+" ");
        }
    }
}
public class DijakstraImpl {
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
