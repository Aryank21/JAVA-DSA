
package String;

/**
 *
 * @author Aryan
 */
public class StringCompression {
              public static void main(String[] args) {
                            String s1 = "abc";
                            String st = "";

                            
                            for (int i = 0; i < s1.length(); i++) {
                                          
                                          Integer count = 1;
                                          while (i<s1.length()-1 && s1.charAt(i+1) ==s1.charAt(i)) {
                                                        count++;
                                                         i++;

                                          }
                                         
if(count==1)
{
              st += s1.charAt(i);
}
else
{
              st += s1.charAt(i) + count.toString();
}


                                

                            }
                            System.out.println(st);
                            
              }


              
}
