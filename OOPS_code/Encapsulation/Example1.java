
package OOPS_code.Encapsulation;


import java.util.Scanner;
import static javafx.application.Platform.exit;


public class Example1 
{
public static void main(String[] args) {
              System.out.println("---*-----*-----*---");
              System.out.println("Hi,welcome to Bank !!!\n");


int password;
int start=11;

            
           

              customer cc = new customer();

              cc.AccNo = 123145;
              cc.Name = "Aryan";
              cc.setpassword("Aryan121");
              Scanner sc = new Scanner(System.in);

while(start!=0)
{
              String ch;
              System.out.println("enter choice \n 1 for edit Password \n 2 for view details \n 3 for exit\n" );
              System.out.println("--------------------------------------------------------");
              int choice = sc.nextInt();

switch(choice)
{
             
           
case 1:   // edit section
{
              System.out.println("who are you \n");
              ch=sc.next();

// Admin section to edit pwd
if(ch.equalsIgnoreCase("admin"))
{
              System.out.println("\nenter admin password");
                password=sc.nextInt();
if(password==123 )
{
              System.out.println("this is old password of "+cc.Name);
              System.out.println("Password: " + cc.Getpassword());
              System.out.println("enter new password for update");
//              cc.AccNo =sc.nextInt();
//              cc.Name = sc.nextLine();
              cc.setpassword(sc.next());
              System.out.println("password sucessfully changed\n\n");

}
else
{
              System.out.println("incorrect password");
}
}
// user section
else if(ch.equalsIgnoreCase("user"))
{
              System.out.println("you have't permission to edit deatails\n\n");

}
// else if(!ch.equalsIgnoreCase("admin") || !ch.equalsIgnoreCase("user"))
//{
//              System.out.println("invalid entry name");
//}
break;

}
case 2: //details section
{
              System.out.println("who are you");
              ch = sc.next();
              if (ch.equalsIgnoreCase("admin")) {
                            System.out.println("enter admin password");
                            password = sc.nextInt();
                            if (password == 123) {

                            System.out.println("Name"+cc.Name);
                            System.out.println("Acc_no:"+cc.AccNo);
                            System.out.println("Password: "+cc.Getpassword());
}
                            else {
                                          System.out.println("wrong password retry\n\n");
                            }

              }  else if (ch.equalsIgnoreCase("user")) {
                            System.out.println("enter user password");
                            password = sc.nextInt();
                            if (password == 121) {
                                          System.out.println("Name" + cc.Name);
                                          System.out.println("Acc_no:" + cc.AccNo);
}
else
{
              System.out.println("wrong password retry\n\n");
}


              
          }
break;
            

}
case 3:
{
start=0;
exit();
break;
}
}

}
              System.out.println("thank for visit !!!.");
 
}
              
}
// for user details
class Bank
{
String Name;
int AccNo;

}
class customer extends Bank
{
 private String password;

public void setpassword(String pwd)
{
    
this.password=pwd;

}
              public String Getpassword() {
                          return password;

              }
}


