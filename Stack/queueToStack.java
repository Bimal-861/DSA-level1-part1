//queue to stack pop efficient


import java.util.*;
import java.io.*;

public class queueToStack {
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
            while(mainQ.size()>0){
                helperQ.add(mainQ.remove());
            }
            mainQ.add(val);
            while(helperQ.size()>0){
                mainQ.add(helperQ.remove());
            }
        }
        int pop(){
            if(size()==0){
                System.out.println("UnderFlow");
                return -1;
            }
            else{
                return mainQ.remove();
            }
        }
        int top(){
            if(size()==0){
                System.out.println("UnderFlow");
                return -1;
            }
            else{
                return mainQ.peek();
            }
        }
    }
}
