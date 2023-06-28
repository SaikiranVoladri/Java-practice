import java.util.*;
public class GRAPHS {


//     static class Edge{
//             int src;
//             int dest;
//             int weight;

//         public Edge(int s, int d, int w){
//             this.src=s;
//             this.dest= d;
//             this.weight=w;
//         }

//     }
//     public static void main(String[] args) {
//         //sample creation 
//         // int arr[]= new int [size];
//         // dtype arr   new type [size];
//         int V=5;
//         ArrayList<Edge>[] graph= new ArrayList[V];;
//         for(int i=0;i<V;i++){
//             graph[i]= new ArrayList<>();
//         }

//         graph[0].add(new Edge(0,1,5));

//         graph[1].add(new Edge(1,0,5));
//         graph[1].add(new Edge(1, 2, 1));
//         graph[1].add(new Edge(1,3,3));

//         graph[2].add(new Edge(2, 1, 1));
//         graph[2].add(new Edge(2,3,1));
//         graph[2].add(new Edge(2, 4, 1));

//         graph[3].add(new Edge(3,2,1));
//         graph[3].add(new Edge(3, 1, 3));
//         graph[4].add(new Edge(4, 2, 2));

//         for(int i=0;i<graph[2].size();i++){
//             Edge e= graph[2].get(i);
//             System.out.println(e.dest);
//         }


//     }
    
// }

static class Edge{
    int src;
    int dest;
    int wt;
    Edge(int s, int d, int wt){
        this.src=s;
        this.dest=d;
        this.wt=wt;
    }
}
public static void creategraph(ArrayList<Edge>graph[]){
    for(int i=0;i<graph.length;i++){
        graph[i]= new ArrayList<>();
    }
        graph[0].add(new Edge(0,1,5));

        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1,3,3));

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3,2,1));
        graph[3].add(new Edge(3, 1, 3));
        graph[4].add(new Edge(4, 2, 2));
    
}

public static void Bfs(ArrayList<Edge> graph[]){
    Queue<Integer> q= new LinkedList<>();
    boolean vis[]= new boolean[graph.length];
    q.add(2);

    while(!q.isEmpty()){
        int curr=q.remove();
        if(!vis[curr]){
            //print
            System.out.println(curr+" ");
            vis[curr]=true;
            //add neighbours
            for(int i=0;i<graph[curr].size();i++){
                Edge e= graph[curr].get(i);
                q.add(e.dest);
            }
        }
    }
}


public static void Dfs(ArrayList<Edge>graph[], int curr,boolean vis[]){
    System.out.print(curr);
    vis[curr]=true;
    for(int i=0;i<graph[curr].size();i++){
        Edge e= graph[curr].get(i);

        if(!vis[e.dest]){
            Dfs(graph, e.dest, vis);
        }

    }
}

public static boolean hashpath(ArrayList<Edge>graph[], int src, int dest ,boolean vis[]){
    if(src==dest){
        return true;
    }
    vis[src]=true;
    for(int i=0;i<graph[src].size();i++){
        Edge e= graph[src].get(i);

        if(!vis[e.dest]&& hashpath(graph, e.dest, dest, vis)){
            return true;
        }
    }
    return false;

}


public static void main(String[] args) {
    //arraylist array
    // int V=7
    ArrayList<Edge>graph[]= new ArrayList[7];
    creategraph(graph);
    // Bfs(graph);
    // Dfs(graph, 2, new boolean[7]);

   boolean s= hashpath(graph, 0, 6, new boolean[5]);
   System.out.println(s);
}

}
