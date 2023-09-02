import java.util.*;


class Node{
    int key;
    Node left,right;
    public Node(int item){
        key=item;
        left=right=null;
    }
}
class BinaryTree{
    static Node root;
    
    BinaryTree(int key){
        root=new Node(key);
    }
    BinaryTree(){
        root=null;
    }
    int maxDepth(Node node){
        if(node==null){
            return 0;
        }
        else{
            int ldepth=maxDepth(node.left);
            int rdepth=maxDepth(node.right);

            if(ldepth>rdepth){
                return ldepth+1;
            }
            else{
                return rdepth+1;
            }
        }
    }
    static void insert(Node node,int key){
        if(node == null){
            Node root=new Node(key);
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(node);

        while(!q.isEmpty()){
            Node temp=q.peek();
            q.remove();
            if(temp.left==null){
                temp.left=new Node(key);
                break;
            }
            else{
                q.add(temp.left);
            }

            if(temp.right==null){
                temp.right=new Node(key);
                break;
            }
            else{
                q.add(temp.right);
            }
        }
    }
     static void inorder(Node temp){
       if(temp==null){
        return;
       } 
       inorder(temp.left);
       System.out.print(temp.key+"->");    
       inorder(temp.right);
    }
    public static void main(String[] args){
        BinaryTree tree=new BinaryTree();
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);

        int d=tree.maxDepth(root);
        System.out.println(d);
        inorder(root);
        System.out.println();
        int key=12;
        insert(root,key);
         d=tree.maxDepth(root);
        System.out.println(d);
        inorder(root);

    }
}