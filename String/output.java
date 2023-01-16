
package String;

//Question 2 :What will be the output of the following code?
public class output {
              public static void main(String[] args) {

                            String str =new String( "Aryan kumar");
                            String str1 = str.intern();
                           String str3="Aryan kumar";
                            
                            System.out.println(str==str1);
                            System.out.println(str1 == str3);

                           


              
}
}
