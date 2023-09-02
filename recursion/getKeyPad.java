package pack.recursion;
import java.util.*;

public class getKeyPad {
    static String codes[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    private static ArrayList<String> getKey(String str){
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        int c=str.charAt(0)-'0';
        String ros=str.substring(1);
        ArrayList<String> rres=getKey(ros);
        ArrayList<String> myRes=new ArrayList<>();
        for(int i=0;i<codes[c].length();++i){
            char ch=codes[c].charAt(i);
            for(String s:rres){
                myRes.add(ch+s);
            }
        }
        return myRes;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String> ans=getKey(str);
        System.out.println(ans);
    }
}
