package matrix.matrix1;

import java.util.Scanner;


public class shellRotate {
    public static void display(int[][] ans){
        for(int i=0;i<ans.length;++i){
            for(int j=0;j<ans[0].length;++j){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rotate(int[] oneD,int r){
        r=r%oneD.length;
        reverse(oneD,0,oneD.length-r-1);
        reverse(oneD,oneD.length-r,oneD.length-1);
        reverse(oneD,0,oneD.length-1);
    }
    public static void reverse(int[] arr,int li,int ri){
        while(li<ri){
            int temp=arr[li];
            arr[li]=arr[ri];
            arr[ri]=temp;
            li++;
            ri--;
        }
    }
    private static int[] giveArray(int [][]arr,int s){
        int minR=s-1;
        int minC=s-1;
        int maxR=arr.length-s;
        int maxC=arr[0].length-s;
        int n=2*(maxR-minR)+2*(maxC-minC);
        int ans[]=new int[n];
        int i=0;
        for(int j=minR;j<=maxR;++j){
            ans[i++]=arr[j][minC];
        }
        minC++;
        for(int j=minC;j<=maxC;j++){
            ans[i++]=arr[maxR][j];
        }
        maxR--;
        for(int j=maxR;j>=minR;j--){
            ans[i++]=arr[j][maxC];
        }
        maxC--;
        for(int j=maxC;j>=minC;j++){
             ans[i++]=arr[j][maxC];
           
        }
        return ans;

    }
    public static void fillArray(int[][] arr,int s,int[] aneD){
        int minR=s-1;
        int minC=s-1;
        int maxR=arr.length-s;
        int maxC=arr[0].length-s;
        int n=2*(maxR-minR)+2*(maxC-minC);
        int ans[]=new int[n];
        int i=0;
        for(int j=minR;j<=maxR;++j){
            arr[j][minC]=ans[i++];
        }
        minC++;
        for(int j=minC;j<=maxC;j++){
            arr[maxR][j]=ans[i++];
        }
        maxR--;
        for(int j=maxR;j>=minR;j--){
            arr[j][maxC]=ans[i++];
        }
        maxC--;
        for(int j=maxC;j>=minC;j++){
            arr[j][maxC]=ans[i++];
           
        }
    }
    public static void giveAnswer(int[][]arr,int rot,int shell){
        int[] oneD=giveArray(arr,shell);
        rotate(oneD,rot);
        fillArray(arr,shell,oneD);
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
        int rot=sc.nextInt();
        int shell=sc.nextInt();
          System.out.println("This is Original");
        display(arr1);
        giveAnswer(arr1,rot,shell);
    }
}
