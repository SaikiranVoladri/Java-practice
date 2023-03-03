// import java.util.*;
// public class DPPART2 {

//     public static int Knapsack(int val[], int wt[], int C, int n,int dp[][]){
//         if(n==0 || C==0){
//             return 0;
//         }

//         if(dp[n][C]!=-1){
//             return dp[n][C];

//         }
//         if(wt[n-1]<=C){
//             //2 cases 1 include and exclude
//             int ans=val[n-1]+Knapsack(val, wt, C-wt[n-1], n-1,  dp);

//             int ans2=Knapsack(val, wt, C, n-1,dp);

//              dp[n][C]= Math.max(ans,ans2);
//             return dp[n][C];
//         }
//         else{
//            dp[n][C]= Knapsack(val, wt, C, n-1,dp);
//            return dp[n][C];
//         }
//     }


//     public static int  KnapsackTab(int val[], int wt[], int C){
//         int n= val.length;
//         int dp[][]= new int[n+1][C+1];
//         for(int i=0;i<n+1;i++){
//             dp[i][0]=0;
//         }
//         for(int j=0;j<C+1;j++){
//             dp[0][j]=0;
//         }
//         for(int i=1;i<n+1;i++){
//             for(int j=1;j<C+1;j++){
//                 int v=val[i-1];
//                 int wts= wt[i-1];

//                 if(wts <=j){
//                     // include 

//                     int inc= v+dp[i-1][j-wts];
//                     //exclude
//                     int exc= dp[i-1][j];

//                     dp[i][j]= Math.max(inc,exc);
//                 }else{
//                     dp[i][j]= dp[i-1][j];
//                 }

//             }
//         }
//         //print(dp);
//         return dp[n][C];
//     }

//     public static void print(boolean dp[][]){
//         for(int i=0;i<dp.length;i++){
//             for(int j=0;j<dp[0].length;j++){
//                 System.out.print(dp[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }


//     public static boolean targetsum(int arr[], int sum){
//         int n= arr.length;
//          boolean dp[][]= new boolean[n+1][sum+1];

//          for(int i=0;i<n+1;i++){
//             dp[i][0]=true;
//          }

//          for(int i=1;i<n+1;i++){
//             for(int j=1;j<sum+1;j++){

//                 int v= arr[i-1];
//                 if(v<=j && dp[i-1][j-v]==true){
//                     dp[i][j]=true;

//                 }
//                 else if(dp[i-1][j]==true){
//                     dp[i][j] =true;
//                 }

//             }
//          }
//         print(dp);
//          return dp[n][sum];
//     }
//     public static int unboundedknapsack(int val[], int wt[], int C){
//         int n= val.length;
//        int dp[][]= new int [n+1][C+1];

//         for(int i=0;i<n+1;i++){
//             dp[i][0]=0;
//         }
//         for(int j=0;j<n+1;j++){
//             dp[0][j]=0;

//         }

//         // unbounded knapsack

//         for(int i=1;i<n+1;i++){
//             for(int j=0;j<C+1;j++){
//                 int v= val[i-1];
//                 int wts= wt[i-1];

//                 if(wts<=j){
//                     dp[i][j]= Math.max(v+dp[i][j-wts],dp[i-1][j]);
//                 }
//                 else{
//                     dp[i][j]= dp[i-1][j];
//                 }
//             }
            
//         }

//         return dp[n][C];
//     }
// public static void main(String[] args) {
//     int val[]={15,14,10,45,30};
//     int wt[]={2,5,1,3,4};
//     int C=7;
//     System.out.println(unboundedknapsack(val, wt, C));
//     // int arr[]={4,2,7,1,3};
//     // int sum=10;

//     // int dp[][]= new int [val.length+1][C+1];
//     // for(int i=0;i<dp.length;i++){
//     //     for(int j=0;j<dp[0].length;j++){
//     //         dp[i][j]=-1;
//     //     }
//     // }
// //  System.out.println( targetsum(arr, sum));



    
// }
    
// }
