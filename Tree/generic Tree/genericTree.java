package tree.generic;
import java.util.*;

public class genericTree{
    
    private static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }
    public static int size(Node node){
        int s=0;
        if(node == null){
            return 0;
        }
        else{
            s=1;
            for(Node child:node.children){
                s+=size(child);
            }
        }

        return s;
    }
    public static int height(Node node){
        int ht=-1;
        for(Node child:node.children){
            int ch=height(child);
            ht=Math.max(ht,ch);
        }
        ht +=1;
        return ht;
    }
    public static void display(Node node){
       String str=node.data+"->";
       for(Node child: node.children){
        str+=child.data+",";
       }
       str+=".";
       System.out.println(str);
       for(Node child:node.children){
        display(child);
       }

    }
    public static void levelOrder(Node node){
       Queue<Node> q=new ArrayDeque<>();
       q.add(node);
       while(q.size()>0){
        node=q.remove();
        System.out.println(node.data+" ");

       
       for(Node child:node.children){
        q.add(child);
       }
    }
        System.out.println(node.data+".");
    }
    public static void levelOrderLine(Node node){
       Queue<Node> q=new ArrayDeque<>();
       Queue<Node> qc=new ArrayDeque<>();

       q.add(node);
       while(q.size()>0){
            node=q.remove();
            System.out.print(node.data+" ");

        
            for(Node child:node.children){
                qc.add(child);
            }
            if(q.size()==0){
                 q=qc;
                 qc=new ArrayDeque<>();
                  System.out.println(".");
            }
           
           
       }
    }
    public static void levelOrderLineWise(Node node){
      Stack<Node> s=new Stack<>();
      Stack<Node> cs=new Stack<>();
      int flag=0;

       s.push(node);
       while(s.size()>0){
            node=s.pop();
            System.out.print(node.data+" ");

            if(flag%2==0){
                for(int i=0;i<node.children.size();++i){
                    Node child=node.children.get(i);
                    cs.push(child);
                }
            }else{
                 for(int i=node.children.size()-1;i>=0;--i){
                    Node child=node.children.get(i);
                    cs.push(child);
                }
            }
            if(s.size()==0){
                s=cs;
                cs=new Stack<>();
                flag++;
                System.out.println();
            }
        }


           
           
       
        //System.out.println(node.data+".");
    }
    public static int max(Node node){
        int max=node.data;
        for(Node child:node.children){
            int cm=max(child);
            max=Math.max(max,cm);
        }
        

        return max;
    }
    public static void traversal(Node node){

        System.out.println("Node pre :"+node.data);
        for(Node child:node.children){
            System.out.println("Edge pre:"+node.data+"-"+child.data);
            traversal(child);
             System.out.println("Edge post:"+node.data+"-"+child.data);
        }
        System.out.println("Node post:"+node.data);

    }
    public static void print(Node node){
        if(node==null){
           
            return ;
        }
        else{
            System.out.print(node.data+"-> ");
            for(Node child:node.children){
                System.out.print(","+child.data);
            }
            System.out.println();
            for(Node child:node.children){
                print(child);
            }
        }
    }
    public static int length(Node node){
        
    }
    public static void main(String[] args){
        int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        //genericTree g=new genericTree();
        Node root=null;
        Stack<Node> s=new Stack<>();
        for(int i=0;i<arr.length;++i){
            if(arr[i]==-1){
                s.pop();
            }
            else{
                Node temp=new Node();
                temp.data=arr[i];
                if(s.size()>0){
                    s.peek().children.add(temp);
                }
                else{
                    root=temp;
                }
                s.push(temp);
            }
        }
        //display(root);
        print(root);
        
        // for(int i=0;i<arr.length;++i){
        //     if(arr[i]==-1){
        //         s.pop();
        //     }
        //     else{
        //         Node t=new Node();
        //         t.data=arr[i];
        //         if(s.size()>0){
        //             s.peek().children.add(t);
                   
        //         }
        //         else{
        //             root=t;
        //         }
        //           s.push(t);
                
        //     }
        // }
        //display(root);
        // int k=size(root);
        // int m=max(root);
        // int h=height(root);
        // System.out.println(k+" "+m+" "+h);

        //traversal(root);
       // levelOrder(root);
      // levelOrderLineWise(root);
    }
}