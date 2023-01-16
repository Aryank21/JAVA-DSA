/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Aryan
 */
public class MnodesNnodes {
static class Node
{
int data;
Node next;
Node(int data)
{
this.data=data;
this.next=null;
}
}
static Node head,temp;

              public static void main(String[] args) {

                           
                            
                            
                            addLast(1);
                            addLast(2);
                            addLast(3);
                            addLast(4);
                            addLast(5);
                           

                            printll();
MNnodes(2,2,head);
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
 static void MNnodes(int m,int n,Node head)
{
Node temp1,curr=head;
              


while(curr!=null  )
{
int M=m;//2
int N=n;//2
             
while(M>1)
{
curr=curr.next;
M--;
}

              if (curr == null)
                            return;
temp1=curr.next;

while( N>1)
{
              if (temp1 == null)
{
              curr.next=temp1;
              return;
}
                           
temp1=temp1.next;
N--;
}
 curr.next=temp1.next;  
curr=temp1.next;          






}

}

              
}
