
// import java.util.*;
// public class ARRAYS {
    // //updation in an array 
    // public static void update(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         arr[i]=arr[i]+1;
    //     }
        
    // }

    // public static void print(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.println(arr[i]);
    //     }
    // }

    // public static int linearsearch(int arr[], int n){
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==n){
    //             return i;
    //         }
    //     }
    //     return 0;
    // }

    // public static int binarysearch(int arr[], int n){
    //     int s=arr[0];
    //     int e= arr.length;
    //     while(s<e){
    //         int mid=(s+e)/2;
    //         if(arr[mid]==n){
    //             return mid;
    //         }else if(arr[mid]<n){
    //             s=mid+1;
    //         }else{
    //             e=mid-1;
    //         }
    //     }
    //     return -1;
    // }
    // public static int largest(int arr[]){
    //     int max=Integer.MAX_VALUE;
    //     int n= arr.length;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]<max){
    //             max=arr[i];
    //         }
    // //     }
    // //     return max;
    // // }
    // public static void reverse(int arr[]){
    //     int s=0;
    //     int e=arr.length-1;
    //     while(s<=e){
    //         int temp= arr[s];
    //         arr[s]=arr[e];
    //         arr[e]=temp;
    //         s++;
    //         e--;
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+ " ");
    //     }
    // }
    //maximum subarray problem 
    // public static void maxsubarray(int arr[]){
    //     int csum=0;
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         csum+=arr[i];
    //         if(csum<0){
    //             csum=0;
    //         }
           
          
    //     }
    //     max=Math.max(max,csum);
       
    // }
    // public static void BASstocks(int arr[]){
    //     int buyprize = Integer.MAX_VALUE;
    //     int maxprofit=0;//716
    //     for(int i=0;i<arr.length;i++){
    //         if(buyprize<arr[i]){
    //             int profit= arr[i]-buyprize;
    //             maxprofit=Math.max(maxprofit,profit);
               
    //             System.out.print(maxprofit+".");
    //         } else{
    //             buyprize=arr[i];
    //            System.out.print(buyprize+ ",");
    //         }

    //     }
    //     System.out.println();
    //     System.out.print(maxprofit+" ");
    // }
    //printpairs
    // public static void printpairs(int arr[]){
    //     int n= arr.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             System.out.print("("+arr[i]+","+arr[j]+ ")");
    //         }
    //         System.out.println();
    //     }
    // }
//   public static void printpairs(int arr[]){
//     for(int i=0;i<arr.length;i++){
//         int start=i;
//         for(int j=0;j<arr.length;j++){
//             int end=j;
//             for(int k=start;k<end;k++){
//                 System.out.print(arr[k]+" ");
//             }

//         }
//         System.out.println();

//     }
//   }  
//     public static void main(String[] args) {
//         int arr[]= {1,2,3,4,5};
    
//     }
    
// }
