class ArrayImpl{
    static int root=0;
    static String[] bTree=new String[10];

    public void Root(String key){
        bTree[0]=key;
    }

    public void left(String key,int root){
        if(bTree[root]==null){
            System.out.println("Enter a valid tree root\n");
        }
        else{
            int t=root*2+1;
            bTree[t]=key;
        }
    }
    public void right(String key,int root){
        if(bTree[root]==null){
            System.out.println("Enter a valid tree root\n");
        }
        else{
            int t=root*2+2;
            bTree[t]=key;
        }
    }
    public void print(){
        for(int i=0;i<10;++i){
            if(bTree[i]==null){
                System.out.println("-");
            }
            else{
                System.out.println(bTree[i]);
            }
        }
    }
}


public class arrayImp {
    public static void main(String[] args){
        ArrayImpl ar=new ArrayImpl();
        ar.Root("A");
        ar.left("B",0);
        ar.left("D",1);
        ar.right("C",0);
        ar.right("E",1);
        ar.right("F",2);
        ar.print();
    }
}
