import java.util.*;
import java.io.*;

public class LinkedList{
    public static class Node{
        int data;
        Node next;
    }
    public static class lList{
        Node head;
        Node tail;
        int size;
    
        void addLast(int val){
             Node temp=new Node();
                temp.data=val;
                temp.next=null;
            if(size==0){
               
                head=tail=temp;
               

            }
            else{
               
                tail.next=temp;
                tail=temp;
               
            }
             size++;
        }
        public void removeFirst(){
            if(head==null){
                System.out.println("List is empty");

            }
            else if(size==1){
                head=tail=null;
                size--;
            }
            else{
                head=head.next;
                size--;
            }
        }
        public void addfirst(int val){
            Node temp=new Node();
              temp.data=val;
            if(size==0){
                temp.next=null;
                head=tail=temp;
               
            }
            else{
                temp.next=head;
                head=temp;
                
            }
            size++;
        }
        public Node removeNodes(Node head) {
            System.out.println("herenode"+head.data);
            Node pre,temp,post;
            post=pre=temp=head;
            while(temp!=null){
                System.out.println("here1");
                if(temp.data>post.data){
                    if((pre==head) &&(pre.data<temp.data)){
                        pre=temp;
                        head=temp;
                        temp=pre.next;
                    }else{
                        pre.next=temp;
                        post=temp;
                        pre=temp;
                        temp=temp.next;
                    }
                }else{
                    temp=temp.next;
                    post=post.next;
                }
            }
            return head;
        }
        public void addAt(int id,int val){
            if(size<id||id<0){
                System.out.println("Invalid Index");
            }
            else if(id==0){
                Node ptr=new Node();
                ptr.data=val;
                ptr.next=head;
                head=ptr;
                size++;
            }
            else{
                Node ptr=new Node();
                ptr.data=val;
                Node temp=head;
                int pos=0;
                while(pos<id-1){
                    temp=temp.next;
                    pos++;
                }
                ptr.next=temp.next;
                temp.next=ptr;
                size++;

            }
        }
        public void removeLast(){
            if(size==0){
                System.out.println("Empty List");
            }
            else if(size==1){
                head=tail=null;
                size=0;
            }
            else{
                Node temp=head;
                int pos=0;
                while(pos<size-2){
                    temp=temp.next;
                    pos++;
                }
                temp.next=null;
                tail=temp;
                size--;
            }
        }
        public void removeAt(int id){
            if(id<0||id>size){
                System.out.println("Invalid index for removal");

            }
            else if(id==0){
                head=head.next;
                size--;
            }
            else if(id==size-1){
                removeLast();
            }
            else{
                int pos=0;
                Node temp=head;
                while(pos<id-1){
                    temp=temp.next;
                    pos++;
                }
                temp.next=temp.next.next;
                size--;
            }
        }
        public int getFirst(){
            if(size==0){
                System.out.println("List is empty");
                return -1;
            }
            else{
                return head.data;
            }
        }
        public int getLast(){
            if(size==0){
                System.out.println("List is empty");
                return -1;
            }
            else{
                return tail.data;
            }
        }
        public int getAt(int id){
            if(id>size){
                System.out.println("Invalid Index");
                return -1;
            }
            else{
                Node temp=head;
                int pos=0;
                while(pos<id){
                    temp=temp.next;
                    pos++;
                }
                return temp.data; 
            }
        }
        public int kThFromLast(int k){
            Node ptr=head,last=head;
            int p=0;
            while(p<k){
                last=last.next;
                p++;
            }
            while(last.next!=null){
                ptr=ptr.next;
                last=last.next;
            } 
            return ptr.data;

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
                head=pre;

            }
        }
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
        Node rLeft;
        public void reverseDrHelper(Node right,int floor){
            if(right==null){
                return ;
            }
            reverseDrHelper(right.next,floor+1);
            if(floor>size/2){
            int temp=right.data;
            right.data=rLeft.data;
            rLeft.data=temp;
            rLeft=rLeft.next;
            }
            
        }
        public void reverseDrUseRec(){
            rLeft=head;
            reverseDrHelper(head,0);


        }
        public boolean isPalindromRec(Node right,int floor){
            if(right==null){
                return true;
            }
            boolean res=isPalindromRec(right.next, floor+1);
            if(res==false){
                return false;
            }else if(right.data == rl.data){
                    rl=rl.next;
                    return true;
            }
            else{
                return false;
            }
           
        }
        Node rl;
        public boolean isPalindrom(){
            rl=head;
           boolean rres= isPalindromRec(head,0);
           return rres;
        }
        // private  int addListHelper(lList one,int pv1,lList two,int pv2,LinkedList res){
        //     int c=0;
        //     if(one==null && two == null){
        //         return 0;
        //     }

        //     if(pv1>pv2){
        //        c=  addListHelper(one.next, pv1-1, two, pv2, res);
        //     }else if(pv2>pv1){
        //      c=   addListHelper(one,pv1, two.next, pv2-1, res);
        //     }else{


        //      c=  addListHelper(one.next, pv1-1, two.next, pv2-1, res);

        //     }
        //     return c;
        // }
        int size(){
            return size;
        }
        // public  LinkedList addTwoList(lList one,int pv1,lList two,int pv2){
        //     LinkedList res=new LinkedList();
        //     int oc = addListHelper(one,pv1,two,pv2,res);
        //     return res;

            
        // }
        private void foldHelper(Node right,int floor){
            if(right==null){
                return;
            }
            foldHelper(right.next,floor+1);
            if(floor>size/2){
                Node temp=foldleft.next;
                foldleft.next=right;
                right.next=temp;
                foldleft=temp;
            }
            else if(floor==size/2){
                right.next=null;
                tail=right;
            }
            
        }
        Node foldleft;
       
       public void fold(){
        foldleft=head;
               foldHelper(head,0);
       }
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       // int n1=Integer.parseInt(br.readLine());
        lList l1=new lList();
        l1.addLast(5);
        l1.addLast(2);
        l1.addLast(13);
        l1.addLast(3);
        l1.addLast(8);
        l1.display();
        System.out.println("here2");
        removeNodes(l1);
        //String[] values1=br.readLine().split(" ");
        // for(int i=0;i<n1;++i){
        //     int d=Integer.parseInt(br.readLine());
        //     l1.addLast(d);
        // }
        // int n2=Integer.parseInt(br.readLine());
        // lList l2=new lList();
        // //String[] values1=br.readLine().split(" ");
        // for(int i=0;i<n2;++i){
        //     int d=Integer.parseInt(br.readLine());
        //     l2.addLast(d);
        // }
       // l1.display();
      //  int k=l1.getFirst();
        //l1.addfirst(5);
       // int l=l1.getFirst();
        //System.out.println(k+" "+l);
       // l1.display();
    //    l1.reverse();
    //    l1.display();
    // lList l=new lList();
    //  LinkedList l=new LinkedList();
    // //l=addTwoList(l1,l1.size(),l2,l2.size());
    //    System.out.println();
    //    System.out.println(l1.size());
    //    // l1.reverseDrUseRec();

    //     l1.display();
    //    // boolean ans=l1.isPalindrom();
    //     l1.fold();
    //     System.out.println();
    System.out.println("here3");
        l1.display();

    }
   
}