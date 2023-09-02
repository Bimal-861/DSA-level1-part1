package matrix.matrix1;

import java.util.Scanner;

public class exitPoint {
    public static void giveAnswer(int[][] ans){
        int dir=0;
        int i=0;int j=0;
        while(true){
            dir=(dir+ans[i][j])%4;
            if(dir==0){
                if(j==ans[0].length){
                    System.out.println(i+" "+(j-1));
                    break;
                }
                j++;
            }else if(dir==1){
                 i++;
                  if(i==ans.length){
                    System.out.println(i-1+" "+(j));
                    break;
                }
               
            }
            else if(dir==2){
                   j--;
                  if(j==-1){
                    System.out.println(i+" "+(j+1));
                    break;
                }
             
            }
            else if(dir==3){
                   i--;
                  if(i==-1){
                    System.out.println(i+1+" "+(j));
                    break;
                }
             
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int[][] arr1=new int[row][column];
        System.out.println("Enter value for first matrix");
        for(int i=0;i<row;++i){
            for(int j=0;j<column;++j){
                arr1[i][j]=sc.nextInt();
            }
        }
        giveAnswer(arr1);
    }
    
}
