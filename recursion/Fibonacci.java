
package recursion;


public class Fibonacci {
              public static void main(String[] args) {
int n=solvefibo(5);
                            System.out.println(n);


                            
              }
public static int solvefibo(int n){

//base case
if(n==0)
return 1;

int result=(n*solvefibo(n-1));


return result;


}
              
}
