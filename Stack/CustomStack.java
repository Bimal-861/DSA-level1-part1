public class CustomStack{
     static class cStack{
        int [] data;
        int tos;
        public cStack(int cap){
            data=new int[cap];
            tos=-1;
        }
         void push(int val){
            if(tos==data.length-1){
                System.out.println("Overflow");
            }
            else{
                tos+=1;
                data[tos]=val;
            }
        }
        int pop(){
            if(tos==-1){
                //System.out.println("Underflow");
                return -1;
            }
            else{
                int k=data[tos];
                tos--;
                return k;
            }

        }
        int top(){
            if(tos==-1){
                return -1;
            }
            else{
                return data[tos];
            }
        }
        int size(){
            return tos+1;
        }
        void display(){
            for(int i=tos;i>=0;--i){
                System.out.println(data[i]);
            }
        }
    }
}