/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package two_D_Array;

/**
 *
 * @author Aryan
 */
public class DigonalSum {
              public static void main(String[] args) {
                            int matrix[][] = {{1, 2, 3, 4},
                                              {5, 6, 7, 8}, 
                                             {9, 10, 11, 12}, 
                                             {13, 14, 15, 16}};
int left_sum=0;
int right_sum=0;

 for(int i=0;i<matrix.length;i++)
{
for(int j=0;j<matrix[0].length;j++)
{
              if (i == j){
left_sum+=matrix[i][j];
}
              if (i + j == matrix.length - 1) {
                            right_sum += matrix[i][j];
              }

}
}
                            System.out.println("left sum:"+left_sum);

                           
                            System.out.println("right_sum"+right_sum);
     }
}
