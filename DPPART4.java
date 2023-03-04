// import java.util.*;
// public class DPPART4 {

//     public static int lcs(String s1, String s2){
//         int n= s1.length();
//         int m= s2.length();
//         int ans=0;
//         int dp[][]= new int[n+1][m+1];
//         for(int i=0;i<n+1;i++){
//             for(int j=0;j<m+1;j++){
//                 if(i==0 || j==0){
//                     dp[i][j]= 0;
//                 }
//             }
//         }
//         for(int i=1;i<n+1;i++){
//             for(int j=1;j<m+1;j++){
//                 if(s1.charAt(i-1)== s2.charAt(j-1)){
//                     dp[i][j]= dp[i-1][j-1]+1;
//                     ans= Math.max(ans, dp[i][j]);
//                 }
//                 else{
//                     dp[i][j]=0;
//                 }
//             }
//         }
//         return ans;
//     }

//     public static int LCS(int arr[], int arr2[]){
//         int n=arr.length;
//         int m= arr2.length;
//         int dp[][]= new int[n+1][m+1];

//         for(int i=0;i<n+1;i++){
//             for(int j=0;j<m+1;j++){
//                 if(i==0 ||j==0){
//                     dp[i][j]=0;
//                 }
//             }
//         }
       

//         for(int i=1;i<n+1;i++){
//             for(int j=1;j<m+1;j++){
//                 if(arr[i-1]==arr2[j-1]){
//                     dp[i][j]=dp[i-1][j-1]+1;
//                 }
//                 else{
//                     int a1= dp[i-1][j];
//                     int a2= dp[i][j-1];
//                     dp[i][j]=Math.max(a1, a2);
//                 }
//             }
//         }

//         for(int k=0;k<arr2.length;k++){
//             System.out.print(arr2[k]+" ");
//         }
//         return dp[n][m];
        
//     }

//     public static int LIS(int arr[]){
//         HashSet<Integer> set= new HashSet<>();
//         for(int i=0;i<arr.length;i++){
//             set.add(arr[i]);
//         }
//         int arr2[]= new int[set.size()];
//         int i=0;
//         for(int num : set){
//             arr2[i]=num;
//             i++;
//         }
      
//         Arrays.sort(arr2);
       
//         return LCS(arr,arr2);

//     }


//     public static int editdistance(String s1, String s2){
//         int n=s1.length();
//         int m= s2.length();
//          int dp[][] = new int[n+1][m+1];
//         for(int i=0;i<n+1;i++){
//             for(int j=0;j<m+1;j++){
//                 if(i==0){
//                     dp[i][j]=j;
//                 }
//                 if(j==0){
//                     dp[i][j]=i;
//                 }
//             }
//         }

//         for(int i=1;i<n+1;i++){
//             for(int j=1;j<m+1;j++){
//                 if(s1.charAt(i-1)==s2.charAt(j-1)){
//                     dp[i][j]= dp[i-1][j-1];
//                 }
//                 else{
//                     int add= dp[i][j-1]+1;
//                     int del= dp[i-1][j]+1;
//                     int replace= dp[i-1][j-1]+1;

//                     dp[i][j]=Math.min(add,Math.min(del,replace));
//                 }
//             }
//         }
//         return dp[n][m];
//     }

//     public static  int llcs(String s1, String s2){
//         int n=s1.length();
//         int m= s2.length();
//         int dp[][]=new int[n+1][m+1];
//         for(int i=1;i<n+1;i++){
//             for(int j=1;j<m+1;j++){
//                 if(s1.charAt(i-1)==s2.charAt(j-1)){
//                     dp[i][j]= dp[i-1][j-1]+1;
//                 }
//                 else{
//                     int ans1= dp[i-1][j];
//                     int ans2=dp[i][j-1];
//                     dp[i][j]= Math.max(ans1,ans2);
//                 }
//             }
//         }

//         return dp[n][m];
//     }

//     public static int substrings(String s1, String s2){
//         int s1n= s1.length();
//         int s2n= s2.length();
//         int lcs= llcs(s1, s2);

//         int del= s1n-lcs;
//         int add= s2n-lcs;

//         int ans= add+del;
//         return ans;
//     }

//     public static void main(String[] args) {
//         String  s1="pear";

//         String s2= "sea";
//         System.out.println(substrings(s1, s2));
//         // System.out.println(editdistance(s1, s2));
//         int arr[]={50,3,10,7,40,80};
//         // System.out.println(LIS(arr));

        
//         // System.out.println(lcs(s1, s2));

//     }
    
// }
