/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Aryan
 */

//Given an integer array nums, return true if any value 
//appears at least twice in the array, 
//and return false if every element is distinct.
public class Distinct {
              public static void main(String[] args) {
int arr[]={1,2,1,3,4};
boolean a=search(arr);
                            System.out.println(a);
                            
              }
public static boolean search(int arr[])
{
for(int i=0;i<arr.length-1;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
return true;
}
}


}
              return false;
}
              
}
