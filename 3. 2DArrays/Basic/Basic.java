//RBG --> 3D array
//video --> 4D arrays --> 1 Dimension is for time 
/*
 * 2D Array in Memory
 * two ways to store 2D array: 1. row major
 *                             2.Column major 
 ? In java 2D array is divided into individual array and then get store 
 ? They might be contiguous or not.
 */

import java.util.*;

public class basic {

    public static boolean search(int matrix[][],int key){
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.print("Found at cell ("+i+","+j+" )");
                    return true;
                } 
            }
        }
        System.out.println("key not found!");
        return false;
    }

    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        // int n = 3,m = 3;
        int n = matrix.length, m = matrix[0].length;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                matrix[i][j] =sc.nextInt();
            }
        }
        //output
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,5);
}
}
