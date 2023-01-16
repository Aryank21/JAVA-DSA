
package recursion;

import java.util.Scanner;


public class DeleteDuplicatesInString {
              public static void main(String[] args) {
//int index=0;
System.out.println("enter string");
Scanner sc=new Scanner(System.in);
String str=sc.next();
//StringBuilder newstr=new StringBuilder();
//boolean []map=new boolean[26];

 removeDuplicates(0,str,new StringBuilder(""),new boolean[26]);
              }
public static void removeDuplicates(int index,String str,StringBuilder newstr,boolean []map)
{
//base case
if(index==str.length())
{
              System.out.println(newstr);
return;
}
//kaam
char currchar=str.charAt(index);
if (map[currchar-'a']==true)
{
              removeDuplicates(index+1, str, newstr, map);
}
else{
map[currchar-'a']=true;
              removeDuplicates(index + 1, str, newstr.append(currchar), map);

}
}
              
}
