/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPS_code;

/**
 *
 * @author Aryan
 */
public class Access_Modifier {
              public static void main(String[] args) {
circle ss=new circle();
ss.print();
                            
              }
              
}
class Shape
{
protected void print()
{
System.out.println("base class run");

}
}
class circle extends Shape
{
 protected void print(){
              System.out.println("derived class run");

}
              private void print1() {
                            System.out.println("derived class run");

              }
}
