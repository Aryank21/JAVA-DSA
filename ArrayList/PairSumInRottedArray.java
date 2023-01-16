
package ArrayList;


import java.util.ArrayList;



public class PairSumInRottedArray {
              public static void main(String[] args) {
                            int target = 6;
                            ArrayList<Integer> list = new ArrayList<>();
                            list.add(4);
                            list.add(5);
                            list.add(6);
                            list.add(7);
                            list.add(1);
                            list.add(2);
                            list.add(3);
                            
   System.out.println(solvepairsum(list, target));
              }
      public static boolean solvepairsum(ArrayList<Integer> list, int target)
{

//find pivot index

int left=0;
int right=list.size();

for(int i=1;i<list.size()-1;i++)
{
if(list.get(i)>list.get(i+1))
{

right=i;
left=i+1;
break;

}
             

}
 // System.out.println(right + " " + left);

for(int i=0;i<list.size();i++)
{
int num=list.get(left)+list.get(right);
              System.out.println(list.get(left)+" +" +list.get(right)+"="+num);
if(num==target)
return true;

if(num<target)
{
left=(left+1)%list.size();
}
else
right=(list.size()+right-1)%list.size();

}
return false;
}


}

