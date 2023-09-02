package pack.recursion;
import java.util.Scanner;

public class towerOfHanoi {
    private static void tofh(int disk,char ch1,char ch2,char ch3){
        if(disk==0){
            return;
        }
        tofh(disk-1,ch1,ch3,ch2);
        System.out.println(ch1+"--->"+ch2);
        tofh(disk-1,ch3,ch2,ch1);


    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       char ch1=str.charAt(0);
       char ch2=str.charAt(1);
       char ch3=str.charAt(2);
        int n=sc.nextInt();
        tofh(n,ch1,ch2,ch3);

    }
}
