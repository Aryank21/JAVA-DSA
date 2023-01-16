/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

/**
 *
 * @author Aryan
 */
public class Example {
              public static void main(String[] args) {
Person pp=new Person();
pp.talk();


                            
              }
              
}
abstract class LivingThings
{
public void talk()//non abstract method
{
              System.out.println("i can talk ,Abstrct class ");
}
abstract void walk();//abstract method
}
class Animal extends LivingThings
{
void walk()
{
              System.out.println("i am Animal class,i can run faster then human");
}
public void talk()
{
              System.out.println("i can't able to talk like human");

}

}
class Person extends LivingThings
{
void walk()
{
              System.out.println("i am human class,i can walk");
}
//public void talk()
//{
//              System.out.println("i can talk better than Animal");
//
//}
}

