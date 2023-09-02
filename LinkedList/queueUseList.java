import java.util.LinkedList;
public  class queueUseList {
    public static class myQueue{
        LinkedList <Integer> list=new LinkedList<>(); 

        int size(){
            return list.size();
        }
        void add(int val){
            list.addLast(val);
        }
        int remove(){
            int l=list.getFirst();
            list.removeFirst();
            return l;
        }
        int peek(){
            return list.getLast();
        }
    }
   

}
