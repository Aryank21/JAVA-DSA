/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

/**
 *
 * @author Aryan
 */

public class Friend_pairing {
              public static void main(String[] args) {

                            System.out.println(pairing(3)); 
              }
public static int pairing(int n)
              {
if(n==1 || n==2)
{
return n;

}

int single=pairing(n-1);//single

int pair=pairing(n-2);//pairing
int pairWays=(n-1)*pair;

int totalWays=single+pairWays;
return totalWays;





}
}
