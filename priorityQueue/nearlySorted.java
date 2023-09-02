import java.util.*;

public class nearlySorted {
    public static void main(String[] args){
        int nums[]={2,3,1,4,6,7,5,8,9};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<=2;++i){
            pq.add(nums[i]);
        }
        for(int i=3;i<nums.length;++i){
            System.out.print(pq.remove()+" ");
            pq.add(nums[i]);
        }
        while(pq.size()>0){
            System.out.print(pq.remove()+" ");
         }
    }
}
