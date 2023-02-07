// import java.util.*;
// public class OPERATORS {
    //Write a program to calculate the area of a circle given its radius.

    // public static void main(String args[]){
    //     Scanner sc= new Scanner(System.in);
    //     int radius = sc.nextInt();
    //     float pi= 2.14f;
    //     float  area= pi * radius*radius;
    //     System.out.println(area);


    // }

     //Write a program that takes two numbers as input and finds the sum and product of the numbers.
    // public static void main(String[] args) {
    //   Scanner sc= new Scanner(System.in);
    //   int a=sc.nextInt();
    //   int b= sc.nextInt();
    //   int sum=a+b;
    //   int pro=a*b;
    //   System.out.println(sum+" "+pro);

    // }
    // write a program to print the square of a number
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int sqr=a*a;
    //     System.out.println(sqr);
        
    // }
    // Write a program to find the larger of two numbers using the conditional operator (ternary operator).

    //    public static void main(String[] args) {
    //     int a=1;
    //     int b=2;
    //     if(a>b){
    //         System.out.println("A is greater");
    //     }else{
    //         System.out.println("B is greater");
    //     }

    //     //or by using terenary operater
    //     int greater=a>b?a:b;
    //     System.out.println("greater is "+ greater);
    //    }

    //Write a program to find the absolute value of a number using the unary minus operator

    // public static void main(String[] args) {
    //    int a=-10;
    //    int absoluteval= (a<0)?-a:a;// -(-a)== (+a) absolute number of a
    //    System.out.println(absoluteval); 
    // }


    //Write a program that takes a number as input and finds its factorial using a loop and the multiplication operator.
    // public static int factorial(int n){
    //     int fact=1;
    //     while(n>0){
    //         fact= fact*n;
    //         n--;
    //     }
    //     return fact;
    // }

    
    //Write a program that takes a number as input and finds the sum of its digits using the modulus operator and a loop.
    // public static int sumofdigits(int a){
    //     int sum=0;
    //     while(a>0){
    //         int ld=a%10;
    //         sum+=ld;
    //         a=a/10;
    //     }
    //     return sum;

    // }
    //Write a program that uses the bitwise operator to find if a given number is a power of 2.
    // public static String ispower(int n){
    // String isprimeornot=(n & (n-1))==0?"True":"false";
    //     return isprimeornot;
    // }
    
    //Write a program that takes a number as input and checks if it is a prime number using the modulus operator and a loop.
    // public static void isprime(int n){
    //     boolean isprime= true;
    //     if(n<0){
    //         System.out.println("not at all prime");
    //         return;
    //     }
    //     for(int i=2;i<Math.sqrt(n);i++){
    //         if(n%i==0){
    //             isprime=false;
    //         }
    //     }
    //     if(isprime){
    //         System.out.println("prime");
    //     }else{
    //         System.out.println("not prime");
    //     }
    // }
    
    //Write a program to find the largest number among three numbers.
        // public static void largest(int a, int b, int c){
            // if(a>b && a>c){
            //     System.out.println(a);
            // }else if(b>a&&b>c){
            //     System.out.println(b);
            // }else{
            //     System.out.println(c);
            // }


        //     if(a>b){
        //         if(a>c){
        //             System.out.println(a+".");
        //         }else {
        //             System.out.println(c+",");
        //         }

        //     }else {
        //         if(b>c){
        //             System.out.println(b+"/");
        //         }else if(c>b){
        //             System.out.println(c+"()");
        //         }else{
        //             System.out.println("equal");
                //         }
                //     }
                // }

        // if(a<b && a<c){
        //         System.out.println(a);
        //     }else if(b<a&&b<c){
        //         System.out.println(b);
        //     }else{
        //         System.out.println(c);
        //     }
        // }


//Write a program to check if a number is even or odd.
// public static  int iseven(int n){
//     int eoro=(n%2)==0?0:1;
//     return eoro;
// }
//Write a program to check if a number is positive, negative or zero.
    
// public static String posiitiveornegative(int n){
//     // if(n==0){
       
//     //     return null;
//     // }
//     String is= n<0?"positive":"negative";
//     return is;
// }

//Write a program to check if a year is a leap year or not
// public static void  isleap(int n){
//     if(n%4==0){
//         if(n%100==0){
//             if(n%400==0){
//                 System.out.println("leap");
//             }else{
//                 System.out.println("not leap");
//             }
            
//         }else{
//             System.out.println("leap");
//         }
//     }else{
//         System.out.println("not leap");
//     }
// }

//
//Write a program to check if a character is a vowel or consonant.
// public static boolean isvovel(char ch){
//     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//         return true;
//     }else{
//         return false;
//     }
// }
// write a program to find the roots of a quadratic equation 
// public static void roots(double a, double  b, double c){
//     double det= b*b-4*a*c;
//     double root1, root2;
//     if(det > 0){
//         root1= (-b+ Math.sqrt(det))/(2*a);
//         root2= (-b -Math.sqrt(det))/(2*a);
//         System.out.println(root1);
//         System.out.println(root2);
//     }
//     else if (det==0){
//         root1=root2= -b/(2*a);
//         System.out.println(root1);
//         System.out.println(root2);
        
//     }else{
//         System.out.println("no real roots");
//     }
    
// }
//write a program to check weather a number is palindrome or not or wap to reverse a number
// public static void ispdrome(int nbr){
    
//     int ncopy=nbr;
//    int rev=0;
//     int pow=0;
//     int ld=0;
//     while(nbr>0){
//        ld=nbr%10; 
//        rev= rev*10+ld;
//        pow++;
//        nbr=nbr/10;
//     }
//   if(ncopy==rev){
//     System.out.println("palindrome number");
//   }else{
//     System.out.println("not pdrome");
//   }
// }
// public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
    
//         ispdrome(12);
        
//     }
// }
