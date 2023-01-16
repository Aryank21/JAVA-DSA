/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author Aryan
 */
public class Pallindrom {
              public static void main(String[] args) {
                            String s1="madam";
boolean result=fun(s1);
                            System.out.println(result);
}
public static boolean fun(String s1)
{
int i=0;
int j=s1.length()-1;
while(i<j)
{
if(s1.charAt(i)!=s1.charAt(j))
{
   return false;
}
else
{
i++;
j--;
}
}
return true;
}
              

}
