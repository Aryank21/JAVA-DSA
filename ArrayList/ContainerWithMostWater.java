/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Aryan
 */
public class ContainerWithMostWater {

              public static void main(String[] args) {

                            ArrayList<Integer> list=new ArrayList<>();
                            list.add(1);
                            list.add(8);
                            list.add(6);
                            list.add(2);
                            list.add(5);
                            list.add(4);
                            list.add(8);
                            list.add(3);
                            list.add(7);
int maxWaterlabel=solve(list);

                            System.out.println("Maximum water contains is : "+maxWaterlabel +"lt");


}

/*   Brute force approch  */


//public static int solve(ArrayList<Integer> list)
//
//{
//int maxWater=0;
//for(int i=0;i<list.size();i++)
//{
//for(int j=i+1;j<list.size();j++)
//{
//int height=Math.min(list.get(i), list.get(j));
//int width=j-i;
//int currentWater=height*width;
//maxWater=Math.max(maxWater,currentWater);
//
//}
//}
//return maxWater;
//
//
//
// }






// two pointer approach


              public static int solve(ArrayList<Integer> list) {
                            int maxWater = 0;
int lf=0;
int rt=list.size()-1;
                            while(lf<rt) {
                                         
                                                        int height = Math.min(list.get(lf), list.get(rt));
                                                        int width = rt - lf;
                                                        int currentWater = height * width;
                                                        maxWater = Math.max(maxWater, currentWater);
//update pointer
if(list.get(rt)<list.get(lf))
{
   rt--;
}
else
{
lf++;
}
                                          }
                            
                            return maxWater;

              }
              
}
