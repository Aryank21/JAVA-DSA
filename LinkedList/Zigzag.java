/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Aryan
 */
public class Zigzag {


              static class Node {

                            int data;
                            Node next;

                            Node(int data) {
                                          this.data = data;
                                          this.next = null;
                            }
              }
static Node head,temp,newnode;

              public static void main(String[] args) {

                            addLast(2);
                            addLast(3);
                            addLast(5);
                            addLast(4);
                            addLast(1);
                            Zizagfun();
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

              public static Node getmid(Node head) {
                            Node slow = head, fast = head.next;

                            while (fast != null && fast.next != null) {
                                          slow = slow.next;
                                          fast = fast.next.next;
                            }

                            return slow;

              }

              public static Node reversehalf() {
                            Node mid = getmid(head);

                            Node prev = null;
                            Node curr = mid, nextnode = mid;

                            while (nextnode != null) {
                                          nextnode = nextnode.next;
                                          curr.next = prev;
                                          prev = curr;
                                          curr = nextnode;

                            }

                            return prev;
              }
public static void Zizagfun()
{
Node right=reversehalf();
Node left=head;

Node rightnext=null,leftnext=null;
while(left!=null && right!=null)
{
leftnext=left.next;
              left.next = right;
rightnext=right.next;
              right.next = leftnext;

right=rightnext;
left=leftnext;

}



}
}

