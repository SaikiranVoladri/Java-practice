// import java.util.*;
// public class PATTERNS {
   
//    public static void main(String[] args) {
//     // inverted(5);
//     // nbrpattern(5);
//     // zigzag(5);
//     // butterfly(10);
//     // solidrhombus(5);
//     // hrombus(5);
//     // diamond(5);
//     // nbrprmd(5);
//     pdromeptn(5);
    
//    } 
   //Wap to print inverted half pyramid
//    public static void inverted(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             //spaces 
//             System.out.print(" ");
           
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//    }

// public static void nbrpattern(int n){
//     int nbr=1;
//     for(int i=0;i<n;i++){
//         for(int j=0;j<=i;j++){
//         System.out.print(nbr);
//         nbr++;}
    
//     System.out.println();
//       }
// }

// public static void zigzag(int n){
//     for(int i=0;i<n;i++){
//         for(int j=0;j<=i;j++){
//             if((i+j)%2==0){
//                 System.out.print("1");
//             }
//             else{
//                 System.out.print("0");
//             }
//         }
//         System.out.println();
//     }
// }
// public static void butterfly(int n){
//     for(int i=1;i<=n;i++){
//         //outer loop
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         for(int j=1;j<=2*(n-i);j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }

//         System.out.println();
//         }

// for(int i=n;i>=1;i--){
//     //outer loop
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     for(int j=1;j<=2*(n-i);j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }

//     System.out.println();
//     }
// }
// public static void solidrhombus(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print("-");
//         }
//         for(int j=1;j<=n;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// public static void hrombus(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=n;j++){
//             if(i==1||j==1||i==n||j==n){
//                 System.out.print("*");
//             }else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
// }
// public static void diamond(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=(2*i)-1;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     for(int i=n;i>=1;i--){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=(2*i)-1;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//}
// public static void nbrprmd(int n){
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//         System.out.print(i+" ");
//     }
//     System.out.println();
// }
// }
// public static void pdromeptn(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         //ascending order
//         for(int j=i;j>=1;j--){
//             System.out.print(j);
//         }
//         //descending order
//         for(int j=2;j<=i;j++){
//             System.out.print(j);
//         }
//         System.out.println();
//     }
// }
//}
