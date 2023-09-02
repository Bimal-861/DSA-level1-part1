package pack.recursion;
import java.util.Scanner;

public class printArrMax {
    static int max=Integer.MIN_VALUE;
    private static int print(int[] arr,int n){
        if(n==0){
           
            return arr[0];
        }

      int maxc= print(arr,n-1);
       max=Math.max(maxc,arr[n]);
      return max;

    }
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int []arr=new int[n];

            for(int i=0;i<n;++i){
                arr[i]=sc.nextInt();
            }
           int ans= print(arr,n-1);
           System.out.println(ans);
    }
   
}