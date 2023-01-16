
package DivideNConquer;

import java.lang.reflect.Array;
import java.util.Arrays;


public class MergeSortInString {
              public static void main(String[] args) {
                            String arr[] = {"sun", "earth", "mars", "mercury"};
int s=0,e=arr.length-1;
solve(arr,s,e);
                            System.out.println(Arrays.toString(arr));

              }
public static void solve(String arr[],int s,int e)
{
if(s<e)
{
int mid=(s+e)/2;
solve(arr,s,mid);
solve(arr,mid+1,e);
merge(arr,s,e,mid);
}
             


}
public static void merge(String arr[],int s,int e,int mid)
{
int len1=mid-s+1;
int len2=e-mid;

String leftarray[]=new String[len1];
String rightarray[]=new String[len2];

for(int i=0;i<len1;i++)
{
leftarray[i]=arr[s+i];

}
for(int i=0;i<len2;i++)
{
rightarray[i]=arr[mid+1+i];
}

int index1=0;
int index2=0;
int k=s;

while(index1<len1 && index2<len2)
{
if(IsAlphabeticallySmaller(leftarray[index1],rightarray[index2]))
{
arr[k]=leftarray[index1++];
}

 

else
{
arr[k]=rightarray[index2++];
}
k++;


}
while(index1 < len1)
{
              arr[k++] = leftarray[index1++];

}

while(index2 < len2)
{
              arr[k++] = rightarray[index2++];
}
}

public static boolean IsAlphabeticallySmaller(String leftarray,String rightarray)
{
if(leftarray.compareToIgnoreCase(rightarray)<0)
{
return true;

}
else
{
return false;
}
              
}
}
