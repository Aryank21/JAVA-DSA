/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

/**
 *
 * @author Aryan
 */
public class SayWord {
              public static void main(String[] args) {
                            String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
int n=1992;
convert(n,arr);
              }
public static void convert(int n,String []arr)
{
if(n==0)
return;

int digit=n%10;



convert(n/10,arr);
              System.out.print(arr[digit]+" ");


}
              
}
