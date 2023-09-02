public class reverseList {
    static class Node{
        int data;
        Node next;
    }
    class myLinkedList{
        Node head;
        Node tail;int size;
         private Node getNodeAt(int id){
            if(size ==0){
                return null;
            }
            else if(id == size-1 ){
                return tail;

            }
            else if(id==0){
                return head;
            }
            else{
                Node temp=head;
                int pos =0;
                while(pos<id){
                    temp=temp.next;
                    pos++;
                }
                return temp;
            }
        }
        public void reverse(){
            if(size==0||size==1){
                return;
            }
            else{
                Node pre,post,temp;
                temp=post=head;
                pre=null;
                while(post!=null){
                    post=temp.next;
                    temp.next=pre;
                    pre=temp;
                    temp=post;

                }
                head=temp;

            }
        }

        public void myReverseIt(){
           
            int r=size-1;
            int l=0;
            while(l<r){
                Node node1=getNodeAt(l);
                Node node2=getNodeAt(r);

                int temp=node1.data;
                node1.data=node2.data;
                node2.data=temp;
                r--;
                l++;
            }
            
            
        }
    }
   
    
}
