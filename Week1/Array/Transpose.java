package Week1.Array;

import java.util.Scanner;

import org.graalvm.compiler.phases.common.util.TracingNodeEventListener;

public class Transpose {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter no. of columns: ");
        int col = sc.nextInt();

        int original[][] = new int[row][col];
        System.out.println("Enter elements of the original matrix: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                original[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        // before transpose 
        for(int[] a: original){
            for(int e: a){
                System.out.print(e+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // tranpose of matrix
        int row1 = col;
        int col1 = row;
        
        int[][] transpose = new int[row1][col1];

        for(int i=0; i<row1; i++){
            for(int j=0; j<col1; j++){
                transpose[i][j]=original[j][i];
            }
        }

        //printing matrix after transpose
        for(int[] a: transpose){
            for(int e: a){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
