
package recursion;


public class FirstOccrence {
              public static void main(String[] args) {
                            int arr[] = {2, 1, 4, 6};
                            System.out.println(solvefirst(arr, 0,5));

              }
public static int solvefirst(int arr[],int i,int key)
{
//base case
if(i==arr.length-1 && key!=arr[i])
{
return 0;


}
              if (key == arr[i]) {
                            return i;
              }



            return  solvefirst(arr,i+1,key);


}
}
