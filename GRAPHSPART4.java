
// import java.util.*;
// public class GRAPHSPART4 {

//     static class Edge{
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int wt){
//             this.src=s;
//             this.dest=d;
//             this.wt=wt;
//         }
//     }
//     public static void creategraph(ArrayList<Edge> graph[]){
//         for(int i=0;i<graph.length;i++){
//             graph[i]= new ArrayList<>();
//         }
//         graph[0].add(new Edge(0,1,10));
//         graph[0].add(new Edge(0,2,15));
//         graph[0].add(new Edge(0,3,30));

//         graph[1].add(new Edge(1,0,10));
//         graph[1].add(new Edge(1,3,40));

//         graph[2].add(new Edge(2,0,15));
//         graph[2].add(new Edge(2,3,50));

//         graph[3].add(new Edge(3,1,40));
//         graph[3].add(new Edge(3,2,50));
        

//     }

//     // public static void creategraph2(ArrayList<Edge> graph){
       
//     //     graph.add(new Edge(0,1,2));
//     //     graph.add(new Edge(0,2,4));

//     //     graph.add(new Edge(1,2,-4));
//     //     graph.add(new Edge(2,3,2));

//     //     graph.add(new Edge(3,4,4));
//     //     graph.add(new Edge(4,1,-1));

//     // }
//     // public static void bellmanford( ArrayList<Edge> graph[], int src){
//     //     int dis[]=new int[graph.length];
//     //     for(int i=0;i<dis.length;i++){
//     //         if(i!=src){
//     //             dis[i]=Integer.MAX_VALUE;
//     //         }
//     //     }
//     //     int V= graph.length;
//     //     for(int i=0;i<V-1;i++){// vertices
//     //         for(int j=0;j<V;j++){//edges
//     //             for(int k=0;k<graph[j].size();k++){
//     //                 Edge e= graph[j].get(k);
//     //                 int u=e.src;
//     //                 int v=e.dest;
//     //                 int wt= e.wt;

//     //                 if(dis[u]!=Integer.MAX_VALUE && dis[u]+wt <dis[v]){
//     //                     dis[v]=dis[u]+wt;
//     //                 }


//     //             }

//     //         }

//     //     }

//     //     for(int i=0;i<dis.length;i++){
//     //         System.out.print(dis[i]+" ");
//     //     }



//     // }

//     public static void bellmanford( ArrayList<Edge> graph, int src, int V){
//         int dis[]=new int[V];
//         for(int i=0;i<dis.length;i++){
//             if(i!=src){
//                 dis[i]=Integer.MAX_VALUE;
//             }
//         }
       
//         // vertices
//             for(int i=0;i<V-1;i++){//edges
//                for(int j=0;j<graph.size();j++){
//                     Edge e= graph.get(j);
//                     int u=e.src;
//                     int v=e.dest;
//                     int wt= e.wt;

//                     if(dis[u]!=Integer.MAX_VALUE && dis[u]+wt <dis[v]){
//                         dis[v]=dis[u]+wt;
//                     }


//                 }

//             }

        

//         for(int i=0;i<dis.length;i++){
//             System.out.print(dis[i]+" ");
//         }

//     }

    
//     static  class pair implements Comparable<pair>{
//     int n;
//     int cost;
//     pair(int n, int cost){
//         this.n=n;
//         this.cost=cost;
//     }
//     @Override
//     public int compareTo(pair p2){
//         return this.cost-p2.cost;
//     }

//    }

//    public static void primsalgo(ArrayList<Edge> graph[]){
//     boolean vis[]= new boolean[graph.length];
//     PriorityQueue<pair> pq= new PriorityQueue<>();
//     pq.add(new pair(0,0));
//     int cost=0;
//     while(!pq.isEmpty()){
//         pair curr= pq.remove();
//         if(!vis[curr.n]){
//             vis[curr.n]=true;
//             cost+=curr.cost;
//             for(int i=0;i<graph[curr.n].size();i++){
//                 Edge e= graph[curr.n].get(i);
//                 pq.add(new pair(e.dest, e.wt));
//             }
//         }

//     }
//     System.out.println(cost);

//    }
//     public static void main(String[] args) {
//         int V=5;
//         // ArrayList<Edge> graph[]= new ArrayList[V];
//         ArrayList<Edge> graph[]= new ArrayList[V];
//         creategraph(graph);
//         primsalgo(graph);
//         // creategraph2(graph);
//         // bellmanford(graph, 0, V);
//         // bellmanford(graph, 0);


//     }
    
// }
