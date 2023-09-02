package matrix.matrix1;

import java.util.Scanner;


public class rotateNinety {
    public static void display(int[][] ans){
        for(int i=0;i<ans.length;++i){
            for(int j=0;j<ans[0].length;++j){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void giveAnswer(int [][]arr){
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;++i){
            for(int j=i;j<c;++j){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println("This is Transpose");
        display(arr);
        for(int i=0;i<r;++i){
          int li=0;int ri=arr[i].length-1;
          while(li<ri){
            int temp=arr[i][li];
            arr[i][li]=arr[i][ri];
            arr[i][ri]=temp;
            li++;
            ri--;
          }
        }
          System.out.println("This is Answer");
        display(arr);
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
          System.out.println("This is Original");
        display(arr1);
        giveAnswer(arr1);
    }
}
