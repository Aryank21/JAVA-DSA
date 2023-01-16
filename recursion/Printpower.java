/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

/**
 *
 * @author Aryan
 */
public class Printpower {
              public static void main(String[] args) {
                            System.out.println(print(2,3));

              }
public static int print(int base,int power)
{
if(power==0)
return 1;

if(power==1)
return base;

int ans=print(base,power/2);

if(power%2==0)
{
return ans*ans;
}
else
{
 return base*ans * ans;
}


//return base*print(base,(power-1));

}

              
}
