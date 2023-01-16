/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

import java.util.*;

/**
 *
 * @author Aryan
 */
public class Anagram {
              public static void main(String[] args) {
String s1="ram";
String s2="arm";
                            char[] chars1 = s1.toCharArray();
                            char[] chars2= s2.toCharArray();
boolean str=fun(chars1,chars2);
                            System.out.println(str);

}

public static boolean fun(char[]s,char[]s1)
{
int n = s.length;
                            int n1 = s1.length;
                            if (n != n1) {
                                          return false;
                            }
                        Arrays.sort(s);
                            Arrays.sort(s1);
for(int i=0;i<n;i++)
{
if(s[i]!=s1[i])
{
return false;
}
}
return true;

              

}
}

           

