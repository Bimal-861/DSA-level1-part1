package matrix.matrix1;

import java.util.Scanner;
public class diagonal {
    public static void giveAnswer(int[][] arr){
        for(int i=0;i<arr[0].length;++i){
           
            for(int j=i,k=0;j<arr[0].length && j<arr.length;++j){
                System.out.print(arr[k++][j]+" ");
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
        giveAnswer(arr1);
    }
    
}
