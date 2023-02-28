// import java.util.ArrayList;

// // import java.util.*;
// // public class GRAPHSPART2 {


// // //     static class Edge{
// // //             int src;
// // //             int dest;
// // //             int weight;

// // //         public Edge(int s, int d, int w){
// // //             this.src=s;
// // //             this.dest= d;
// // //             this.weight=w;
// // //         }

// // //     }
// // //     public static void main(String[] args) {
// // //         //sample creation 
// // //         // int arr[]= new int [size];
// // //         // dtype arr   new type [size];
// // //         int V=5;
// // //         ArrayList<Edge>[] graph= new ArrayList[V];;
// // //         for(int i=0;i<V;i++){
// // //             graph[i]= new ArrayList<>();
// // //         }

// // //         graph[0].add(new Edge(0,1,5));

// // //         graph[1].add(new Edge(1,0,5));
// // //         graph[1].add(new Edge(1, 2, 1));
// // //         graph[1].add(new Edge(1,3,3));

// // //         graph[2].add(new Edge(2, 1, 1));
// // //         graph[2].add(new Edge(2,3,1));
// // //         graph[2].add(new Edge(2, 4, 1));

// // //         graph[3].add(new Edge(3,2,1));
// // //         graph[3].add(new Edge(3, 1, 3));
// // //         graph[4].add(new Edge(4, 2, 2));

// // //         for(int i=0;i<graph[2].size();i++){
// // //             Edge e= graph[2].get(i);
// // //             System.out.println(e.dest);
// // //         }


// // //     }
    
// // // }

// // static class Edge{
// //     int src;
// //     int dest;
// //     int wt;
// //     Edge(int s, int d, int wt){
// //         this.src=s;
// //         this.dest=d;
// //         this.wt=wt;
// //     }
// // }
// // public static void creategraph(ArrayList<Edge>graph[]){
// //     for(int i=0;i<graph.length;i++){
// //         graph[i]= new ArrayList<>();
// //     }
// //         graph[0].add(new Edge(0,1,5));

// //         graph[1].add(new Edge(1,0,5));
// //         graph[1].add(new Edge(1, 2, 1));
// //         graph[1].add(new Edge(1,3,3));

// //         graph[2].add(new Edge(2, 1, 1));
// //         graph[2].add(new Edge(2,3,1));
// //         graph[2].add(new Edge(2, 4, 1));

// //         // graph[3].add(new Edge(3,2,1));
// //         // graph[3].add(new Edge(3, 1, 3));
// //         // graph[4].add(new Edge(4, 2, 2));
    
// // }
// // public static void bfs(ArrayList<Edge> graph[]){
// //     boolean vis[]= new boolean[graph.length];

// //     for(int i=0;i<graph.length;i++){
// //         if(!vis[i]){
// //             Bfsutil(graph, vis);
// //         }
// //     }
// // }
// // public static void Bfsutil(ArrayList<Edge> graph[],  boolean vis[]){
// //     Queue<Integer> q= new LinkedList<>();
    
// //     q.add(2);

// //     while(!q.isEmpty()){
// //         int curr=q.remove();
// //         if(!vis[curr]){
// //             //print
// //             System.out.println(curr+" ");
// //             vis[curr]=true;
// //             //add neighbours
// //             for(int i=0;i<graph[curr].size();i++){
// //                 Edge e= graph[curr].get(i);
// //                 q.add(e.dest);
// //             }
// //         }
// //     }
// // }

// // public static void Dfs(ArrayList<Edge>graph[]){
// //     boolean vis[]= new boolean[graph.length];
// //     for(int i=0;i<graph.length;i++){
// //         if(!vis[i]){
// //             Dfsutil(graph, i, vis);
// //         }
// //     }

    

// // }
// // public static void Dfsutil(ArrayList<Edge>graph[], int curr,boolean vis[]){
// //     System.out.print(curr);
// //     vis[curr]=true;
// //     for(int i=0;i<graph[curr].size();i++){
// //         Edge e= graph[curr].get(i);

// //         if(!vis[e.dest]){
// //             Dfsutil(graph, e.dest, vis);
// //         }

// //     }
// // }

// // public static boolean hashpath(ArrayList<Edge>graph[], int src, int dest ,boolean vis[]){
// //     if(src==dest){
// //         return true;
// //     }
// //     vis[src]=true;
// //     for(int i=0;i<graph[src].size();i++){
// //         Edge e= graph[src].get(i);

// //         if(!vis[e.dest]&& hashpath(graph, e.dest, dest, vis)){
// //             return true;
// //         }
// //     }
// //     return false;

// // }

// // public static boolean cycle( ArrayList<Edge>graph[]){
// //     boolean vis[]= new boolean[graph.length];
// //     for(int i=0;i<graph.length;i++){
// //         if(!vis[i]){
// //             if(cycleutil(graph, vis, i, -1)){
// //             return true;
// //         }
// //         }
        
// //     }
// //     return false;
// // }

// // public static boolean cycleutil( ArrayList<Edge>graph[],boolean vis[], int curr, int par){
// //     vis[curr]=true;
// //     for(int i=0;i<graph[curr].size();i++){
// //         Edge e= graph[curr].get(i);
// //         if(!vis[e.dest]){
// //             if(cycleutil(graph, vis, e.dest, curr)){
// //                 return true;
// //             }
// //         }
// //         else if(vis[e.dest]&& e.dest!=par){
// //             return true;
// //         }
// //     }
// //     return false;
// // }

