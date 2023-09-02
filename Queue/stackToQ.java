import java.util.*;

class stackToQ{
    public static class stacktoqadapter{
        Stack<Integer> mainS;
        Stack<Integer> helperS;

        public stacktoqadapter(){
            mainS=new Stack<>();
            helperS=new Stack<>();
        }

        int size(){
            return mainS.size();
        }
        void add(int val){
           
            while(mainS.size()>0){
                helperS.push(mainS.pop());
            }
             helperS.push(val);
            while(helperS.size()>0){
                mainS.add(helperS.pop());
            }
        }
        int remove(){
            if(mainS.size()==0){
                System.out.println("Overflow");
                return -1;
            }
            return mainS.pop();
        }
        int top(){
            if(mainS.size()==0){
                System.out.println("Overflow");
                return -1;
            }
            return mainS.peek();
        }
    }
}