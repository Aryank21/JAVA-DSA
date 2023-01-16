/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Aryan
 */
public class BuySellStock {
              public static void main(String[] args) {
int arr[]={7,8,9,3,1};
profit(arr);
          
}
public static void profit(int arr[])
{
int current_profit=0;
int max_profit=Integer.MIN_VALUE;
for(int i=0;i<arr.length-1;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]<arr[j])
{
              current_profit=arr[j]-arr[i];
}
if(current_profit>max_profit)
{
max_profit=current_profit;
}

}
}
              System.out.println(max_profit);
}
}
