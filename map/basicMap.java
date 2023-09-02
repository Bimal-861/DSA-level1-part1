import java.util.*;
//import java.io.*;

public class basicMap {
    public static void main(String[] args){
            HashMap<String,Integer> hm=new HashMap<>();
            hm.put("India", 135);
            hm.put("Pak", 13);
            hm.put("Us", 35);
            hm.put("Uk", 50);

            ////System.out.println(hm);
             hm.put("Pak", 40);
              hm.put("Nigeria", 17);
              System.out.println(hm.containsKey("Nigeria"));
              System.out.println(hm.containsKey("Canada"));

            //  System.out.println(hm);
        //     System.out.println(hm.get("Us"));
        //    System.out.println( hm.get("Canada"));
           Set<String> key=hm.keySet();
           System.out.println(key);
           for(String keys:hm.keySet()){
            Integer val=hm.get(keys);
            System.out.println(keys+"->"+val);
           }
    }
  
    
}
