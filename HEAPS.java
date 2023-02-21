import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
public class HEAPS {


    // static class student implements Comparable<student>{
    //     String name;
    //     int rank;
    //     student(String name, int rank){
    //         this.name= name;
    //         this.rank=rank;
    //     }

    //     @Override
    //     public int compareTo(student s2){
    //         return this.rank-s2.rank;
    //     }
    // }

     
    
    //  static class prob{
    //     ArrayList<Integer> a= new ArrayList<>();
       

    //    public void add(int data){
    //        a.add(data);

    //        int c= a.size()-1;
    //        int p= (c-1)/2;

    //        while(a.get(c)<a.get(p)){
    //            int temp=a.get(c);
    //            a.set(c,a.get(p));
    //            a.set(p,temp);

    //            c=p;
    //            p=(c-1)/2;
    //        }

    //    }

    //    public int peek(){
    //     return a.get(0);
    //    }
    //    public boolean  isEmpty(){
    //     return a.size()==0;
    //    }

    //    public void heapify(int i){
    //     int l=2*i+1;
    //     int r= 2*i+2;
    //     int min=i;
    //     if(l<a.size() && a.get(min)>a.get(l)){
    //         min=l;
    //     }
    //     if(r<a.size() && a.get(min)>a.get(r)){
    //         min=r;
    //     }

    //     if(min!=i){
    //         //swap
    //         int temp=a.get(i);
    //         a.set(i,a.get(min));
    //         a.set(min,temp);
    //         heapify(min);
    //     }

    //    }

    //    public  int remove(){
    //     int data= a.get(0);

    //     int temp=a.get(0);
    //       a.set(0,a.get(a.size()-1));
    //       a.set(a.size()-1,temp);
       
    //    a.remove(a.size()-1);
    //    heapify(0);
    //    return data;
    //    }
    // }
    // public static void heapifys(int arr[], int i, int size){
    //     int left=2*i+1;
    //     int right= 2*i+2;
    //     int max=i;

    //     if(left<size && arr[left]>arr[max]){
    //         max=left;
    //     }
    //     if(right<size && arr[right]>arr[max]){
    //         max=right;
    //     }
    //     if(max!=i){
    //         int temp = arr[i];
    //         arr[i]= arr[max];
    //         arr[max]=temp;
    //         heapifys(arr, max, size);
    //     }
    // }

    // public static void heapsort(int arr[]){
    //     //max heap
    //     //largest 
    //     int n= arr.length;
    //     for(int i= n/2;i>=0;i--){
    //         heapifys(arr, i, n );
    //     }
    //     for(int i=n-1;i>0;i--){
    //         int temp= arr[0];
    //         arr[0]= arr[i];
    //         arr[i]=temp;
    //         heapifys(arr, 0, i);
    //     }

    // }

    // public static void heapify(int arr[], int i, int size){
    //     int left= 2*i+1;
    //     int right= 2*i+2;
    //     int max=i;

    //     if(left<size && arr[left]>arr[max]){
    //         max=left;
    //     }
    //     if(right<size && arr[right]>arr[max]){
    //         max=right;
    //     }
    //     if(max!=i){
    //         int temp= arr[i];
    //         arr[i]= arr[max];
    //         arr[max]= temp;
    //         heapify(arr, max, size);
    //     }
    // }

    // public static void heapsort(int arr[]){
    //     // max heapify
    //     int n=arr.length;
    //     for(int i=n/2;i>=0;i--){
    //         heapify(arr, i, n);
    //     }



    //     // first and last swap 

    //     for(int i=n-1;i>0;i--){
    //         int temp=arr[0];
    //         arr[0]= arr[i];
    //         arr[i]= temp;
    //         heapify(arr, 0,i);
    //     }
    //     // heapify 
    // }

    static class point implements Comparable<point>{
        int x;
        int y;
        int ds;
        int idx;
       public  point(int x, int y, int ds, int idx){
            this.x=x;
            this.y=y;
            this.ds=ds;
            this.idx=idx;

        }
        @Override
        public int compareTo(point p2){
            return this.ds-p2.ds;

        }
    }


    public static int Nropes(int arr[]){

        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);

        }
        int cost=0;
        while(pq.size()>1){
        int min1= pq.remove();
        int min2= pq.remove();
        cost+= min1+min2;
        pq.add(min1+min2);

        }
        return cost;

    }

     static class soldier implements Comparable<soldier>{
        int count;
        int idx;
        soldier(int count, int idx){
            this.count= count;
            this.idx=idx;
        }
        @Override
        public int compareTo(soldier s2){
            if(this.count==s2.count){
                return this.idx-s2.idx;
            }else{
                return this.count-s2.count; 
            }
        }
    }


    static class pair implements Comparable<pair>{
        int val;
        int idx;
       public pair(int val, int idx){
            this.val=val;
            this.idx= idx;
        }
        @Override
        public int compareTo(pair p2){
            return p2.val-this.val;
        }
    }
    
    public static void main(String[] args) {

        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int res[]=new int[arr.length-k+1];


        PriorityQueue<pair> pq= new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(new pair(arr[i], i));
        }
        res[0]=pq.peek().val;
        for(int i=k;i<arr.length;i++){
            while(pq.size()>0 && pq.peek().idx <=(i-k)){
                pq.remove();
             
            }
            pq.add(new pair(arr[i], i));
            res[i-k+1]=pq.peek().val;
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
        // int k=2;
        // int arr[][]= {{1,0,0,0},
        //                 {1,1,1,1},
        //                 {1,0,0,0},
        //                 {1,0,0,0}};
        // PriorityQueue<soldier> pq= new PriorityQueue<>();
        // for(int i=0;i<arr.length;i++){
        //     int c=0;
        //     for(int j=0;j<arr[0].length;j++){
        //         c+=arr[i][j]==1?1:0;
        //     }
        //     pq.add(new soldier(c, i));
        // }

        // for(int i=0;i<k;i++){
        //     System.out.println(pq.remove().idx);
        // }
       
        // int arr[][]={{3,3},{5,-1},{-2,4}};
        // int k=2;
        // PriorityQueue<point> pq= new PriorityQueue<>();
        // for(int i=0;i<arr.length;i++){
        //     int ds= arr[i][0]*arr[i][0] + arr[i][1]*arr[i][1];
        //     pq.add(new point(arr[i][0], arr[i][1], ds, i));
        // }
       

        // for(int i=0;i<k;i++){
        //     System.out.println("C"+pq.remove().idx);
        // }
    
        // int arr[]={1,2,4,5,3};
        // PriorityQueue<student> pq =new PriorityQueue<>();
        // pq.add(new student("A",1));
        // pq.add(new student("Ab",3));
        // pq.add(new student("abc", 30));
        // // pq.add(new student("aaa", 0));
        // prob p= new prob();
        // p.add(1);
        // p.add(2);
        // p.add(3);
        // p.add(4);
        // p.remove();
        // while(!p.isEmpty()){
        //     System.out.println(p.remove());
            
        // }
        // heapsort(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }

        


//     }
    
// }
