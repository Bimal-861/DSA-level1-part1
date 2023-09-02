//queue to stack push efficient


import java.util.*;
import java.io.*;

public class qToStack {
    public static class queueToStackAdapter{
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;
        public queueToStackAdapter(){
            mainQ=new ArrayDeque<>();
            helperQ=new ArrayDeque<>();
        }

        int size(){
            return mainQ.size();
        }
        void push(int val){
           mainQ.add(val);
        }
        int pop(){
           while(mainQ.size()>1){
            helperQ.add(mainQ.remove());
           }
           int k=mainQ.remove();
           while(helperQ.size()>0){
            mainQ.add(helperQ.remove());
           }
           return k;
        }
        int top(){
            while(mainQ.size()>1){
            helperQ.add(mainQ.remove());
           }
           int k=mainQ.peek();
           while(helperQ.size()>0){
            mainQ.add(helperQ.remove());
           }
           return k;
        }
    }
}
