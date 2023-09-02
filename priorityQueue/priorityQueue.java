import java.util.*;
public class priorityQueue{
    static class PriorityQueue {
    ArrayList<Integer> data;
    public PriorityQueue(){
        data=new ArrayList<>();
    }
    private void swap(int idx,int pidx){
        int temp=data.get(idx);
        data.set(idx,data.get(pidx));
        data.set(pidx,temp);
    }
    private void upHeapify(int id){
        if(id==0){
            return;
        }
        int pi=(id-1)/2;
        if(data.get(pi)>data.get(id)){
            swap(id,pi);
            upHeapify(pi);
        }
    }

    public void add(int val){
        data.add(val);
        upHeapify(data.size()-1);
    }
    public int peek(){
        if(data.size()==0){
            System.out.println("Underflow");
            return -1;
        }
        return data.get(0);
    }
}
}


