/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

/**
 *
 * @author Aryan
 */
public class TileProblem {
              public static void main(String[] args) {
                            System.out.println(setTile(3));
                           
              }
public static int setTile(int n)
{
if(n==0 || n==1 )
return 1;

int vertical=setTile(n-1);

int horizontal=setTile(n-2);

int ways= vertical+horizontal;
return ways;
}
}
