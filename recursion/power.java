package pack.recursion;
import java.util.Scanner;
public class power {
    private static long pow(int x,int y){
        if(y==0){
            return 1;
        }
        else {
            return x*(pow(x,y-1));
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();

        long ans= pow(n,x);
        System.out.println(ans);
    }
}
