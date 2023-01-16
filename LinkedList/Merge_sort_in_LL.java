
package LinkedList;




/**
 *
 * @author Aryan
 */
public class Merge_sort_in_LL {
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
static Node head,temp,newnode;

              public static void main(String[] args) {
                         

                            addLast(2);
                            addLast(3);
                            addLast(5);
                            addLast(1);
                            addLast(4);
printll();
head=mergesort(head);
                           printll();
                            



 }
           public   static void printll() {
                            Node ptr = head;
                            if (head == null) {
                                          System.out.println("null head");
                            } else {
                                          while (ptr != null) {
                                                        System.out.print(ptr.data+" ");
                                                        ptr = ptr.next;
                                          }
                                          //System.out.println(ptr.data+"-> null");
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
private static Node getmid(Node head)
{
Node slow=head,fast=head.next;
              

while(fast!=null && fast.next!=null)
{
slow=slow.next;
fast=fast.next.next;
}
return slow;

}


public static Node mergesort(Node head)
{
//base
if(head==null || head.next==null)
 return head ;

//mid
Node mid=getmid(head);
Node right=mid.next;
mid.next=null;





//left
Node newleft=mergesort(head);
//right
Node newright=mergesort(right);

//merge
 return merge(newleft,newright);
}
private static Node merge(Node head1,Node head2)
{
Node newhead=new Node(-1);
Node temp2=newhead;
while(head1!=null&& head2!=null)
{
if(head1.data<=head2.data)
{
              temp2.next = head1;
              head1 = head1.next;
              temp2 = temp2.next;
}
else
{
              temp2.next = head2;
              head2 = head2.next;
              temp2=temp2.next;
}
}
while(head1!=null)
{
              temp2.next = head1;
              head2 = head1.next;
              temp2 = temp2.next;

}
              while (head2 != null) {

                            temp2.next = head2;
                            head2 = head2.next;
                            temp2=temp2.next;
}
return newhead.next;

              }
}


              

