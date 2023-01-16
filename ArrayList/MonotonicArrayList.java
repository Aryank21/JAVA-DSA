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
public class MonotonicArrayList {
              public static void main(String[] args) {
                            ArrayList<Integer> list = new ArrayList<>();
                            list.add(1);
                            list.add(2);
                            list.add(3);
                            list.add(4);
                            list.add(5);
                            list.add(6);
                            list.add(7);
                           
                            System.out.println(solve(list));

              }
public static boolean solve(ArrayList<Integer>list)
{
String check="";
for(int i=0;i<list.size()-2;i++)
{
if(list.get(i)<list.get(i+1) && list.get(i+1)>list.get(i+2))

{

return false;

}
else if(list.get(i) > list.get(i + 1) && list.get(i + 1) < list.get(i + 2))
{
return false;
}
}
return true;
}
              
}
