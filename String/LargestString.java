/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author Aryan
 */
public class LargestString {
              public static void main(String[] args) {
                            String fruit[]={"apple","mango","banana"};
          String largest=fruit[0];
for(int i=1;i<fruit.length;i++)
{
if(largest.compareToIgnoreCase(fruit[1])<0)
{
largest=fruit[i];
}
}
                            System.out.println(largest);
              }
              
}
