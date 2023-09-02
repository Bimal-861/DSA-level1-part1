package pack.recursion;
import java.util.Scanner;

public class rec {
    private static void printDec(int n){
        if(n==0){
            return;
        }else{
            System.out.println(n);
            printDec(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDec(n);
    }
}
