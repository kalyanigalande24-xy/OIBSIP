class Solution {
    public static int search(int arr[], int x) {
        // code here
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                return i;
            }
        }
        return -1;
        
    }
     public static void main(String args[])
     {
         int arr[]={1,2,3,4,5};
         int x=3;
         int index = search(arr,x);
         if(index==-1)
         {
             System.out.println("Not Found:");
             
         }
         else{
             System.out.println("x is at index:"+index);
         }
     }
}
