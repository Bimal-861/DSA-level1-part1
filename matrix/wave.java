package matrix.matrix1;
import java.util.Scanner;

public class wave {
        public static void display(int[][] ans){
            for(int i=0;i<ans[0].length;++i){
                if(i%2==0){
                    for(int j=0;j<ans.length;++j){
                    System.out.print(ans[j][i]+" ");
                }
                }else{
                    for(int j=ans.length-1;j>=0;--j){
                      System.out.print(ans[j][i]+" ");   
                    }
                }
                
                System.out.println();
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
            }
            System.out.println();
            display(arr1);
        }
}
