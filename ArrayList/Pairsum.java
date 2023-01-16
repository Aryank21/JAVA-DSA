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
public class Pairsum {
              public static void main(String[] args) {

int target=6;
                            ArrayList<Integer> list = new ArrayList<>();
                            list.add(1);
                            list.add(2);
                            list.add(3);
                            list.add(4);
                            list.add(5);
                            list.add(6);
                            list.add(7);
                            System.out.println(solvepairsum(list, target));

              }
public static boolean solvepairsum(ArrayList<Integer> list,int target)
{
int lt=0;
int rt=list.size()-1;
while(lt<rt)
{
int num=list.get(rt)+list.get(lt);
if(num==target)
{
return true;
}
if(num<target)
{
lt++;
}
else
{
rt--;
}
}
return false;
}
              
}
