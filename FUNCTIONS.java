import java.util.*;
import java.util.Random;

public abstract class FUNCTIONS {
  // WAP to calculate the gcd of two numbers
// public static int gcd(int a, int b){
//     if(b==0){
//         return a;
//     }
//     return gcd(b,a%b);
// }  

//Write a Java function that takes an array of integers as an argument and returns the average of the elements in the array.
    // public static int average(int arr[]){
    //     int sum=0;
    //     for(int i=0;i<arr.length;i++){
    //         sum+=arr[i];
    //     }
    //     return  sum/arr.length;
    // }

    //Write a Java program to generate a random number between two given numbers
    // public static int random(int n1, int n2){
    //     Random r= new Random();
    //     int rvalue= r.nextInt((n2-n1)+n1);
    //     return rvalue;

    // }
    //Write a java program to reverse the string
    // public static void revstr(String str){
    //     String revstr="";
    //     for(int i=str.length()-1;i>=0;i--){
    //         revstr+=str.charAt(i);
    //     }
    //     System.out.println(revstr);
    // }
    //Write a Java program to check if a given string is a palindrome.
    // public static boolean ispdrome(String str){
    //     boolean pdrome= true;
    //     int n=str.length();
    //     int x=str.length()-1;
    //     for(int i=0;i<n;i++){
    //         if(str.charAt(i)!=str.charAt(x-i)){
    //            return false;
    //         }else{
    //             return true;
    //         }
    //     }
    //     return pdrome;
    // }

    // write a program to convert   binary to decimal
    // public static int BtoD(int n){
    //     int bin=n;
    //     int dec=0;
    //     int ld=0;
    //     int pow=0;
    //     while(n>0){
    //         ld=n%10;
    //         dec=dec+ld*(int)Math.pow(2,pow);
    //         pow++;
    //         n=n/10;
    //     }
    //     return dec;

    // }

    
    // write a program to convert decimal to binary  
    //  public static int DtoB(int n){
    //     int dec=n;
    //     int bin=0;
    //     int ld=0;
    //     int pow=0;
    //     while(n>0){
    //         ld=n%2;
    //         bin=bin+ld*(int)Math.pow(10,pow);
    //         pow++;
    //         n=n/2;
    //     }
    //     return bin;

    // }
    // public static boolean isprime(int n){
    //   boolean prime=true;
    //     for(int i=2;i<=Math.sqrt(n);i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void primesinrange(int n){
    //     for(int i=2;i<n-1;i++){
    //         if(isprime(i)==true){
    //             System.out.print(i+" ");
    //         }
    //     }
    //     return ;
    // }
    public static void main(String[] args) {
    //    System.out.println( gcd(20,15));
    // int arr[]={1,2,3,4,5};
    //     System.out.println(average(arr));
    // System.out.println(random(10, 2000));
    // revstr("saikiran");
//    System.out.println( ispdrome("malam"));
    // System.out.println(BtoD(1000));
    // System.out.println(DtoB(8));

//  primesinrange(15);

    

    }
}
