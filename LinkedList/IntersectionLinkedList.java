
package LinkedList;


public class IntersectionLinkedList {
static class Node{
int data;
Node next;
Node(int data)
{
this.data=data;
this.next=null;
}

}
static Node head1,head2;
              public static void main(String[] args) {


head1=new Node(1);

head2=new Node(3);

                            Node newnode = new Node(4);
                            head1.next = newnode;

                             newnode = new Node(5);
                              head2.next=newnode;

                             newnode = new Node(6);
                            head1.next.next = newnode;
                            head2.next.next = newnode;

                            newnode = new Node(7);
                            head1.next.next.next=newnode;

                            head1.next.next.next.next=null;
                    print();

               int get=findintersection(head1,head2);
                            System.out.println(get);






                            
 }
              public static void print() {
                            Node ptr = head1;
                            
// from begining
                            while (ptr != null) {
                                          System.out.print(ptr.data + " ");
                                          ptr = ptr.next;

                            }
                            System.out.println(" ");
}
public static int findintersection(Node head1,Node head2)
{
Node temp=head1;
Node temp2=head2;
int get=-1;
while(temp!=null && temp2!=null)
{
if(temp.data==temp2.data)
{
get=temp.data;
}
temp=temp.next;
temp2=temp2.next;

}

return get;
}

              
}
