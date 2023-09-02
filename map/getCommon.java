import java.util.*;

public class getCommon {
    public static void main(String[] args){
        int arr1[]={1,1,2,3,5,7,9};
        int arr2[]={3,7,4,6};
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<arr1.length;++i){
            h.put(arr1[i],1);
        }
        LinkedList<Integer> l=new LinkedList<>();
        for(int i=0;i<arr2.length;++i){
            if(h.containsKey(arr2[i])){
                l.add(arr2[i]);
            }
        }
        for(int i=0;i<l.size();++i){
            System.out.println(l.get(i));
        }
    }
}
