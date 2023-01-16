/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author Aryan
 */
public class ShortestPath {
              public static void main(String[] args) {
                            String s="WNEENESENNN";
int n=s.length();
int x=0,y=0;
for(int i=0;i<n;i++)
{
              if (s.charAt(i) == 'W') {
                            x--;
              }
              if (s.charAt(i) == 'E') {
                            x++;
              }
              if (s.charAt(i) == 'N') {
                            y++;
              }
              if (s.charAt(i) == 'S') {
                            y--;
              }
                            
}
int x2=x*x;
int y2=y*y;
int result=(int)Math.sqrt(x2+y2);
                            System.out.println(result);



}

}
              

