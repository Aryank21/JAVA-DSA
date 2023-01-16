/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

/**
 *
 * @author Aryan
 */
public class InterfaceExample {
              public static void main(String[] args) {
Person1 pp=new Person1();
pp.leg();
Animal1 aa=new Animal1();
aa.leg();
pp.somethingunique();
Aryan ak=new Aryan(25,"aryan");
ak.method();



                            
              }
              
}
interface  LivingThingss
{
void leg();
  void speak();
}


interface talent
{
void somethingunique();
}
 class Person1 implements LivingThingss,talent
{
public void somethingunique()
{
              System.out.println("person can invent any thing they are creative");

}
 public void speak()
{
              System.out.println("i can chat");
}
public void leg()
{
              System.out.println("two leg");

}

}
 class Animal1 implements LivingThingss {

              public void speak() {
                            System.out.println("i can't chat");
              }

              public void leg() {
                            System.out.println("four leg");

              }

}
class Aryan extends person
{
Aryan(int age,String name)
{
              super.method();
              System.out.println("age:= "+age+"Name "+ name);
}

void method()
{
              System.out.println("aryan method calling");
}

}
