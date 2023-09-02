package string;
import java.util.Scanner;

public class printSubSequence {
    private static void getAllSequence(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String st1=(str.substring(1));
        getAllSequence(st1,ans+"");
        getAllSequence(st1,ans+ch);
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        
        getAllSequence(str,"");
        
    }
    
}
