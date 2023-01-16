/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template


Given an array of integers. Find the Inversion Count in the array.
Inversion Count:For an array,inversion count indicate show far(or close)
the array is from being sorted.
If the array is already sorted then the inversion countis 0.
If an array is sorted in the reverse order then the inversion count is the maximum.Formally, 
two elements a[i] and a[j] form an inversion 
if a[i] > a[j] and i < j.
Sample Input 
1: N = 5, arr[ ] = {2, 4, 1, 3, 5}
Sample Output 1: 3, because it has 3 inversions -(2, 1), (4, 1), (4, 3).

Sample Input 2: N = 5, arr[ ] = {2, 3, 4, 5, 6}
Sample Output 2: 0, because the array is already sorted Sample .
Input 3: N = 3, arr[] = {5, 5, 5}
Sample Output3:0,because all the elements of the array are the same & already in a sorted manner.

 */
package DivideNConquer;

import java.util.Arrays;

/**
 *
 * @author Aryan
 */
public class MajorityElementInAray {
              public static void main(String[] args) {
                            int arr[]={3,3,4,5};
int max=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{
max=Math.max(max, arr[i]);
}
                           
int countarray[]=new int[max+1];
//int count=0;
for(int i=0;i<arr.length;i++)
{

countarray[arr[i]]++;

}
                            System.out.println(Arrays.toString(countarray));
int maxval=countarray[0];
int maxvalindex=-1;

for(int i=1;i<countarray.length;i++)

{
if(countarray[i]>maxval)
{
maxval=countarray[i];
maxvalindex=i;

}
}
                            System.out.println("majority element is: "+maxvalindex);
                           

}
              }
              

