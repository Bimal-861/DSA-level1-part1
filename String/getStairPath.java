package string;
import java.util.*;

public class getStairPath {
    private static ArrayList<String> getAllPath(int k){
        if(k==0){
            String s="";
            ArrayList<String> bres=new ArrayList<>();
            bres.add(s);
            return bres;
        }
        else if(k<0){
            return new ArrayList<String>();
        }
        ArrayList<String> p1=getAllPath(k-1);
        ArrayList<String> p2=getAllPath(k-2);
        ArrayList<String> p3=getAllPath(k-3);

        ArrayList<String> paths=new ArrayList<>();

        for(String s:p1){
            paths.add(1+s);
        }
        for(String s:p2){
            paths.add(2+s);
        }
        for(String s:p3){
            paths.add(3+s);
        }
        return paths;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int str=sc.nextInt();
        
        ArrayList<String> al=getAllPath(str);
        System.out.println(al);
    }
}
