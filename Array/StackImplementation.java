/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Aryan
 */
public class StackImplementation {
              static int front = -1;
              static int rear = -1;

              public static void main(String[] args) {
int arr[]=new int[5];

                            push(arr,5);
                            push(arr, 4);
                            push(arr, 3);
                            push(arr, 2);
                            push(arr, 1);
           print(arr);
                            System.out.println("pop element are" + arr[rear]);
                            pop();
                            
                            System.out.println("after pop\n");
            print(arr);




                            
              }
public static void push(int arr[],int n)
{

if(front ==-1 && rear==-1)//stack is empty
{
front++;//0
rear++;//0
arr[rear]=n;

}
else
{
              rear++;
              arr[rear] = n;
              
}

             
}
public static void pop()
{
if(rear==-1 && front==-1)
{
              System.out.println("stack is empty");
}
else if(front==rear)
{
front--;

}
              
else
{
          
rear--;
}
}
public static void print(int arr[])
{
for(int i=rear;i>=0;i--)
{
              System.out.println(arr[i]);
}
}


              
}
