// import java.util.*;
// // public class SEGMENTTREES {

// //     static int tree[];
// //    public static void initialize(int n){
// //         tree= new int [4*n];
// //     }

// //     public static int buildST(int arr[], int i, int start , int end){
// //         if(start==end){
// //             tree[i]=arr[start];
// //             return arr[start];
// //         }

// //         int mid= (start+end)/2;

// //         buildST(arr, 2*i+1, start, mid);
// //         buildST(arr, 2*i+2, mid+1, end);

// //         tree[i]= tree[2*i+1]+tree[2*i+2];
// //         return tree[i];
// //     }
// //     public static int Getsumutil(int i,int si, int sj, int qi, int qj){
// //         if(qj<=si || qi>=sj){
// //             return 0;// non overlapping
// //         }
// //         else if(si>=qi && sj<=qj){
// //             return tree[i];
// //         }

// //         else{
// //             int mid= (si+sj)/2;
// //             int left = Getsumutil(2*i+1, si, mid, qi, qj);
// //             int right= Getsumutil(2*i+2, mid+1, sj, qi, qj);
// //             return left+right;
// //             }
// //     }

// //     public static int Getsum(int arr[], int qi, int qj){
// //         int n= arr.length;
// //         return Getsumutil(0, 0, n-1, qi, qj);
// //     }


// //     public static void updateutil(int i,int si, int sj, int idx, int diff){
// //         if(idx>sj || idx<si){
// //             return;
// //         }
// //         tree[i]+=diff;
// //         if(si!=sj){
// //         int mid= (si+sj)/2;
// //         updateutil(2*i+1, si, mid, idx, diff);
// //         updateutil(2*i+2, mid+1, sj, idx, diff);
// //         }
// //     }
// //     public static void update(int arr[], int idx, int newval){
// //         int n= arr.length;

// //         int diff= newval-arr[idx];
// //         arr[idx]= newval;
// //         updateutil(0, 0, n-1, idx, diff);
        
// //     }
// //     public static void main(String[] args) {
// //         int arr[]= {1,2,3,4,5,6,7,8};
// //         int n= arr.length;
// //         initialize(n);
// //         buildST(arr, 0, 0, n-1);
// //         // for(int i=0;i<tree.length;i++){
// //         //     System.out.print(tree[i]+" ");
// //         // }

// //     System.out.println(Getsum(arr, 2, 5));
// //     update(arr, 2, 2);
// //     System.out.println(Getsum(arr, 2, 5));
// //     }
    
// // }


// public class SEGMENTTREES{

//     static int tree[];
//     public static void init(int n){
//         tree= new int[4*n];
//     }

//     public static void buildtree(int arr[], int i, int si, int sj){
//         if(si==sj){
//             tree[i]=arr[si];
//             return ;
//         }

//         int mid= (si+sj)/2;
//         buildtree(arr, 2*i+1, si, mid);
//         buildtree(arr, 2*i+2,mid+1, sj);
//         tree[i]= Math.min(tree[2*i+1],tree[2*i+2]);
//     }


//     public static int getmax(int arr[], int qi, int qj){
//         int n= arr.length;
//         return getmaxutil(0,0,n-1,qi,qj);
//     }

//     public static int getmaxutil(int i, int si, int sj, int qi, int qj){
//         if(si>qj || sj<qi){
//             return Integer.MAX_VALUE;
//         }
//         else if(si>=qi && sj<=qj){
//             return tree[i];
//         }
//         else{
//             int mid=(si+sj)/2;
//             int l=getmaxutil(2*i+1, si, mid, qi, qj);
//             int r= getmaxutil(2*i+2, mid+1, sj, qi, qj);
//             return Math.min(l,r);
//         }
//     }
//     public static void updateutil(int i, int si, int sj, int idx, int newval){
//         if(idx <si || idx >sj){
//             return ;
//         }
//         if(si==sj){
//             tree[i]= newval;
//         }
//         if(si!=sj){
//         tree[i]=Math.min(tree[i],newval);
//         int mid=(si+sj)/2;
//         updateutil(2*i+1, si, mid, idx, newval);
//         updateutil(2*i+2, mid+1, sj, idx, newval);
//         }

//     }
//     public static void update(int arr[], int idx, int newval){
//         arr[idx]=newval;
//         int n= arr.length;
//         updateutil(0,0,n-1,idx,newval);
//     }
//     public static void main(String[] args) {
//             int arr[]= {6,8,-1,2,17,1,3,2,4};
//             int n= arr.length;
//             init(n);
//             buildtree(arr, 0, 0, n-1);
//              int sum =getmax(arr, 2, 5);
//              System.out.println(sum);

//             update(arr, 2, 20);
//              System.out.println();
//             // for(int i=0;i<tree.length;i++){
//             //     System.out.print(tree[i]+" ");
//             // }
//              sum =getmax(arr, 2, 5);
//              System.out.println(sum);
            
//      }
// }
