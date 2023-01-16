
package recursion;


public class Addprevthree {
              public static void main(String[] args) {

int result=solveprev(6,1,2,3); 
                            System.out.println(result);
                            
              }
public static int solveprev(int n,int a,int b,int c)
{
        
//base case 
if(n==4)
return a+b+c;

if(n==3)
return c;

if(n==2)
return b;

if(n==1)
return a;

int s=solveprev(n-1,a,b,c)+solveprev(n - 2, a, b, c) +solveprev(n - 3, a, b, c) ;
return s;

}
}

 


              

