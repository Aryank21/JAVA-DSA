
package String;

import java.util.Scanner;

/**
 *
 * @author Aryan
 */
public class RotationOfString {
              public static void main(String[] args) {
                            System.out.println("enter string");
Scanner sc=new Scanner(System.in);
                            String str1=sc.next();
String str2="";
for(int i=str1.length()/2;i<str1.length();i++)
{
str2+=str1.charAt(i);
}
for(int i=0;i<str1.length()/2;i++)
{
str2+=str1.charAt(i);
}
                            System.out.println(str2);

              }
}
