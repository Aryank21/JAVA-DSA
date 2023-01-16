/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Aryan
 */
public class SwappingNOdes {


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
                            printll();
swap(2,4,head);
                            printll();

              }

              public static void printll() {
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
public static void swap(int x,int y,Node head)
{

Node curr=head;
Node currprev=head,curr2prev=head;
Node curr2=head;
while(curr!=null && curr2!=null)
{
int m=x;//2
int n=y;//4
while(m>1)
{
currprev=curr;
curr=curr.next;
m--;
}

              while (n > 1) {
                            curr2prev=curr2;
                            curr2 = curr2.next;
                            n--;
              }

Node temp1=curr2.next;
currprev.next=curr2;
curr2.next=curr2prev;
curr2prev=curr;
curr.next=temp;

}


}
              
}
