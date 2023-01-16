
package String;

//Question1:Count how many times lower case vowels 

import java.awt.BorderLayout;
import java.util.Scanner;

//occurred in a String entered by the 
//user.

public class CountLowerCaseVowels {
              public static void main(String[] args) {
                            System.out.println("enter text to find number\nof vowels");
String sc=new Scanner(System.in).next();

int count=0;
for(int i=0;i<sc.length();i++)
{
char ch=sc.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
count++;

}
             
}
                            System.out.println("vowel are" + count);




                            
              }

              
}
