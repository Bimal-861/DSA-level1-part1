import java.util.*;

public class pq1{
    public static void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int []ranks={22,33,1,2,56,7,3,8};
        for(int i=0;i<ranks.length;++i){
            pq.add(ranks[i]);
        }
        while(pq.size()>0){
            System.out.print(pq.remove()+" ");
        }
    }
    
}