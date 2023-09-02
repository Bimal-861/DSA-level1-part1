import java.io.*;
import java.util.*;

public class duplicateB {
    public static void main(String[] args){
        Stack<Character> s=new Stack<>();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        for(int i=0;i<str.length();++i){
            char ch=str.charAt(i);
            if(ch==')'){
                if(s.peek()=='('){
                    System.out.println("Duplicate");
                    return;
                }
                else{
                    while(s.peek()!='('){
                        s.pop();
                    }
                    s.pop();
                }
            }
            else{
                s.push(ch);
            }
        }
      System.out.println("No duplicate");  
    }
}
