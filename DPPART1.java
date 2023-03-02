// import java.util.*;
// public class DPPART1 {

//     public static int fib(int n, int dp[]){
//         if(n==0 || n==1){
//             return n;
//         }

//         if(dp[n]!=0){// dynamic programming => storing into anathor array instaed of calling again
//             return dp[n];
//         }
//         dp[n]=fib(n-1,dp)+fib(n-2,dp);

//         return  dp[n];
//     }



//     // dynamic programming using  tabulization 

//     public static int fibonacci(int n){
//        int  dp[]= new int [n+1];
//        dp[0]=0;
//        dp[1]=1;
//        for(int i=2;i<=n;i++){
//         dp[i]=dp[i-1]+dp[i-2];
//        }

//        return dp[n];
//     }

//         public static int countways(int n){//reccursion
//             if(n==0){
//                 return 1;
//             }
//             if(n<0){
//                 return 0;
//             }

//             return countways(n-1)+countways(n-2);
//         }

//         public static int countways(int n, int dp[]){
//             if(n==0){
//                 return 1;
//             }
//             if(n<0){
//                 return 0;
//             }

//             if(dp[n]!=-1){
//                 return dp[n];
//             }
//             dp[n]= countways(n-1,dp)+countways(n-2,dp);
//             return dp[n];
//         }

//         public static int fabotab(int n){
//         int dp[]= new int [n+1];
//         dp[0]=1;
//         dp[1]=1;
//         for(int i=2;i<=n;i++){
//             dp[i]=dp[i-1]+dp[i-2];
//         }
//         return dp[n];
//         }
//     public static void main(String[] args) {
//         int n=6;
//         int dp[]= new int[n+1];
//         Arrays.fill(dp,-1);
        
//         System.out.println(countways(n,dp));
//         System.out.println(fabotab(n));
//     }
    
// }