// // public static boolean bipartite(ArrayList<Edge>graph[]){
// //     int col[]= new int[graph.length];
// //     for(int i=0;i<col.length;i++){
// //         col[i]=-1;
// //     }
// //     Queue<Integer> q= new LinkedList<>();
// //     for(int i=0;i<graph.length;i++){
// //         if(col[i]==-1){
// //             q.add(i);//bfs
// //             col[i]=0;//yellow
        
// //         while(!q.isEmpty()){
// //             int curr= q.remove();
// //             for(int j=0;j<graph[curr].size();j++){
// //                 Edge e= graph[curr].get(i);
// //                 if(col[e.dest]==-1){
// //                     int nextcol=col[curr]==0?1:0;
// //                     col[e.dest]=nextcol;
// //                     q.add(e.dest);
// //                 }
// //                 else if(col[e.dest]==col[curr]){
// //                     return false;
// //                 }
// //             }
// //         }
// //       }
// //      }
// //     return true;
// //    }
// // public static void main(String[] args) {
// //     //arraylist array
// //     // int V=7
// //     ArrayList<Edge>graph[]= new ArrayList[5];
// //     creategraph(graph);
// //     // bfs(graph);
// //     // Dfs(graph);
// //     boolean ans= bipartite(graph);
// //     System.out.println(ans);

// // //    boolean s= hashpath(graph, 0, 6, new boolean[5]);
// // //    System.out.println(s);
// //  }


// import java.util.*;
// public class GRAPHSPART2{
//     static class Edge{
//         int src;
//         int dest;

//        public Edge(int s, int d){
//             this.src=s;
//             this.dest=d;
//         }
//     }

//     public static void creategraph(ArrayList<Edge>graph[]){
//         for(int i=0;i<graph.length;i++){
//             graph[i]=new ArrayList<>();
//         }

//         graph[2].add(new Edge(2, 3));
//         graph[3].add(new Edge(3, 1));
//         graph[4].add(new Edge(4, 0));
//         graph[4].add(new Edge(4, 1));
//         graph[5].add(new Edge(5, 0));
//         graph[5].add(new Edge(5, 2));
//         //graph[2].add(new Edge(2, 3));
//         // graph[3].add(new Edge(3, 4));
//         // graph[4].add(new Edge(4, 2));
//         // graph[4].add(new Edge(4, 3));
        
        
//     }

//     public static boolean bipartite(ArrayList<Edge>graph[]){
//         int col[]= new int[graph.length];
//         for(int i=0;i<col.length;i++){
//             col[i]=-1;
//         }


//         Queue<Integer> q= new LinkedList<>();
//         for(int i=0;i<graph.length;i++){
//             if(col[i]==-1){
//                 q.add(i);//bfs
//                 col[i]=0;//yellow
//                while(!q.isEmpty()){
//                 int curr= q.remove();
//                 for(int j=0;j<graph[curr].size();j++){
//                     Edge e= graph[curr].get(j);
//                     if(col[e.dest]==-1){
//                         int nextcol=col[curr]==0?1:0;
//                         col[e.dest]=nextcol;
//                         q.add(e.dest);
//                     }
//                     else if(col[e.dest]==col[curr]){
//                         return false;
//                     }
//                 }}
//             }
//         }
//         return true;
//     }


//     public static boolean cycle(ArrayList<Edge>graph[]){
//         boolean vis[]= new boolean[graph.length];
//         boolean stack[]= new boolean[graph.length];
//         for(int i=0;i<graph.length;i++){
//             if(!vis[i]){
//                if(cycleutil(graph, i, vis, stack)) {
//                 return true;
//                }
//             }
//         }
//         return false;
//     }

//     public static boolean cycleutil(ArrayList<Edge>graph[], int curr, boolean vis[], boolean stack[]){
//         vis[curr]=true;
//         stack[curr]=true;

//         for(int i=0;i<graph[curr].size();i++){
//             Edge e= graph[curr].get(i);
//             if(stack[e.dest]){
//                 return true;
//             }
//             if(!vis[e.dest]&& cycleutil(graph, e.dest, vis, stack)){
//                 return true;
//             }
//         }
//         stack[curr]=false;
//         return false;
//     }

//     public static void topsort(ArrayList<Edge>graph[]){
//         boolean vis[]= new boolean[graph.length];
//         Stack<Integer> s= new Stack<>();
//         for(int i=0;i<graph.length;i++){
//             if(!vis[i]){
//                 topsortutil(graph,i,vis,s);
//             }
//         }

//         while(!s.isEmpty()){
//             System.out.print(s.pop()+" ");
//         }
//     }
//     public static void topsortutil(ArrayList<Edge>graph[], int curr, boolean vis[], Stack<Integer>s){
//         vis[curr]=true;
//         for(int i=0;i<graph[curr].size();i++){
//             Edge e= graph[curr].get(i);
//             if(!vis[e.dest]){
//                 topsortutil(graph, e.dest, vis, s);
//             }
         

//         }   s.push(curr);

//     }
//     public static void main(String[] args) {
//         // int V=4;
//         ArrayList<Edge>graph[]= new ArrayList[6];
//         creategraph(graph);
//         // boolean ans= cycle(graph);
//         // System.out.println(ans);
//         topsort(graph);

//     }
    
// }
