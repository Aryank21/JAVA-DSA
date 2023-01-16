
package Sorting;


import java.util.Arrays;

/**
 *
 * @author Aryan
 */
public class QuickSort {
              public static void main(String[] args) {
                            int arr[] = { 1, 3, 2, 4, 3, 7};
                            int s = 0;
                            int e = arr.length;
                            solve(arr, s, e);
                            System.out.println(Arrays.toString(arr));
              }
public static void solve(int arr[],int s,int e)
{
//base case
if(s<=e)
{
              int p = partition(arr, s, e);

              solve(arr, s, p - 1);
              solve(arr, p + 1, e);

}





}
public static int partition(int arr[],int s,int e)
{

int pivot=arr[s];
int count=0;


for(int i=s+1;i<e;i++)

{
  if(arr[i]<=pivot)
{
count++;

}
}
              System.out.println(count); 
int pivotindex=s+count;

//swaping piviot 

arr[s]=arr[pivotindex];
arr[pivotindex]=pivot;

//check and swap the elements
int i=s,j=e;

while(i<pivotindex && j>pivotindex)
{
   while(arr[i]<= pivot)
      {
i++;

}
while(arr[j]>=pivot)
{
j--;
}



}
              if (i < pivotindex && j > pivotindex) {
                            int temp1 = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp1;
                            i++;
                            j--;
              }

return pivotindex;
}
              
}
