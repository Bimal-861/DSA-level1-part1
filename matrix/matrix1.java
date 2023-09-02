package matrix.matrix1;

import java.util.Scanner;

public class matrix1{
    public static void display(int[][] ans){
        for(int i=0;i<ans.length;++i){
            for(int j=0;j<ans[0].length;++j){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void giveAnswer(int[][] arr1,int[][] arr2){
        int r1=arr1.length;
        int c1=arr1[0].length;
        int r2=arr2.length;
        int c2=arr2[0].length;

        if(c1==r2){
            int[][] ans=new int[r1][c2];
            for(int r=0;r<r1;r++){
                for(int c=0;c<c2;c++){
                    for(int k=0;k<c1;k++){
                        ans[r][c]+=arr1[r][k]*arr2[k][c];
                    }
                }
            }
            display(ans);
        }else{
            System.out.println("invalid input");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int[][] arr1=new int[row][column];
        int[][] arr2=new int[row][column];
        System.out.println("Enter value for first matrix");
        for(int i=0;i<row;++i){
            for(int j=0;j<column;++j){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter value for Second matrix");
        for(int i=0;i<row;++i){
            for(int j=0;j<column;++j){
                arr2[i][j]=sc.nextInt();
            }
        }

        giveAnswer(arr1,arr2);
    }
}