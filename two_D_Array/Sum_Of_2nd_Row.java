
package two_D_Array;

/**
 *
 * @author Aryan
 */
// Print out the sum of the numbers inthe second row of the “nums” array.
public class Sum_Of_2nd_Row {
              public static void main(String[] args) {

             int[][] nums = {{1,4,9},{11,4,3},{2,2,3} };  
int i=1;
int sum=0;

for(int j=0;j<nums.length;j++)
{
sum+=nums[i][j];


       
              }
                            System.out.println(sum);
              
}
}
