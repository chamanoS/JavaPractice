/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrintMatrixNumbers;

/**
 *
 * @author User
 */
public class MatrixNumber {
    public static void matrix(){
        int row = 4;
        int col = 4;
        int[][] matrix = {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,3,4,5}};
        
        for(int i = 0; i<row;i++){
            for(int j = 0; j<col;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
         System.out.print("subclass ");
    }
}
