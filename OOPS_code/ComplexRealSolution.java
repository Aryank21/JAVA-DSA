/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPS_code;

/**
 *
 * @author Aryan
 */
public class ComplexRealSolution {
              public static void main(String[] args) {
complex c=new complex(4,5);
complex d= new complex(5,-5);
complex e=complex.add(c, d);
e.complexprint();


                            
              }
              
}
class complex
{
int real;
int img;
complex(int r,int i)
{
real=r;
img=i;
}
public static complex add(complex a, complex b)
{
return new complex((a.img+b.img),(a.real + b.real));

}
              public static complex sub(complex a, complex b) {
                            return new complex((a.img - b.img), (a.real - b.real));

              }
              public static complex multiply(complex a, complex b) {
                            return new complex((a.img - b.img), (a.real - b.real));

              }
public  void complexprint()
{
if(real==0 && img!=0)
{
              System.out.println(img+"i");
}
else if(real!=0 && img==0)
{
              System.out.println("real"+real);
}
else
{

              System.out.println(real+img+"i");
}
}

              

}
