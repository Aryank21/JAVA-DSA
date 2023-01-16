/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package two_D_Array;

import java.lang.reflect.Array;

/**
 *
 * @author Aryan
 */
public class Transpose {
              public static void main(String[] args) {
                         int arr [][]={{1,2,3},{4,5,6}};
int arr1[][] = new int[3][2];

 for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[0].length;j++)
{
arr1[j][i]=arr[i][j];

}

}  
                            for (int i = 0; i < arr1.length; i++) {
                                          for (int j = 0; j < arr1[0].length; j++) {
                                                        System.out.print(arr1[i][j]);

                                          }
                                          System.out.println("");

                            } 
                                        
              }
              
}
