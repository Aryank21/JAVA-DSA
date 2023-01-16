
package Sorting;


import java.util.Arrays;


public class Conting_sort {
              public static void main(String[] args) {
                           int arr[]={1,4,1,3,2,4,3,7};
int largest=Integer.MIN_VALUE;
int count=0;
for(int i=0;i<arr.length;i++)
{
 largest=Math.max(largest,arr[i]);
}
                           
int freq[]=new int[largest+1];

for(int i=0;i<freq.length;i++)
{
   freq[arr[i]]++;
}
                            
                           
int sort[]=new int [arr.length];

int j=0;
for(int i=0;i<freq.length;i++)
{
while(freq[i]>0)
{
 
sort[j]=i;
j++;
freq[i]--;

}

}
                            System.out.println(Arrays.toString(sort));
}
                          

                          
              }

             

