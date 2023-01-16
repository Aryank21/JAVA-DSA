/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maths;

import java.util.Scanner;
public class TotalCostGst {
              public static void main(String[] args) {
                     float pencil,pen,eraser,total,net,gst;
                            System.out.println("enter value of pencil,pen,eraser"); 
Scanner sc=new Scanner(System.in); 
pencil=sc.nextFloat();
pen=sc.nextFloat();
eraser=sc.nextFloat();
net=(pencil+pen+eraser);
gst=net*18/100;
total=net+gst;
                            System.out.println(total);

     
              }
              
}
