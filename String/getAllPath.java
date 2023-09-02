package string;
import java.util.ArrayList;
import java.util.Scanner;

public class getAllPath {
    private static ArrayList<String> getAll(int sr,int sc,int dr,int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hpath=new ArrayList<>();
        ArrayList<String> lpath=new ArrayList<>();
        if(sc<dc){
            hpath=getAll(sr,sc+1,dr,dc);
        }
        if(sr<dr){
             lpath=getAll(sr+1,sc,dr,dc);
        }
        ArrayList<String> al=new ArrayList<>();
        for(String s:hpath){
            al.add("h"+s);
        }
        for(String s:lpath){
            al.add("v"+s);
        }
        return al;
       
    }
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        ArrayList<String> al=getAll(1,1,n,m);
        System.out.println(al);
    }
}
