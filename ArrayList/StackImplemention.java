
package ArrayList;

import java.util.ArrayList;


public class StackImplemention {

             static ArrayList<Integer> list = new ArrayList<>();

              public static void main(String[] args) {

                            push(2);
                            push(3);
                            push(4);
                            push(6);
                            push(7);
                            System.out.println(list);
                             pop();
                            System.out.println(list);


                           

              }

public static void pop()
{
if(list.isEmpty())
                            System.out.println("-1");
else
{
   int top=list.get(list.size()-1);
   list.remove(list.size() - 1);
              System.out.println("pop Element: "+top);
}

}

public static void push(int n)
{
list.add(n);
}
 


              
}
