package string;
import java.util.*;

public class getKeyPad {
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    private static ArrayList<String> getAllKey(String str){
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=str.charAt(0);
        ArrayList<String> rres=getAllKey(str.substring(1));
        ArrayList<String> ans=new ArrayList<>();
        String s=codes[ch-'0'];
        for(int i=0;i<s.length();++i){
            char c=s.charAt(i);
            for(String x:rres){
                ans.add(c+x);
            }
        } 
        return ans;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        ArrayList<String> al=getAllKey(str);
        System.out.println(al);
    }
}
