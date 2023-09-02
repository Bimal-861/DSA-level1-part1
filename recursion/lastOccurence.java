package pack.recursion;
import java.util.Scanner;

public class lastOccurence {
    private static int firstIndex(int[] arr,int n,int d){
        if(n==0){
            if(arr[0]==d){
                return 0;
            }
            return -1;
        }
        if(arr[n]==d){
            return n;
        }
        else{
           return firstIndex(arr,n-1,d);
        }

    }
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int []arr=new int[n];

            for(int i=0;i<n;++i){
                arr[i]=sc.nextInt();
            }
             int data=sc.nextInt();
            int idx=firstIndex(arr,n-1,data);
            System.out.println(idx);
    }
   
}