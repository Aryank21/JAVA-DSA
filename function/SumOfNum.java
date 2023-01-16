
package function;

public class SumOfNum {
              public static void main(String[] args) {
              int total=sum(234);
              System.out.println(total);
                            
              }
public static int sum(int a)
{
int sumn=0;
while(a>0)
{
int rem=a%10;
sumn=sumn+rem;
a=a/10;
}
return sumn;
}
              
}
