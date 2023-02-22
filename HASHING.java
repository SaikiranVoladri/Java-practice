import java.util.*;
import java.util.TreeMap;



public class HASHING {
    public static void main(String args[]){
        // HashMap<String, Integer> hm = new HashMap<>();
        // hm.put("a",1);
        // hm.put("z",24);
        // hm.put("c",3);
        // hm.put("aa", 40);
        // hm.put("ab",230);
        TreeMap<String, Integer> tm = new TreeMap<>();

  
        tm.put("a",1);
        tm.put("z",24);
        tm.put("c",3);
        tm.put("aa", 40);
        tm.put("ab",230);

        LinkedHashMap <String, Integer>  h= new LinkedHashMap<>();
        h.put("a",1);
        h.put("z",24);
        h.put("c",3);
        h.put("aa", 40);
        h.put("ab",230);
        

        

        System.out.println(h);
         System.out.println(tm);


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
