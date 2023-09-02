package pack.recursion;
import java.util.Scanner;

public class fact {
    private static long factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long ans=factorial(n);
        System.out.println(ans);
    }
}
