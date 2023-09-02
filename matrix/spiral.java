package matrix.matrix1;
import java.util.Scanner;

public class spiral {
        public static void display(int[][] ans){
           int maxR=ans.length-1;
           int maxC=ans[0].length-1;
           int count=maxR*maxC;
           int minR=0;
           int minC=0;
            int c=0;
           while(c<count){
            
            for(int i=minR;i<=maxR && c<count;++i){
                System.out.print(ans[i][minC]+" "+c+" ");
                c++;
            }
            System.out.println();
            minC=minC+1;
            for(int j=minC;j<=maxC && c<count;++j){
                System.out.print(ans[maxR][j]+" "+c+" ");
                 c++;
            }
             System.out.println();
            maxR=maxR-1;
            for(int i=maxR;i>=minR && c<count;--i){
                System.out.print(ans[i][maxC]+" "+c+" ");
                 c++;
            }
             System.out.println();
            maxC=maxC-1;
            for(int i=maxC;i>=minC && c<count;--i){
                System.out.print(ans[minR][i]+" "+c+" ");
                 c++;
            }
             System.out.println();
            minR=minR+1;
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
            for(int i=0;i<row;++i){
                for(int j=0;j<column;++j){
                    System.out.print(arr1[i][j]);
                }
                 System.out.println();
            }
           
            display(arr1);
        }
}
