
package Collection.Linked_list;


public class DetectCycle {
              
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

                            addlast(1);
                            addlast(2);
                            addlast(3);
                            addlast(4);
                            addlast(5);
                            print();

cycle(head);
dtctcycle(head);
              }
              

public static void addlast(int data)
{
Node newnode=new Node(data);

if(head==null)
{
head=newnode;
temp=newnode;
temp.next=null;
}
else
{

temp.next=newnode;
temp=newnode;
temp.next=null;
}



}
public static void print()
{
Node ptr=head;
while(ptr!=null)
{
  System.out.print(ptr.data+" ");
   ptr=ptr.next;

}
}
public static void cycle(Node head)
{
//floyd's Algorithm
Node check=head;
while(check.next!=null)
{
check=check.next;
}
//midpoint
Node slow=head,fast=head.next;
while(fast!=null&& fast.next!=null)
{
              slow = slow.next;
fast=fast.next.next;


}
check.next=slow;
              System.out.println(slow.data);



}

public static void dtctcycle(Node head)
{
Node slow=head,fast=head;
              while (fast!=slow) {
                            slow = slow.next;
                            fast = fast.next.next;

              }
if(fast==slow)
{
              System.out.println("cycle detected");
}
else
                            System.out.println("sorry cycle not found");

}
}
