
package recursion;


public class LastOccurence {
              public static void main(String[] args) {
                          
                            int arr[] = {2, 1, 2, 1};


int get=solvelast(arr, 0, 2);
                            System.out.println(get);

              }

              public static int solvelast(int arr[], int i, int key) {

//base case

                            if (i == arr.length) {
                                          return -1;

                            }
int found=solvelast( arr, i+1, key);

if(found==-1 && arr[i] == key)

return i;


              
return found;
                            

              }
              
}
