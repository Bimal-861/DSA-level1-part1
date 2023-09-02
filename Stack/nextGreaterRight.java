import java.io.*;
import java.util.*;

public class nextGreaterRight {
    public static void display(int[] a){
        StringBuilder sb=new StringBuilder();
        for(int val:a){
            sb.append(val+" ");
        }
        System.out.println(sb);
    }
    public static int[] solve(int[] nums){
        int nge[]=new int[nums.length];
        Stack<Integer> s=new Stack<>();
        nge[nums.length-1]=-1;
        s.push(nums[nums.length-1]);

        for(int i=nums.length-2;i>=0;--i){
            int val=nums[i];
           
          
            
                while(s.peek() <= val  && s.size()>0){
                    s.pop();
                }
                if(s.size()==0){
                    nge[i]=-1;
                    s.push(val);
                }
                else{
                    nge[i]=s.peek();
                     s.push(val);
                }
            

        }

        return nge;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[n];
        for (int i=0;i<n;++i){
            a[i]=Integer.parseInt(br.readLine());
        }
        int []nge=solve(a);
        display(nge);
    }
}
