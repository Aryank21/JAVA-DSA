/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Aryan
 */
public class OddEvenLinkedList {


           

             static class Node {

                            int data;
                            Node next;

                            Node(int data) {
                                          this.data = data;
                                          this.next = null;
                            }
              }
              static Node head, temp;

              public static void main(String[] args) {

                            addLast(1);
                            addLast(2);
                            addLast(3);
                            addLast(4);
                            addLast(5);
                           
Node prt=solve(head);
                            System.out.println(prt.data);
                            printll(prt);

              }

              public static void printll(Node prt) {
                            Node ptr = head;
                            if (head == null) {
                                          System.out.println("null head");
                            } else {
                                          while (ptr != null) {
                                                        System.out.print(ptr.data + " ");
                                                        ptr = ptr.next;
                                          }
                                          System.out.println("");
                            }
              }

              public static void addLast(int data) {

                            Node newnode = new Node(data);

                            if (head == null) {
                                          head = newnode;
                                          temp = newnode;
                                          temp.next = null;
                            } else {

                                          temp.next = newnode;
                                          temp = newnode;
                                          temp.next = null;
                            }
              }
 static Node solve(Node head)
{
Node curr=head,newhead=null;

while(curr!=null)
{
     Node temp1 = curr;
while(temp1!=null)
{
if(temp1.data%2==0 && curr.data<=temp1.data)
{
  newhead=temp1;
newhead=newhead.next;

}
temp1=temp1.next;
}
curr=curr.next;

}
return newhead;
}


              
}
