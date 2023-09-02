import java.io.*;
import java.util.*;


public class largestAreaHist {
    public static int[] nser(int[] arr){
        int nse[] =new int[arr.length];
        Stack<Integer> s=new Stack<>();
        nse[arr.length-1]=arr.length;
        s.push(arr.length-1);
        for(int i=arr.length-2;i>=0;--i){
            while(s.size()>0 && arr[i]<arr[s.peek()]){
                s.pop();
            }
            if(s.size()==0){
                nse[i]=arr.length;
            }
            else{
                nse[i]=s.peek();
            }
            s.push(i);

        }

        return nse;
    }
    public static int[] nsel(int[] arr){
        int nse[] =new int[arr.length];
        Stack<Integer> s=new Stack<>();
        nse[0]=-1;
        s.push(0);
        for(int i=1;i<arr.length;++i){
            while(s.size()>0  && arr[i]<=arr[s.peek()]){
                s.pop();
            }
            if(s.size()==0){
                nse[i]=-1;
            }
            else{
                nse[i]=s.peek();
            }
            s.push(i);

        }

        return nse;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        for(int i=0;i<n;++i){
            a[i]=Integer.parseInt(br.readLine());
        }

        int [] rb=new int[n];
        rb=nser(a);
        for(int i=0;i<n;++i){
            System.out.print(rb[i]);
        }
        System.out.println();

        int[] lb=new int[n];
        lb=nsel(a);
          for(int i=0;i<n;++i){
            System.out.print(lb[i]);
        }
         System.out.println();
        int maxArea=0;
        for(int i=0;i<a.length;++i){
            int width=rb[i]-lb[i]-1;
            int area=width*a[i];
            if(maxArea<area){
                maxArea=area;
            }
        }
        System.out.println(maxArea);
    }
}
