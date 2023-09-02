import java.util.*;

public class displayTree {
    private static class Node{
        int data;
        LinkedList<Node> children=new LinkedList<>();
    }
    private static int size(Node node){
        if(node==null){
            return 0;
        }
        int cm=1;
        for(Node child:node.children){
             cm+=size(child);
        }
        return cm;
    }
    private static void display(Node node){
        if(node==null){
            return;
        }
        String str=node.data+"->";
        for(Node child:node.children){
            str+=child.data+",";
        }
        str+=".";
        System.out.println(str);
        for(Node child:node.children){
            display(child);
        }
    }
    private static int height(Node node){
        int ht=-1;
        for(Node child:node.children){
            int x=height(child);
            ht=Math.max(x,ht);
        }
        ht+=1;
        return ht;
    }
    private static int max(Node node){
        int max=node.data;
      
        for(Node child: node.children){
           int cm=max(child);
           max=Math.max(cm,max);
        }
        return max;
    }
    private static void traversal(Node node){
        if(node==null){
            return;
        }
        System.out.println("Pre ->"+node.data);
        for(Node child:node.children){
            System.out.println("Pre Edge of"+node.data+"-->"+child.data);
            traversal(child);
            System.out.println("Post Edge of"+node.data+"-->"+child.data);

        }
        System.out.println("post  ->"+node.data);
    }
    private static void levelOrder(Node node){
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        while(q.size()!=0){
            Node n=q.remove();
            System.out.print(n.data+" ");
            for(Node child:n.children){
                q.add(child);
            }
        }

    }
    private static void levelOrderLineWise(Node node){
         Queue<Node> q1=new LinkedList<>();
         Queue<Node> q2=new LinkedList<>();
      
         q1.add(node);
         while(q1.size()!=0){
            Node q=q1.remove();
               System.out.print(q.data+" ");
            for(Node child:q.children){
                q2.add(child);
            }
            if(q1.size()==0){
                q1=q2;
            q2=new LinkedList<>();
            System.out.println();
            }
            
         }
    }
    private static void levelOrderLineWiseZigZag(Node node){
        int level=1;
        Stack<Node> ms=new Stack<>();
        Stack<Node> cs=new Stack<>();
        ms.push(node);
        while(ms.size()!=0){
            node =ms.pop();
             System.out.print(node.data+" ");
            if(level%2==1){
                 for(Node child:node.children){
                    cs.push(child);
                 }
            }
            else{
                for(int i=node.children.size()-1;i>=0;--i){
                    cs.push(node.children.get(i));
                }
            }

            if(ms.size()==0 && cs.size()!=0){
                ms=cs;
                cs=new Stack<>();
                  level++;
                System.out.println();
            }
         
        }
    }
    private static void print(Node node){
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        q.add(null);
        while(q.size()!=0){
            Node temp=q.remove();
            if(temp!=null){
                 System.out.print(temp.data+" ");
                  for(Node child:temp.children){
                        q.add(child);
                    }
            }
            else{
                if(q.size()>0){
              
                    q.add(null);
                    System.out.println();
                }
            }
           
           
        }
    }
    private static void print2(Node node){
       Queue<Node> q=new LinkedList<>();
       q.add(node);
       while(q.size()!=0){
        int s=q.size();
        for(int i=0;i<s;++i){
            node=q.remove();
            System.out.print(node.data+" ");
            for(Node child:node.children){
                q.add(child);
            }
        }
        System.out.println();
       }

    }
    private static void mirror(Node node){
        for(Node child:node.children){
            mirror(child);
        }
        Collections.reverse(node.children);
    }
    private static void removeLeaves(Node node){
        for(int i=node.children.size()-1;i>=0;--i){
            Node temp=node.children.get(i);
            if(temp.children.size()==0){
                node.children.remove(temp);
            }
        }
        for(Node child:node.children){
            removeLeaves(child);
        }
    }
    private static Node getTail(Node node){
        while(node.children.size()==1){
            node=node.children.get(0);
        }
        return node;
    }
    private static void linearize(Node node){
        
        for(Node child:node.children){
            linearize(child);
        }
        while(node.children.size()>1){
            Node lc=node.children.remove(node.children.size()-1);
            Node slc=node.children.get(node.children.size()-1);
            Node slct=getTail(slc);
            slct.children.add(lc);
        }
    }
    private static Node linearize2(Node node){
        if(node.children.size()==0){
            return node;
        }
        Node last=linearize2(node.children.get(node.children.size()-1));
        while(node.children.size()>1){
            Node lc=node.children.remove(node.children.size()-1);
            Node sl=node.children.get(node.children.size()-1);
            Node slkt=linearize2(sl);
            slkt.children.add(lc);
        }
        return last;
    }
    public static boolean find(Node node,int data){
        if(node.data==data){
            return true;
        }
        for(Node child:node.children){
            boolean t=find(child,data);
            if(t){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root=null;

        Stack<Node> s=new Stack<>();

        for(int i=0;i<arr.length;++i){
            if(arr[i]==-1){
                s.pop();
            }else{
                Node temp=new Node();
                temp.data=arr[i];
                if(s.size()>0){
                    s.peek().children.add(temp);
                }else{
                  root=temp;
                }
                 s.push(temp);
            }
           
           
        }
        // display(root);
        //  int st=size(root);
        // int max=max(root);
        // int ht=height(root);
        // System.out.println(max);
        // System.out.println(st);
        // System.out.println(ht);
        // traversal(root);
        // levelOrder(root);
        // levelOrderLineWise(root);
        // levelOrderLineWiseZigZag(root);
        // print2(root);
        // mirror(root);
        // display(root);
        // removeLeaves(root);
        // display(root);
        // linearize2(root);
        // display(root);
        // System.out.println(find(root,1110));
        System.out.println(size(root));
    }
}
