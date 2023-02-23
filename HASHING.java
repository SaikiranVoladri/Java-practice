import java.util.*;


public class HASHING {

    // public static boolean anagram(String s1, String s2){
    //     // 
    //     HashMap<Character, Integer> hm= new HashMap<>();
    //     for(int i=0;i<s1.length();i++){
    //          char ch=s1.charAt(i);
    
    //         //  if(hm.containsKey(ch)){
    //         //     hm.put(ch,hm.get(ch)+1);
    //         //  }else{
    //         //     hm.put(ch,1);
    //         //  }
    //         hm.put(ch, hm.getOrDefault(ch, 0)+1);
             
    //     }
    //     for(int i=0;i<s2.length();i++){
    //         char ch2=s2.charAt(i);

    //         if(hm.get(ch2)!=null){
    //         if(hm.get(ch2)==1){
    //             hm.remove(ch2);
               
    //          }else{
    //             hm.put(ch2,hm.get(ch2)-1);
    //          }
    //     }
    //     else{
    //         return false;
    //     }
    //    }
    //     if(hm.isEmpty()){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }
    // public static int countdistinct(int arr[]){
    //     HashSet<Integer> hs= new HashSet<>();
    //     for(int i=0;i<arr.length;i++){
    //         hs.add(arr[i]);
    //     }
    //     return hs.size();
    // }
    public static int countDistinct(int arr[]) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], false);
        }
        System.out.println(map);
        return map.size();
    }

    public static int union(int arr[], int arr2[]){
        HashSet<Integer> hs= new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
         for(int k=0;k<arr2.length;k++){
            hs.add(arr2[k]);
         }
        System.out.println(hs);
        return hs.size();
    }
    public static int intersection(int arr[], int arr2[]){
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(hs.contains(arr2[i])){
                count++;
                hs.remove(arr2[i]);
            }else{
                hs.add(arr2[i]);
            }
        }
        System.out.println(hs);
        return hs.size();
    }
    public static String getkey(HashMap<String, String> tick){
        HashMap<String, String> revmap= new HashMap<>();
        for(String i:tick.keySet()){
            revmap.put(tick.get(i), i);
        }

        for(String i:tick.keySet()){
            if(!revmap.containsKey(i)){
                return i;
            }
        }
        return null;
    }
    
    public static void main(String args[]){

        int arr[]={10,2,-2,-20,10};
        int k=-10;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0;int ans=0;
        map.put(0,1);
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }
        System.out.println(ans);
        // int arr[]={15,-2,2,-8,1,7,10,23};
        // HashMap<Integer,Integer>  hm= new HashMap<>();
        // int sum=0;
        // int len=0;
        // for(int j=0;j<arr.length;j++){
        //     sum+=arr[j];
        //     if(hm.containsKey(sum)){
        //        len=Math.max(len,j-hm.get(sum));
        //     }else{
        //         hm.put(sum,j);
        //     }
        // }
        // System.out.println(len);
        // HashMap<String, String> tick= new HashMap<>();
        // tick.put("c","b");
        // tick.put("m","d");
        // tick.put("g","c");
        // tick.put("d","g");
        // String start=getkey(tick);
        // System.out.println(start);
        // for( String st: tick.keySet()){
        //     System.out.print("->"+tick.get(start));
        //     start=tick.get(start);
        // }


        // int arr[]={1,2,3};
        // int arr2[]={1,2,3,4,5};
        // System.out.println(intersection(arr, arr2));
        // System.out.println(union(arr, arr2));





        // String s1="heartaear";
        // String s2= "earthhea";
        // System.out.println(anagram(s1,s2));

        // HashSet<Integer> hs= new HashSet<>();

        // int arr[]= {1,2,2,3,4,5,3,4,5};
        // int count=countDistinct(arr);
        // System.out.println(count);
        // hs.add(4);
        // hs.add(3);
        // hs.add(0);
        // hs.add(2);
        // hs.add(70);
        
        // System.out.println(hs);
        // LinkedHashSet<Integer> lhs= new LinkedHashSet<>();
        // lhs.add(1);
        // lhs.add(3);
        // lhs.add(2);
        // lhs.add(4);
        // System.out.println(lhs);
        // TreeSet<Integer> ts= new TreeSet<>();
        // ts.add(1);
        // ts.add(3);
        // ts.add(0);
        // ts.add(4);
        // System.out.println(ts);

        //looping on hashset in two ways 
        //1 iterater tharika
        // Iterator i=set.iterator();
        // while(i.hasNext()){
        //     System.out.print(i.next());
            
        // }

        // for(Integer k:hs){
        //     System.out.println(k);
        // }
        // hs.remove(3);
        // System.out.println(hs.size());
        // boolean is=hs.contains(3);
        // System.out.println(is);
        // hs.clear();
        // System.out.println(hs);
        // System.out.println(hs.isEmpty());
        

        // HashMap<Integer ,Integer> hm= new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     int curr= arr[i];
        //     if(hm.containsKey(curr)){
        //         hm.put(curr,hm.get(curr)+1);
        //     }else{
        //         hm.put(curr,1);
        //     }

        // } 
        // for(Integer key:hm.keySet()){
        //     if(hm.get(key)>arr.length/3){
        //         System.out.println(key);
        //     }
        // }
        // HashMap<String, Integer> hm = new HashMap<>();
        // hm.put("a",1);
        // hm.put("z",24);
        // hm.put("c",3);
        // hm.put("aa", 40);
        // hm.put("ab",230);
        // TreeMap<String, Integer> tm = new TreeMap<>();

  
        // tm.put("a",1);
        // tm.put("z",24);
        // tm.put("c",3);
        // tm.put("aa", 40);
        // tm.put("ab",230);

        // LinkedHashMap <String, Integer>  h= new LinkedHashMap<>();
        // h.put("a",1);
        // h.put("z",24);
        // h.put("c",3);
        // h.put("aa", 40);
        // h.put("ab",230);
        

        

        // System.out.println(h);
        //  System.out.println(tm);


        //iteration on loops
    //    Set <String> abc= hm.keySet();
    //    for( String i:abc){
    //     System.out.println(i);
    //    }


        // System.out.println(hm);
        // // operations
        // // get function
        // System.out.println(hm.get("c"));
        // //remove fxn
        // //System.out.println(hm.remove("z"));
        // //size
        // System.out.println(hm.size());
        // //containskey
        // System.out.println(hm.containsKey("c"));
        // //clear
        // hm.clear();
        // //isempty
        // System.out.println(hm.isEmpty());
     
    }
    
}
