/*
Question4:We are given a stringS ,we need to find the count of all contiguous substrings starting and ending with the same character.
Sample Input 1: S = "abcab"
Sample Output 1: 7 There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, 
 ab, b Out of the above substrings,there are 7 substrings:a,abca,b,bcab,c,aandb.So,only 7
contiguous substrings start and end with the same character. 
Sample Input 2: S = "aba" 
Sample Output 2: 4 
The substrings are a, b, a and aba.

*/



package recursion;

import java.util.Scanner;


public class SubString {
              public static void main(String[] args) {

int count=0;
                            System.out.println("enter string");
Scanner sc=new Scanner(System.in);
String str=sc.next();
String str1="";
for( int i=0;i<str.length();i++)
{
int start=i;
for(int j=i;j<str.length();j++)
{
int end=j;


   if (str.charAt(start) == str.charAt(end))
    {
            count++;
    }


for(int k=start;k<=end;k++)
{

if(str.charAt(start)==str.charAt(end))
{
          
              System.out.print(str.charAt(k));
}
              
}

             
             
              System.out.print(" ");
             
}
            
              System.out.println();
              
              
}
                            System.out.println("substring are: "+count);
}
}