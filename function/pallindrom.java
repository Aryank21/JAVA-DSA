package function;
public class pallindrom {
public static boolean isPallindrom(int n)
{
int actual=n;
int sum=0;
while(n>0)
{
int rem=n%10;
sum=rem+(sum*10);
n=n/10;
}
if(actual==sum)
      
return true;
else
return false;
}
              public static void main(String[] args) {
                            System.out.println(isPallindrom(121));
    
                            
              }
              
}
