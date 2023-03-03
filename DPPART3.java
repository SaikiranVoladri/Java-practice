// public class DPPART3 {

//     // public static int coinschange(int coins[], int sum){
//     // //     int n= coins.length;
//     // //     int dp[][]= new int [n+1][sum+1];

//     // //     for(int i=0;i<n+1;i++){
//     // //         dp[i][0]=1;
//     // //     }
//     // //     for(int j=1;j<sum+1;j++){
//     // //         dp[0][j]=0;
//     // //     }


//     // //     for(int i=1;i<n+1;i++){
//     // //         for(int j=1;j<sum+1;j++){
//     // //             int v=coins[i-1];

//     // //             if(v<=j){
//     // //                 dp[i][j]=dp[i][j-v]+dp[i-1][j];
//     // //             }
//     // //             else{
//     // //                 dp[i][j]=dp[i-1][j];
//     // //             }
//     // //         }
//     // //     }
//     // //     return dp[n][sum];
//     // // }

//     // public static int rodlen(int len[], int price[], int rod){
//     //     int n=len.length;
//     //     int dp[][]= new int[n+1][rod+1]; 

//     //     for(int i=0;i<n+1;i++){
//     //         for(int j=0;j<rod+1;j++){
//     //             if(i==0 || j==0){
//     //                 dp[i][j]=0;
//     //             }
//     //         }
//     //     }

//     //     for(int i=1;i<n+1;i++){
//     //         for(int j=1;j<rod+1;j++){
//     //             int v= len[i-1];

//     //             if(v<=j){
//     //                 dp[i][j]= Math.max(price[i-1]+dp[i][j-v], dp[i-1][j]);
//     //             }
//     //             else{
//     //                 dp[i][j]= dp[i-1][j];
//     //             }
//     //         }
//     //     }
//     //     return dp[n][rod];
//     // }

//     // public static int LCSreccursion(String s1, String s2,int n, int m){
//     //     if(n==0 || m==0){
//     //         return 0;
//     //     }
//     //     if(s1.charAt(n-1)==s2.charAt(m-1)){
//     //         return LCSreccursion(s1, s2, n-1, m-1)+1;
//     //     }
//     //     else{
//     //         int ans1= LCSreccursion(s1, s2, n-1, m);
//     //         int ans2 = LCSreccursion(s1, s2, n, m-1);
//     //         return Math.max(ans1,ans2);
//     //     }
//     // }

//     // public static  int lcsmemoization(String s1, String s2, int n, int m){
//     //     int dp[][]= new int[n+1][m+1];
//     //     for(int i=0;i<n+1;i++){
//     //         for(int j=0;j<m+1;j++){
//     //             dp[i][j]=-1;
//     //         }
//     //     }

//     //     if(n==0 || m==0){
//     //         return 0;
//     //     }
//     //     if(dp[n][m]!=-1){
//     //         return dp[n][m];
//     //     }
//     //     if(s1.charAt(n-1)==s2.charAt(m-1)){
//     //         dp[n][m]= lcsmemoization(s1, s2, n-1, m-1)+1;
//     //         return dp[n][m];
//     //     }else{
//     //         int a1= lcsmemoization(s1, s2, n-1, m);
//     //         int a2= lcsmemoization(s1, s2, n, m-1);
//     //         dp[n][m]=Math.max(a1,a2);
//     //         return dp[n][m];
//     //     }
//     // }



//     public static int lcstab(String s1,String s2, int n, int m){
//         int dp[][]= new int[n+1][m+1];
//         for(int i=0;i<n+1;i++){
//             for(int j=0;j<m+1;j++){
//                 if(i==0 || j==0){
//                     dp[i][j]=0;
//                 }
//             }
//         }

//         for(int i=1;i<n+1;i++){
//             for(int j=1;j<m+1;j++){

//                 if(n==0 || m==0){
//                     return 0;
//                 }
//                 if(s1.charAt(i-1)==s2.charAt(j-1)){
//                     dp[i][j]= dp[i-1][j-1]+1;
                    
//                 }
//                 else{
//                     int a1= dp[i][j-1];
//                     int a2= dp[i-1][j];
//                     dp[i][j]= Math.max(a1,a2);
//                 }
//             }
//         }
//         return dp[n][m];
//     }
//     public static void main(String[] args) {
//         String s1="abcdge";
//         String s2="abdge";
//         int n=s1.length();
//         int m=s2.length();
//       System.out.println(lcstab(s1, s2, n, m));
//         // System.out.println(LCSreccursion(s1, s2, n, m));
//         // int coins[]= {2,5,3,6};
//         // int sum=10;

//         // int len[]={1,2,3,4,5,6,7,8};
//         // int price[]={1,5,8,9,10,17,17,20};
//         // int rod=8;
//         //System.out.println(rodlen(len, price, rod));
//         //System.out.println(coinschange(coins, sum));
//     }
    
// }
