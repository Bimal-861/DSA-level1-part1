package pack.recursion;
import java.util.Scanner;

import java.util.*;

import java.util.LinkedList;
import java.util.List;

public class allIndices {
    static int c=0;
    private static int[] allIndex(int[] arr,int n,int d,int fsf){
        if(n==arr.length){
            return new int[fsf];
        }
        if(arr[n]==d){
            int[] ans=allIndex(arr,n+1,d,fsf+1);
            ans[fsf]=n;
            return ans;
        }
        else{
            int[] ans=allIndex(arr,n+1,d,fsf);
            return ans;
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
          
            int[] ans= allIndex(arr,0,data,0);
            for(int i=0;i<ans.length;++i){
               System.out.print(ans[i]+" ");

            }
           
          

    }
   
}
