/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

import java.util.Arrays;

/**
 *
 * @author Aryan
 */
public class Bubble_sort {
              public static void main(String[] args) {
                            int arr[]={3,4,1,2};
                            System.out.println("before sorting");
       int count=0;                     
for(int i=0;i<arr.length-1;i++)
{
              

if(arr[i]<arr[i+1])
{
int temp=arr[i];
arr[i]=arr[i+1];
arr[i+1]=temp;
              count++;
}

            

             
             
}
                            System.out.println(count);
                           
    }
              
}
