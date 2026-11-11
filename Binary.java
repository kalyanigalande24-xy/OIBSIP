class Binary {
    public static int binarySearch(int[] arr, int k) {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==k)
            {
                return mid;
            }
            if(arr[mid]<k)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return-1;
        
    }
     public static void main(String args[]){
         int arr[]={1,2,3,4,5,6};
         int k=6;
         System.out.println("index for k is:"+binarySearch(arr,k));
         
     }
        
    
}
