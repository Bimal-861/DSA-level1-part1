public class stackUseList {
    public static class Node{
        int data;
        Node next;
      
    }
    public static class MyList{
        Node head;
        int size;

        public void push(int val){
            if(head==null){
                head.data=val;
                head.next=null;
                size++;
            }
            else{
                Node temp=new Node();
                temp.data=val;
                temp.next=head;
                head=temp;
                size++;
            }
        }
        public Node pop(){
            
            if (size==0){
                return head;
                
            }
            else{
                Node temp=head;
                head=head.next;
                size--;


                return temp;
                
            }
        }
        public Node peek(){
            return head;
        }
        public int size(){
            return size;
        }
    }
}
