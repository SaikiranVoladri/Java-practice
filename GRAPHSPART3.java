// import java.lang.reflect.Array;
// import java.util.*;
// public class GRAPHSPART3 {
//     static class Edge{
//                 int src;
//                 int dest;
//                 int weight;
        
//                public Edge(int s, int d, int wt){
//                     this.src=s;
//                     this.dest=d;
//                     this.weight=wt;
//                 }
//             }
        

//     public static void creategraph(ArrayList<Edge>graph[]){
//                 for(int i=0;i<graph.length;i++){
//                     graph[i]=new ArrayList<>();
//                 }
//                 graph[0].add(new Edge(0, 1,2));
//                 graph[0].add(new Edge(0, 2,4));

//                 graph[1].add(new Edge(1, 3,7));
//                 graph[1].add(new Edge(1, 2,1));

//                 graph[2].add(new Edge(2,4, 3));
//                 graph[3].add(new Edge(3,5, 1));

//                 graph[4].add(new Edge(4,3, 2));
//                 graph[4].add(new Edge(4,5, 5));
//                 //graph[2].add(new Edge(2, 3));
//                 // graph[3].add(new Edge(3, 4));
//                 // graph[4].add(new Edge(4, 2));
//                 // graph[4].add(new Edge(4, 3));
                
                
//             }



//             public static void indegree(ArrayList<Edge>graph[],int indegree[]){
//                 for(int i=0;i<graph.length;i++){
//                     int v=i;
//                     for(int j=0;j<graph[v].size();j++){
//                         Edge e= graph[v].get(j);
//                         indegree[e.dest]++;
//                     }

//                 }
//             }

//             public static void topsort(ArrayList<Edge>graph[]){
//                 int indegree[]= new int[graph.length];
//                 indegree(graph, indegree);
//                 Queue<Integer> q= new   LinkedList<>();
//                 for(int i=0;i<indegree.length;i++){
//                     if(indegree[i]==0){
//                         q.add(i);
//                     }
//                 }

//                 while(!q.isEmpty()){
//                     int curr= q.remove();
//                     System.out.print(curr+" ");
//                     for(int i=0;i<graph[curr].size();i++){
//                         Edge e= graph[curr].get(i);
//                         indegree[e.dest]--;
//                         if(indegree[e.dest]==0){
//                             q.add(e.dest);
//                         }
//                     }
//                 }

//             }


//             public static void printpath( ArrayList<Edge>graph[], int src, int dest, String path){
//                 if(src==dest){
//                     System.out.println(path+dest);
//                     return;
//                 }

//                 for(int i=0;i<graph[src].size();i++){
//                     Edge e= graph[src].get(i);

//                     printpath(graph, e.dest, dest, path+src);
//                 }
//             }


//         static class pair implements Comparable<pair>{
//             int n;
//             int path;
//             pair(int n, int path){
//                 this.n=n;
//                 this.path=path;
//             }

//             @Override
//             public int compareTo(pair p2){
//                 return this.path-p2.path;
//             }

//         }

//         public static void dijkistra(ArrayList<Edge> graph[], int src){
//             int dis[]= new int[graph.length];
//             boolean vis[]= new boolean[graph.length];

//             for(int i=0;i<dis.length;i++){
//                 if(i!=src){
//                 dis[i]=Integer.MAX_VALUE;
//             }}

//             PriorityQueue<pair> pq= new PriorityQueue<>();
//             pq.add(new pair(src, 0));

//             while(!pq.isEmpty()){
//                 pair curr=pq.remove();
//                 if(!vis[curr.n]){
//                     vis[curr.n]=true;
//                     for(int i=0;i<graph[curr.n].size();i++){
//                         Edge e= graph[curr.n].get(i);
//                         int u= e.src;
//                         int v= e.dest;
//                         int w= e.weight;

//                         if(dis[u]+w <dis[v]){
//                             dis[v]=dis[u]+w;
//                             pq.add(new pair(v,dis[v]));
//                         }
//                     }
//                 }

//             }
//             for(int i=0;i<dis.length;i++){
//                 System.out.print(dis[i]+" ");
//             }
            
//         }
//         public static void main(String[] args) {
//         // int V=4;
//         ArrayList<Edge>graph[]= new ArrayList[6];
//         creategraph(graph);

//         int src=0;
//         dijkistra(graph, src);
//         // topsort(graph);
//         // printpath(graph, 5, 1, "");
//         // boolean ans= cycle(graph);
//         // System.out.println(ans);
        

//     }
    
// }
    

