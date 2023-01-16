/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package two_D_Array;

/**
 *
 * @author Aryan
 */

//(0,m-1) concept used for searching(right upper)
//if(key<cell value)
//do left
//if(key>cell_value)
//do bottom
public class Search_in_sorted_matrix {
              public static void main(String[] args) {
                            int matrix[][] = {{1, 2, 3, 4},
                             {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}};
                           // upper_right(matrix);
                            bottom_left(matrix);
              

}
//(0,m-1) concept used for searching(right upper)
//if(key<cell value)
//go left
//if(key>cell_value)
//go bottom
public static void upper_right(int [][]matrix)
{
int key=14;
int j=matrix[0].length-1;
int i=0;

while( i <= matrix.length - 1 &&j>=0)
{
              //System.out.println("searching at" + "(" + i + "," + j + ")");
if(key<matrix[i][j])
{
j--;
             // System.out.println("searching at" + "(" + i + "," + j + ")");
}
else if(key>matrix[i][j])
{
i++;
             // System.out.println("searching at" + "(" + i + "," + j + ")");
}
else if (key==matrix[i][j])
{
              System.out.println("found at"+"("+i+","+j+")");
break;
}
else
{
              System.out.println("invalid key");
break;
}


}



              }
//(n-1,0) concept used for searching(left bottom)
//if(key<cell value)
//go top
//if(key>cell_value)
//go right
              public static void bottom_left(int[][] matrix) {
                            int key = 2;
                            int i = matrix.length - 1;
                            int j = 0;

                            while (j <= matrix.length - 1 && i>= 0) {
                                          if (key < matrix[i][j]) {
                                                        i--;
                                          } else if (key > matrix[i][j]) {
                                                        j++;

                                          } else if (key == matrix[i][j]) {
                                                        System.out.println("found at" + "(" + i + "," + j + ")");
                                                        break;
                                          } else {
                                                        System.out.println("invalid key");
                                                        break;
                                          }

                            }

              }
              
}
