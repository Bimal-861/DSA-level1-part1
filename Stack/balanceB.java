import java.util.*;

public class balanceB {
    static int check(Character ch){
        if(Character.isLetter(ch)){
            return 1;
        }
        else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            return 1;
        }
        else 
            return 0;
    }
    public static void main(String[] args){
        Stack<Character> s=new Stack<>();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        for(int i=0;i<str.length();++i){
            char ch=str.charAt(i);
            if(ch==')'||ch=='}'||ch==']'){
                if(ch==')'){
                   if(s.size()==0){
                    System.out.println("Not Balnced11");
                    return;
                   }
                   else if(s.peek()!='('){
                    System.out.println("Not Balnced12");
                    return;
                   }
                   else{
                    s.pop();
                   }
                   
                }
                else if(ch=='}'){
                    if(s.size()==0){
                    System.out.println("Not Balnced21");
                    return;
                   }
                   else if(s.peek()!='{'){
                    System.out.println("Not Balnced22");
                    return;
                   }
                   else{
                    s.pop();
                   }
                }
                else if(ch==']'){
                     if(s.size()==0){
                    System.out.println("Not Balnced31");
                    return;
                   }
                   else if(s.peek()!='['){
                    System.out.println("Not Balnced33");
                    return;
                   }
                   else{
                    s.pop();
                   }
                }
            }
            else if(ch=='('||ch=='{'||ch=='['){
                s.push(ch);
            }
        }
        if(s.size()==0){
            System.out.println(" Balnced");
        }
        else
             System.out.println("Not Balnced4");
    }
}
