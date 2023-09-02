import java.io.*;
import java.util.*;


public class slidingWindow {
    private static int[] nge(int arr[]){
        int ngeR[]=new int[arr.length];
        Stack<Integer> s= new Stack<>();
        ngeR[arr.length-1]=arr.length;
        s.push(arr.length-1);
        for(int i=arr.length-2;i>=0;--i){
            while(s.size()>0 && arr[i]>=arr[s.peek()]){
                s.pop();
            }
            if(s.size()==0){
                ngeR[i]=arr.length;
            }
            else{
                 ngeR[i]=s.peek();
            }

           s.push(i);
        }

        return ngeR;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int k=Integer.parseInt(br.readLine());
        int ngeR[]=new int[n];
        ngeR=nge(arr);
        for(int i=0;i<n;++i){
             System.out.print(ngeR[i]+" ");
        }
        System.out.println();
        int []ans=new int[arr.length-k+1];
        for(int i=0;i<ans.length;++i){
            int j=i;
            while(ngeR[j]<i+k){
                j=ngeR[j];
                
            }
            ans[i]=arr[j];
            
        }
        for(int i=0;i<ans.length;++i){
            System.out.print(ans[i]+" ");
        }

    
}
}
