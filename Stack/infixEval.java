import java.io.*;
import java.util.*;

public class infixEval {
    public static int precedence(char ch){
        if(ch=='+'){
            return 1; 
        }else if(ch=='-'){
              return 1; 
        }else if(ch=='*'){
              return 2; 
        }else if(ch=='/'){
              return 2; 
        }

        return -1;
    }
    public static int operation(int val1,int val2,char ch){
        if(ch=='+'){
            return val1+val2;
        }else if(ch=='-'){
              return val1-val2;
        
        }else if(ch=='*'){
              return val1*val2;
        
        }else if(ch=='/'){
              return val1/val2;
        }
        return -1;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String exp=br.readLine();
        Stack<Integer> opnd=new Stack<>();
        Stack<Character> optor=new Stack<>();
        for(int i=0;i<exp.length();++i){
            char ch=exp.charAt(i);
            if(ch=='('){
                optor.push(ch);
            }else if(Character.isDigit(ch)){
                opnd.push(ch-'0');
            }
            else if(ch==')'){
                while(optor.peek()!='('){
                    char c=optor.pop();
                    int v2=opnd.pop();
                    int v1=opnd.pop();
                    int opv=operation(v1,v2,c);
                    opnd.push(opv);
                }
                optor.pop();

            }else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                while(optor.size()>0 && optor.peek()!='(' && precedence(ch)<=precedence(optor.peek())){
                      char c=optor.pop();
                    int v2=opnd.pop();
                    int v1=opnd.pop();
                    int opv=operation(v1,v2,c);
                    opnd.push(opv);
                }
                optor.push(ch);
            }
        }
        while(optor.size()!=0){
              char c=optor.pop();
                    int v2=opnd.pop();
                    int v1=opnd.pop();
                    int opv=operation(v1,v2,c);
                    opnd.push(opv);
        }
        System.out.println(opnd.peek());
    }
}
