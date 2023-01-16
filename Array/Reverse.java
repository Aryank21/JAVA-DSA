
package Array;
import java.util.*;

public class Reverse {
              public static void main(String[] args) {
int arr[]={1,2,3,4,5};

reverseArray(arr);
                            System.out.println(Arrays.toString(arr));
                           


                            
              }
public static void reverseArray(int arr[])
{
int i=0;
int j=arr.length-1;
while(i<=j)
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
i++;
j--;


}
 
              
}
              
}
