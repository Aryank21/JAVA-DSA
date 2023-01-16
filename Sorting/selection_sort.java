
package Sorting;


import java.util.Arrays;

/**
 *
 * @author Aryan
 */
public class selection_sort {
              public static void main(String[] args) {
                            int arr[] = {5, 3, 1, 2};

for(int i=0;i<arr.length-1;i++)
{
int small=i;
              int j = i+1;
while(j<arr.length)
{

if(arr[j]<arr[small])

small=j;
j++;
}

int temp=arr[small];
arr[small]=arr[i];
arr[i]=temp;





              System.out.println(Arrays.toString(arr));

}
                           
              }


              
}
