
package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;


public class LonelyNumbers {

              public static void main(String[] args) {


                            ArrayList<Integer> list = new ArrayList<>();
                            
                            list.add(10);
                            list.add(6);
                            list.add(5);
                            list.add(10);
solve(list);
  }

public static void solve(ArrayList<Integer> list) {





                            int maxvalue = Integer.MIN_VALUE;

                            for (int i = 0; i < list.size(); i++) {
                                          maxvalue = Math.max(maxvalue, list.get(i));
                            }
                           // System.out.println(maxvalue);

                            int arr[] = new int[maxvalue+1];

                            for (int i = 0; i <list.size(); i++) {
                                          arr[list.get(i)]++;
                            }
                         //   System.out.println(Arrays.toString(arr));
                            int k = 0;
                            while (k < arr.length) {
                                          if (arr[k] > 2) {
                                                        System.out.println(k);

                                          }
                                          k++;
                            }
                           
              System.out.println("border");


int i=1 ;
while(i!=list.size()-1)
{
             
if(i==1)
{
   if (list.get(i) != list.get(i - 1) - 1 || list.get(i) != list.get(i - 1) + 1)
{
                            System.out.println(list.get(i-1));

                            
}
}


else if(i>2 && i<list.size()-2)
{

 if(list.get(i) != list.get(i + 1) - 1 || list.get(i) != list.get(i + 1) + 1)
{

       System.out.println(list.get(i));

         
}
}
 else if(i==list.size()-1)
{
if(list.get(i + 1) - 1 != list.get(i) || list.get(i + 1) + 1 != list.get(i))
{
              System.out.println(list.get(i+1));
}
}
             // System.out.println(i);
i++;





           



}

}



              
}
