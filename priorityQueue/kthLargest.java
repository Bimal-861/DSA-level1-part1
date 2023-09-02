import java.util.*;

public class kthLargest {
    public static void main(String[] args){
        int nums[]={12,34,65,23,122,78};
        int k=5;

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;++i){
            if(i<k){
                pq.add(nums[i]);
            }else{
                if(pq.peek()<nums[i]){
                    pq.remove();
                    pq.add(nums[i]);
                }
            }
        }
        while(pq.size()>0){
            System.out.print(pq.remove()+" ");
        }
    }
}
