/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

import java.util.Arrays;

/**
 *
 * @author Aryan
 */
public class SecondLargest {

static int max=Integer.MIN_VALUE;
;
static int max2=0;

              public static void main(String[] args) {
                            int arr[] = {12 ,35 ,1 ,10, 34 ,1};
solve(arr);
                            
              }
public static void solve(int arr[])
{
//if(i==arr.length)
//{
//              System.out.println(max2);
//
//return;
//}
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max2)
{

max2=max;
max=arr[i];

}
}
              System.out.println(max);
             
           //   solve(arr, i + 1);


}
              
}
