
package recursion;

import java.util.Arrays;


//all occurence find karna hai jahan jahan pe mera key value match ho rha hai
public class AllOcurrenceOfKey {
              public static void main(String[] args) {
                            int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2;
solve(arr,0,key);

              }
public static void solve(int []arr,int i,int key)
{

if(i==arr.length)
{
   
return;

}



if(arr[i]==key)
{
              System.out.print(i+" ");
             

}

                            solve(arr, i + 1, key);



}
              
}
