// import java.util.*;
// public class STRINGS {
//     // strings in java is a class whaich is represented as a sequence of characters 
//     // public static boolean ispalindrome(String str){
//     //     int n= str.length();
//     //     boolean isbool=true;
//     //     for(int i=0;i<str.length()-1;i++){
//     //         if(str.charAt(i)!=str.charAt(n-i-1)){
                
//     //             isbool=false ;
//     //         }else{
                
//     //             isbool=true;
//     //         }
//     //     }
//     //     return isbool;

//     // }

//     public static float sd(String str){
//         int x=0;
//         int y=0;
       
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)=='N'){
//                 y=y+1;
//             }
//             else if(str.charAt(i)=='E'){
//                 x=x+1;
//             }
//             else if(str.charAt(i)=='W'){
//                 x=x-1;
//             }
//             else if(str.charAt(i)=='S'){
//                 y=y-1;;
//             }
//         }
//         int x2= x*x;
//         int y2= y*y;
//         int tot= x2+y2;
//         float s1= (float)Math.sqrt(tot);
       
        

//         return s1;
//     }
//     public static String substr(String str, int si, int ei){
//         String sb="";
//         for(int i=si;i<ei;i++){
//             sb+=str.charAt(i);
//         }
//         return sb;

//     }
//     public static String isgreater(String str[]){
//         String largest=str[0];
//         for(int i=1;i<str.length;i++){
//             if(largest.compareTo(str[i])<0){
//               largest=str[i];

//             }
//         }
//       return largest  ;
//     }
//     public static void toupr(String str){
//        StringBuilder sb= new StringBuilder();
//        char ch= Character.toUpperCase(str.charAt(0));
//         sb.append(ch);
        
//         for(int i=1;i<str.length();i++){
//             if(str.charAt(i)==' ' && i<str.length()-1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));

//             }else{
//                 sb.append(str.charAt(i));
//             }

//         }
//         String ss= sb.toString();
//         System.out.println(ss);
//     }
//     public static String compression(String str){
//         StringBuilder sb= new StringBuilder();
//         for(int i=0;i<str.length();i++){
//             System.out.println(i);
//             Integer count=1;
//             while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//                 System.out.println(i+".");
//                 i++;
//                 count++;//aabb
//             }
//             sb.append(str.charAt(i));
//             if(count>1){
//                 sb.append(count.toString());
//             }
//         }
//         return sb.toString();
//     }
//     public static int vovels(String str){
//         int count=0;
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static boolean anagram(String str1,String str2){
//         if(str1.length()!=str2.length()){
//             return false;}

//             char ch[] = str1.toCharArray();
//             char ch2[]=str2.toCharArray();

//             //sort
//             Arrays.sort(ch);
//             Arrays.sort(ch2);

//             return  Arrays.equals(ch, ch2);


//         }
//         public static int countwords(String str){
//             // str=str.trim();
//             if(str.length()==0){
//                 return 0;
//             }
//             String arr[] = str.split(" ");

//             return arr.length;
//         }
//         public static String longest(String str[]){
//             if(str.length==0){
//                 return "";
//             }
//             String prefix=str[0];
//             for(int i=1;i<str.length;i++){
//                 while(str[i].indexOf(prefix)!=0){
//                     prefix=prefix.substring(0, prefix.length()-1);
//                     if(prefix.length()==0){
//                         return "";
//                     }
//                 }
//             }
//             return prefix;
//         }
//         public static String longestCommonPrefix(String[] strs) {
//             if (strs.length == 0) {
//                 return "";
//             }
    
//             String prefix = strs[0];
//             for (int i = 1; i < strs.length; i++) {
//                 while (strs[i].indexOf(prefix) != 0) {
//                     prefix = prefix.substring(0, prefix.length() - 1);
//                     if (prefix.isEmpty()) {
//                         return "";
//                     }
//                 }
//             }
//             return prefix;
//         }
    
    
//     public static void main(String[] args) {
//         //string decleration
//         Scanner sc= new Scanner(System.in);
//         // String str= sc.nextLine();
//         //concatenation
//                 // String   str= "malayalam";
//             //    System.out.println( ispalindrome(str));
//             // String str="WNEENESENN";
//             // System.out.println(sd(str));
//         //     String str[]={"apple","banana","mango"};
//         //    System.out.println( isgreater(str));
//         //    StringBuilder sb= new StringBuilder();
//         //    for(char ch='a';ch<='z';ch++){
//         //     sb.append(ch);
//         //    }
//         //     System.out.println(sb);
             
//     //    String str="aaa";
//     //    String str2="aab";
//     //    String str3="aaa";
//     //    System.out.println(str.equals(str2)+" "+str.equals(str3));
//     //    System.out.println(str2.replaceAll("a","A"));
//     // String str1="aaa";
//     // String str2="aab";
//     // System.out.println(anagram(str1, str2));
//         //    String  str= "hi my name is      ";
//         //    System.out.println(countwords(str));
//         // }   
//         // String str[]= {"flower","flow","flour"};
//         // System.out.println(longest(str));
//         String[] strs = {"flower", "flow", "flight"};
//         String longestCommonPrefix = longestCommonPrefix(strs);
//         System.out.println("The longest common prefix is: " + longestCommonPrefix);
//     }
// }
