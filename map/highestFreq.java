
import java.util.*;
public class highestFreq {
    private static Character highFreq(String str){
        HashMap<Character,Integer> h=new HashMap<>();
        char ch='0';
        for(int i=0;i<str.length();++i){
            ch=str.charAt(i);
            if(h.containsKey(ch)){
                h.put(ch,h.get(ch)+1);
            }
            else{
                h.put(ch,0);
            }
        }
        char mch='0';
        int c=-1;
        for(Character key:h.keySet()){
           if(h.get(key)>c){
            mch=key;
            c=h.get(key);
           }
        }

        return mch;
    }
    public static void main(String[] args){
        String str="abrakadabra";
        char ch=highFreq(str);
        System.out.println(ch);
    }
}
