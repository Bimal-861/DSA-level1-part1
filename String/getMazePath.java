package string;
import java.util.*;
public class getMazePath {

    private static ArrayList<String> getAllPath(int sr,int sc,int dr,int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths=new ArrayList<>();
        for(int h=1;h<=dc-sc;h++){
            ArrayList<String> hpath=getAllPath(sr,sc+h,dr,dc);
            for(String s:hpath){
                paths.add("h"+h+s);
            }

        }
        for(int l=1;l<=dr-sr;l++){
            ArrayList<String> lpath=getAllPath(sr+l,sc,dr,dc);
             for(String s:lpath){
                paths.add("l"+l+s);
            }
        }
        for(int d=1;d<=dc-sc  && d<=dr-sr;d++){
            ArrayList<String> dpath=getAllPath(sr+d,sc+d,dr,dc);
             for(String s:dpath){
                paths.add("d"+d+s);
            }
        }
        return paths;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        ArrayList<String> al=getAllPath(1,1,n,m);
        System.out.println(al);
    }
}
