// import java.util.*;
// public class DPPART6 {


//     public static int matrixmultiplication(int arr[], int i, int j){
//         if(i==j){
//             return 0;
//         }
//         int ans= Integer.MAX_VALUE;
//         for(int k=i;k<=j-1;k++){
//             int c1= matrixmultiplication(arr, i, k);
//             int c2= matrixmultiplication(arr, k+1, j);
//             int c3= arr[i-1]*arr[k]*arr[j];
//             int totans= c1+c2+c3;
//              ans= Math.min(ans,totans);

//         }
//         return ans;
//     }
//     public static int mem(int arr[] , int i, int j, int dp[][]){
//         if(i==j){
//             return 0;
//         }
//         if(dp[i][j]!=-1){
//             return dp[i][j];
//         }
//         int ans=Integer.MAX_VALUE;
//         for(int k=i;k<=j-1;k++){
//             int c1= mem(arr, i, k, dp);
//             int  c2= mem(arr, k+1, j, dp);
//             int c3= arr[i-1]*arr[k]*arr[j];
//            int  totans= c1+c2+c3;
//             ans =Math.min(ans,totans);

//         }
//         dp[i][j]=ans;
//         return dp[i][j];
//     }


//     public static int tab(int arr[]){
//         int n=arr.length;
//         int dp[][]= new int [n][n];
//         for(int i=0;i<n;i++){
//             dp[i][i]=0;
//         }


//         for(int len=2;len<=n-1;len++){
//             for(int i=1;i<=n-len;i++){
//                 int j= i+len-1;
//                 dp[i][j]= Integer.MAX_VALUE;
//                 for(int k=i;k<=j-1;k++){
//                     int c1= dp[i][k];
//                     int c2= dp[k+1][j];
//                     int c3= arr[i-1]*arr[k]*arr[j];
//                     dp[i][j]= Math.min(dp[i][j], c1+c2+c3);
//                 }
//             }
//         }
//         return dp[1][n-1];
       
//     }

//     public static int minarrjumps(int arr[]){
//         int n= arr.length;
//         int dp[]= new int[n];
//         Arrays.fill(dp,-1);
//         dp[n-1]=0;

//         for(int i=n-2;i>=0;i--){
//             int steps= arr[i];
//             int ans= Integer.MAX_VALUE;
//             for(int j=i+1;j<=i+steps && j<n ;j++){
//                 if(dp[j]!=-1){
//                     ans= Math.min(ans, dp[j]+1);
//                 }
//             }
//             if(ans!=Integer.MAX_VALUE){
//                 dp[i]=ans;
//             }
//         }

//         for(int i=0;i<dp.length;i++){
//             System.out.print(dp[i]+" ");

//         }
//         System.out.println();
//         return dp[0];

//     }
// public static void main(String[] args) {
//     int arr[]={2,3,1,1,4};
//     // int n= arr.length;
//     //int anser=matrixmultiplication(arr, 1, n-1);
//    // System.out.println(anser);
//     // System.out.println(tab(arr));
//     System.out.println(minarrjumps(arr));

//     // int dp[][]= new int[n][n];
//     // for(int i=0;i<n;i++){
//     //     Arrays.fill(dp[i], -1);
//     // }
//     // System.out.println(mem(arr, 1, n-1, dp));
    
// }
    

    
// }
