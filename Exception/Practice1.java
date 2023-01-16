
package Exception;

import java.util.Scanner;


public class Practice1 {
              
              public static void main(String[] args) {
                            
Scanner sc=new Scanner(System.in);

                         int    a ;
                          int   b ;
 
try
{

              a = sc.nextInt();
              b = sc.nextInt();
     System.out.println(a / b);
  
}
catch(Exception e)
{
              System.out.println("sahi se divide kar");
}
finally
{
              System.out.println("finally block");
}

                           
          
                 System.out.println("rest of code");
                            
              }
}
