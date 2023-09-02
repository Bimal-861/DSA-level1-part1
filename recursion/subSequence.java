package pack.recursion;
import java.util.Scanner;
import java.util.ArrayList;

public class subSequence {
    
    private static ArrayList<String> gss(String str){
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> al;
        al=gss(ros);
         ArrayList<String> myAl=new ArrayList<>();
        for(String s:al){
            myAl.add(""+s);
            myAl.add(ch+s);
            
        }
        return myAl;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         String str=sc.next();
        
        ArrayList<String> ans=gss(str);
        System.out.println(ans);

    }
}
