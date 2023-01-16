
package LinkedList;


public class DoubleLL {

static class Node
{
int data;
Node next;
Node prev;
Node(int data)
{
this.data=data;
this.prev=null;
this.next=null;
}
}
static Node head,temp;
static int size=0;
              public static void main(String[] args) {
                            addlast(1);
                          addlast(2);
addlast(3);
addfirst(0);
                            removelast();
                            removefirst();
print();
                            
              }
              public static void addlast(int value)
{
Node newnode=new Node(value);

if(head==null)
{
newnode.next=null;
newnode.prev=null;
head=newnode;
temp=newnode;
size++;


}
else
{


temp.next=newnode;
newnode.prev=temp;
temp=newnode;
newnode.next=null;
              size++;

}



}
public static void addfirst(int value)
{
Node newnode=new Node(value);
if(head==null)
{
              newnode.next = null;
              newnode.prev = null;
              head = newnode;
              temp = newnode;
              size++;
}
else
{
newnode.next=head;
head.prev=newnode;
head=newnode;
              size++;
}


}
public static void removelast()
{
Node lastnode=head;
Node prev=head;
if(head==null)
{
              System.out.println("list is empty");
}
if(head.next==null)
{
head=null;

}
while(lastnode.next!=null)
{
prev=lastnode;
lastnode=lastnode.next;

}
prev.next=null;
 size--;

}
public static void removefirst()
{
Node firstnode=head;
head=head.next;
firstnode=null;


}
public static void print()
{
Node ptr=head;
Node ptr1=temp;
// from begining
while(ptr!=null)
{
              System.out.print(ptr.data+ "<->");
ptr=ptr.next;

}
              System.out.println("null");     
//from last
//while (ptr1 != null) {
//                            System.out.print(ptr1.data+ "<-> ");
//                            ptr1 = ptr1.prev;
//
//              }
//              System.out.println("null");

}
public static void reversedl()
{
}

}
