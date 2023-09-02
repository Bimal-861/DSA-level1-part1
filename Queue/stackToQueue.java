import java.util.Stack;

public class stackToQueue {
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
           mainS.push(val);
        }
        int remove(){
            if(mainS.size()==0){
                System.out.println("Underflow");
                return -1;
            }
            while(mainS.size()>1){
                helperS.push(mainS.pop());
            }
            int k= mainS.pop();
            while(helperS.size()>0){
                mainS.push(helperS.pop());
            }
            return k;
        }
        int top(){
            if(mainS.size()==0){
                System.out.println("Underflow");
                return -1;
            }
            while(mainS.size()>1){
                helperS.push(mainS.pop());
            }
            int k= mainS.peek();
            while(helperS.size()>0){
                mainS.push(helperS.pop());
            }
            return k;
        }
    }
}
