
import java.util.*;
public class ARRAYLIST {

//     public static void print(ArrayList A){
//         int n= A.size();
//         for(int i=n-1;i>=0;i--){
//             System.out.print(A.get(i));
//         }
//     }

// //   public static int  maximum(ArrayList <Integer> A)  {
// //     int max=0; int n=0;
// //     for(int i=0;i<A.size();i++){
// //         if(A.get(i)>max){
// //             max=A.get(i);
// //            n=i;
// //         }
// //     }
// //    return n;
// //   }

//   public static void swap(ArrayList<Integer> A, int id1, int id2){
//     int temp= A.get(id1);
//     A.set(id1,A.get(id2));
//     A.set(id2,temp);

//   }

// //   public static int twater(ArrayList<Integer> list){
// //     int max=0;
// //     for(int i=0;i<list.size();i++){
// //         for(int j=i+1;j<list.size();j++){
// //             int ht= Math.min(list.get(i),list.get(j));
// //             int wt=j-i;
// //             int tot=ht*wt;
// //             max= Math.max(max,tot);
// //         }
// //     }
// //     return max;
// //   }
  
//   public static int water( ArrayList<Integer> list, int lp, int rp){
//     int max=0;

   
//     while(lp<rp){
//         int ht= Math.min(list.get(lp),list.get(rp));
//         int wt= rp-lp;
//         int tot= ht*wt;
//         max=Math.max(max,tot);
//         if(list.get(lp)<list.get(rp)){
//             lp++;
//         }
//         else{
//             rp--;
//         }
//     }
//     return max;

//   }
//   public static void getpair(ArrayList<Integer>list , int target){

//     // for(int i=0;i<list.size();i++){
//     //     for(int j=i+1;j<list.size();j++){
//     //         if(list.get(i)+list.get(j)==target){
//     //             System.out.println(i+" "+j);
                
//     //         }else{
//     //             System.out.println("not found");
//     //             return ;
//     //         }
//     //     }
//     // }

//     int lp=list.get(0);
//     int rp=list.size()-1;
//     while(lp!=rp){
//         if(list.get(lp)+list.get(rp)==target){
//             System.out.println(lp+" "+rp);
//             return;
//         }
//         if(list.get(lp)+list.get(rp)<=target){
//             lp++;
//         }
//         if(list.get(lp)+list.get(rp)>target){
//             rp--;
//         }
        
        
//       }

//   }

  public static boolean pairs(ArrayList<Integer>list, int target){
  int bp=-1;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
               bp=i;
               break;
            }
            }
            int lp=bp+1;
            int rp=bp;
        int n=list.size();
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp) <target){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }

       }
       return false;

  }
public static void main(String[] args) {
   
   ArrayList<Integer> list= new ArrayList<>();
   list.add(4);
   list.add(5);
   list.add(1);
   list.add(2);
   list.add(3);
  
System.out.println(pairs(list, 5));

 

   
    }  
}
