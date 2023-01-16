
package Array;


public class Taraping_water {
              public static void main(String[] args) {
int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
fun(height);
                            
              }
public static void fun(int height[]){
int n=height.length;
int trapwater=0;
int left_height[]=new int[height.length];
left_height[0]=height[0];
for(int i=1;i<height.length;i++)
{
left_height[i]=Math.max(height[i],left_height[i-1]);
}
              int right_height[] = new int[n];
right_height[n-1]=height[n-1];
              for (int i =n-2 ; i >=0; i--) {
                            right_height[i] = Math.max(height[i], right_height[i + 1]);
              }
for(int i=0;i<n;i++)
{
int waterLevel=Math.min(right_height[i], left_height[i]);
trapwater+=waterLevel-height[i];
}

              System.out.println(trapwater);

}
              
}
