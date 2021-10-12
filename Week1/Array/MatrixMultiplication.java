package Week1.Array;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;
public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //creating first matrix 
        System.out.println("Enter rows and colums for first matrix");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int[][] matrix1 = new int[row1][col1];

        //input from user
        System.out.println("Enter elements in first matrix: ");
        for(int row=0; row<row1; row++){
            for(int col=0; col<col1; col++){
                matrix1[row][col]= sc.nextInt();
            }
        }

        //printing first matrix
        System.out.println("First matrix is: ");
        for(int[] a: matrix1){
            for(int e :a){
                System.out.print(e+" ");
            }
            System.out.println();
        }

        //creating second matrix
        System.out.println("Enter rows and colums for second matrix");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] matrix2 = new int[row2][col2];

        //input from user
        System.out.println("Enter elements in Second matrix: ");
        for(int row=0; row<row2; row++){
            for(int col=0; col<col2; col++){
                matrix2[row][col]= sc.nextInt();
            }
        }

         //printing second matrix
         System.out.println("First matrix is: ");
         for(int[] a: matrix2){
            for(int e :a){
                System.out.print(e+" ");
            }
            System.out.println();
        }

        // multiplication ( row1 x col1 ) x ( row2 x col2 )
        int[][] result = new int[row1][col2];
        if(col1 != row2){
            System.out.println("Matrices can't be multiplied: ");
        }
        else{
            for(int row=0; row<row1; row++){
                for(int col=0; col<col2; col++){
                    for(int k=0; k<col2; k++){
                        result[row][col] = result[row][col]+ matrix1[row][k]*matrix2[k][col];
                    }
                }
            }
        }

        // printing resultant matrix
        for(int[] a: result){
            for(int e: a){
                System.out.print(e+" ");
            }
            System.out.println();
        }

    }
}
