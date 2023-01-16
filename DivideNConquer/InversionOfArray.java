/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DivideNConquer;

import java.util.Arrays;

/**
 *
 * Given an array of integers. Find the Inversion Count in the array. Inversion
 * Count:For an array,inversion count indicate show far(or close) the array is
 * from being sorted. If the array is already sorted then the inversion count is
 * 0. If an array is sorted in the reverse order then the inversion count is the
 * maximum.Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j]
 * and i < j. Sample Input 1: N = 5, arr[ ] = {2, 4, 1, 3, 5} Sample Output 1:
 * 3, because it has 3 inversions -(2, 1), (4, 1), (4, 3).
 *
 * Sample Input 2: N = 5, arr[ ] = {2, 3, 4, 5, 6} Sample Output 2: 0, because
 * the array is already sorted Sample . Input 3: N = 3, arr[] = {5, 5, 5} Sample
 * Output3:0,because all the elements of the array are the same & already in a
 * sorted manner.
 */
public class InversionOfArray {

              static int count = 0;
              public static void main(String[] args) {
 
                            int arr[] = {3,3,4,5,6};
//                            int s = 0;
                            int e = arr.length - 1;

                            solve(arr,e);
                            System.out.println(Arrays.toString(arr));
                            System.out.println(count);
              }

              public static void solve(int arr[], int n) {
if(n==0)
{
return ;
}
for(int i=0;i<n;i++)
{
if(arr[i]>arr[i+1])
{
              int a = arr[i];
              arr[i] = arr[i + 1];
              arr[i + 1] = a;
count++;
}
}
solve(arr,n-1);

                            

              }
              
}
