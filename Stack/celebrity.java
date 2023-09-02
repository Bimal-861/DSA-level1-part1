import java.io.*;
import java.util.*;

public class celebrity {
    public static void findcelebrity(int[][] arr){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;++i){
            s.push(i);
        }
        while(s.size()>=2){
            int i=s.pop();
            int j=s.pop();
            if(arr[i][j]==1){
                s.push(j);
            }
            else{
               s.push(i); 
            }

        }
        int pot=s.pop();
        for(int i=0;i<arr.length;++i){
            if(i!=pot){
                if(arr[i][pot] ==0 || arr[pot][i]==1){
                    System.out.print("none");
                    return;
                }
            }
        }
        System.out.println(pot);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] arr=new int[n][n];

        for(int i=0;i<n;++i){
            String line = br.readLine();
            for(int j=0;j<n;++j){
                arr[i][j]=line.charAt(j)-'0';
            }
        }
        findcelebrity(arr);
    }
}
