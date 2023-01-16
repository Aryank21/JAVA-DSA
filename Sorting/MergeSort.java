
package Sorting;

import java.util.Arrays;


public class MergeSort {
              public static void main(String[] args) {
                            int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
                            int s = 0;
                            int e = arr.length - 1;
                            solve(arr, s, e);
                            System.out.println(Arrays.toString(arr));
              }
public static void solve(int arr[],int s,int e)
{

if(s<e)
{

int mid=(s+e)/2;

//sort left part
solve(arr,s,mid);

//sort right part 
solve(arr,mid+1,e);

//merge left part and right part
merge(arr,s,e,mid);

}



}
public static void merge(int arr[],int s,int e,int mid)
{
//length of left array
int len1=mid-s+1;

//length of right array
int len2=e-mid;

//create left array
int leftarray[]=new int [len1];

//create right array
int rightarray[]=new int [len2];


//copy the value of array in left part
for(int i=0;i<len1;i++)

{
leftarray[i]=arr[s+i];
}

//copy the value of array in right part
for(int i=0;i<len2;i++)

{

rightarray[i]=arr[mid+1+i];

}


              int index1 = 0;//starting index of left array

              int index2 = 0;//starting index of right array

              int k = s;//main array index;



//check left array and right which have greater value
//and store in main array
while(index1<len1 && index2<len2)

{

if(leftarray[index1]>=rightarray[index2])//check in which array have greater value
{
arr[k]=rightarray[index2++];

}
     else{
                            arr[k] = leftarray[index1++];

              }
k++;
}
while(index1<len1)//if left part ka element abhi bhi bacha hua h
{
              arr[k++] = leftarray[index1++];
}
while(index2<len2)//if right part ka element abhi bhi bacha hua h
{
              arr[k++] = rightarray[index2++];
}






}
              
}
