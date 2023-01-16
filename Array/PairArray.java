/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Aryan
 */
public class PairArray {
              public static void main(String[] args) {
int arr[]={1,2,3,4,5};
                            pair(arr);
              }
public static void pair(int arr[])
{
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
              System.out.print("("+arr[i]+","+arr[j]+")");
}
              System.out.println();
}

}

              
}
