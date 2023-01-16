
package DivideNConquer;


public class SearchInRotatedArray {
              public static void main(String[] args) {
                            int arr[]={4,5,6,7,0,1,2};
int target=1;
int s=0,e=arr.length-1;
int flag=0;


while(s<=e)
{

     int mid = (s + e) / 2;            
//check left part of mid

if(arr[mid]==target)
{
              flag=mid;   
             
}
if(arr[s]<=arr[mid])
{
if(target<=arr[mid] && target>=arr[s])
{
e=mid-1;
}
else
s=mid+1;
}
else
{
if(target <=arr[mid] && target<=arr[e])
{
s=mid+1;
}
else
{
e=mid-1;
}


}
}

                            System.out.println("Target at index "+flag);

                           
}
                        
              
              
}

