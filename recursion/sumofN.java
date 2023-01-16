/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

/**
 *
 * @author Aryan
 */
public class sumofN {
              public static void main(String[] args) {
                           int result=solvesum(5);
                            System.out.println(result);
              }
public static int solvesum(int n)
{
if(n==1)
return 1;
return (n+solvesum(n-1));
}
              
}
