
package recursion;



public class SortedArray {
              public static void main(String[] args) {
                            int arr[]={2,5,4,5};



                            System.out.println(solvesorted(arr,0));
                            
              }
public static boolean solvesorted(int arr[],int i)
{

if(i==arr.length-1)

return true;

if( arr[i] > arr[i+1])
{
return false;
}


 
 return solvesorted(arr, i+1);

              
}
}




 







              

