/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package two_D_Array;

/**
 *
 * @author Aryan
 */

public class Spiral_Matrix {
              public static void main(String[] args) {
int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
                         spiral(matrix);   
              }
public static void spiral(int matrix[][])
{
int start_row=0;
int start_col=0;
int end_row=matrix.length-1;
int end_col=matrix[0].length-1;
while(start_row<=end_row && start_col<=end_col)
{
//top row
for(int j=start_col;j<end_col;j++)
{
              System.out.println(matrix[start_row][j]+" ");
}
//right column
for(int i=start_row+1;i<=end_row;i++)
{
              System.out.println(matrix[i][end_col]+" ");

}
//bottom row
for(int j=end_col-1;j>=start_col;j--)
{
              System.out.println(matrix[end_row][j]+" ");
}
//left column
for(int i=end_row-1;i>=start_row+1;i--)
{
              System.out.println(matrix[i][start_col]);
}
start_row++;
start_col++;
end_row--;
end_col--;
}
              System.out.println("");
}

              
}
