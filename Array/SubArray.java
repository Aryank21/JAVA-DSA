
package Array;


public class SubArray {
              public static void main(String[] args) {
int arr[]={-1,2,3,4,-5};
//subArrays1(arr);
//maxsubArraysum(arr);
kadane(arr);
                            
              }
//Brute force method to find sub array
public static void subArrays1(int arr[])
{
for(int i=0;i<arr.length;i++)
{
int start=i;
for(int j=i;j<arr.length;j++)
{
int end=j;
for(int k=start;k<=end;k++)
{
              System.out.print(arr[k]+"");
}
              System.out.println();
}
              System.out.println();
}


}
//maximum sub array(Brute force)
public static void maxsubArraysum(int arr[]){
int current=0;
int max=Integer.MIN_VALUE;


              for (int i = 0; i < arr.length; i++) {
                            int start = i;
                            for (int j = i; j < arr.length; j++) {
                                          int end = j;
                                           current=0;
                                          for (int k = start; k <= end; k++) {
                                                        current+=arr[k];
                                                       

                                          }
                                          System.out.println(current);
                                          if (current > max) {
                                                        max = current;
                                          }
                                         
                            }
                           
                            
              }
              System.out.println("max: " + max);


}
//maximum subArray using kadane
public static void kadane(int arr[])
{
int current =0;
int max=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{

current+=arr[i];

if(current<0)

current=0;

if(current>max)

max=current;



}
              System.out.println("max sum of sub array"+max);

}

              
}
