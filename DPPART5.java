// import java.util.Arrays;

// public class DPPART5 {
    

//     public static int catalan(int n){
//         if(n==0 ||n==1){
//             return 1;
//         }
//         int ans=0;
//         for(int i=0;i<n;i++){
//             ans+=catalan(i) * catalan(n-i-1);

//         }
//         return ans;
//     }

//     public static int catalanmemoisation(int n, int dp[]){
//         if(n==0 || n==1){
//             return 1;
//         }
//         if(dp[n]!=-1){
//             return dp[n];
//         }
//         int ans=0;
//         for(int i=0;i<n;i++){
//             ans+= catalanmemoisation(i, dp) * catalanmemoisation(n-i-1, dp);
//         }
//         dp[n]= ans;
//         return dp[n];
//     }


//     public static int  tabulationcatalan(int n){
//         int dp[]= new int[n+1];
//         dp[0]=1;
//         dp[1]=1;
//         for(int i=2;i<=n;i++){
//             for(int j=0;j<i;j++){
//                 dp[i]+=dp[j]*dp[i-j-1];
//             }
//         }
//         return dp[n];
//     }


//     public static int countbst(int n){
//         int dp[]= new int[n+1];
//         dp[0]=1;
//         dp[1]=1;
//         for(int i=2;i<n+1;i++){
//             for(int j=0;j<i;j++){

//                 int left= dp[j];
//                 int right= dp[i-j-1];
//                 dp[i]+=left*right;
//                 // dp[i]+=dp[j]*dp[i-j-1];
//             }
//         }
//         return dp[n];
//     }



//     public static int mountinranges(int n){
//         int dp[]= new int[n+1];
//         dp[0]=1;
//         dp[1]=1;
//         for(int i=2;i<n+1;i++){
//             for(int j=0;j<i;j++){
//                 int outside=dp[i-j-1];
//                 int inside= dp[j];
//                 dp[i]+=inside * outside;
//             }
//         }
//         return dp[n];
//     }
//  public static void main(String[] args) {
//     int n=5;
//     System.out.println(mountinranges(n));
//     // int dp[]= new int[n+1];
//     // Arrays.fill(dp, -1);
//     // System.out.println(catalan(n));
//     // System.out.println(catalanmemoisation(n, dp));
//     // System.out.println(tabulationcatalan(n));

//  }
// }
