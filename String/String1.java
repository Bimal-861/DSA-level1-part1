package string;
import java.util.*;
public  class String1{
    private static  ArrayList<String> getSubSeq(String s){
        if(s.length()==0){
            ArrayList<String> bres= new ArrayList<String>();
            bres.add("");
            return bres;
        }
        char ch=s.charAt(0);
        ArrayList<String> ss=getSubSeq(s.substring(1));
        ArrayList<String> newArray=new ArrayList<>();
        for(String each:ss){
            newArray.add(""+each);
            newArray.add(ch+each);
        }
        return newArray;
       
    }
    public static void main(String[] args){
        String str="";
        // System.out.println(str);
        // String ss=str.substring(0, 3);
        // System.out.println(ss);
        ArrayList<String> al= getSubSeq(str);
        System.out.println(al);
    }
}