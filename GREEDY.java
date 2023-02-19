
import java .util.*;


public class GREEDY {
    public static void Knapsack(int value[],int weight[], int C){

        double ratio[][]= new double[value.length][2];
        for(int i=0;i<value.length;i++){
        ratio[i][0]=i;
        ratio[i][1]=value[i]/weight[i];
        }
        Arrays.sort(ratio,Comparator.comparing(o-> o[1]));
        int maxcapacity =C;
        int val=0;
        for(int i= value.length-1;i>=0;i--){
            int idx= (int )ratio[i][0];
            if(maxcapacity >=weight[idx]){
                maxcapacity-= weight[idx];
                val=val+ value[idx];

           }
           else{
            val+= maxcapacity * ratio[i][1];
            maxcapacity=0;
            break;
           }
        }

        System.out.println(val);

    }
    

    public static void Absdiff(){
        int a[]={1,2,3};
        int b[]={1,2,3};
        int diff=0;
        for(int i=0;i<a.length;i++){
            diff+=Math.abs(a[i]-b[i]);
        }
        System.out.println(diff);
    }

    public static void max(int arr[][]){
    int chainlen=1;
    int pairend=arr[0][1];
    for(int i=0;i<arr.length;i++){
        if(arr[i][0]>pairend){
            chainlen++;
            pairend=arr[i][1];
        }
    }
    System.out.println(chainlen);

            

        }


        // public static void indiancoins(int n){
        //     int coin[]={2000,500,100,50,20,10,5,2,1};
        //     int count=0;
        //     for(int i=0;i<coin.length;i++){
        //         if(coin[i]<=n){
        //             while(coin[i]<=n){
        //                 count++;
        //                 n=n-coin[i];
        //                 System.out.println(coin[i]);
        //             }
        //         }
        //     } 
        //     System.out.println(count+"coins");
        // }


        // public static void  job(int arr[][]){
           
        //     ArrayList<Integer> a= new ArrayList<>();
        //     int time=0;
        //     int deadline= arr[0][0];
        //     for(int i=0;i<arr.length;i++){
        //         if(deadline > time){
        //             a.add(i);
        //             time++;
        //             deadline = arr[i][0];
        //         }
        //     }

        //     for(int i=0;i<a.size();i++){
        //         System.out.print(a.get(i)+" ");
        //     }
            
       // }
        static class job{
            int deadline;
            int profit;
            int id;
            job(int i,int d,int p){
                deadline=d;
                id=i;
                profit=p;
            }
        }

    

    
        
    public static void main(String[] args) {
         int arr[][]={{4,20},{1,10},{1,40},{1,30}};
         ArrayList<job> al= new ArrayList<>();
         for(int i=0;i<arr.length;i++){
             al.add(new job(i,arr[i][0], arr[i][1]));
         }

         Collections.sort(al,(obj1,obj2)->obj2.profit- obj1.profit);
         ArrayList<Integer> seq= new ArrayList<>();
         int time=0;
         for(int i=0;i<al.size();i++){
             job curr= al.get(i);
             if(curr.deadline > time){
                seq.add(curr.id);;
                time++;

             }

         }

         for(int i=0;i<seq.size();i++){
            System.out.println(seq.get(i));
         }

        //  Arrays.sort(arr, Comparator.comparing(o -> o[1]));
        //  job(arr);
        // max(arr);
        // int value[]={60,100,120};
        // int weight[]={10,20,30};
        // int C=50;
        // Knapsack(value, weight, C);
        // Absdiff();
        
        // int start[]={1,3,0,5,8,5};
        // int end[]={2,4,6,7,9,9};

        // int act[][]=new int[start.length][3];
        // for(int i=0;i<act.length;i++){
        // act[i][0]=i;
        // act[i][1]=start[i];
        // act[i][2]=end[i];


        // }
        // Arrays.sort(act,Comparator.comparing(o->o[2]));

        // int maxact=0;
        // ArrayList<Integer> a = new ArrayList<>();
        // maxact=1;
        // a.add(0);
        // int lastend=act[0][2];
        // for(int i=1;i<end.length;i++){
        //     if(act[i][1]>=lastend){
        //         maxact++;
        //         a.add(act[i][0]);
        //         lastend=act[i][2];
        //     }
        // }
        // System.out.println(maxact+"=>");

       


    }
}
