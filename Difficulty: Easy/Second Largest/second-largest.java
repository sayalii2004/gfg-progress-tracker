class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest =Integer.MIN_VALUE;
        int second =Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                second = largest;
                largest = arr[i];
            }
            else if(arr[i]>second && arr[i]!=largest)
            {
                second = arr[i];
            }
        }
        return (second == Integer.MIN_VALUE)?-1:second;
        
    }
}