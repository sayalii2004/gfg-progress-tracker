class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int maxsum=0;
        for(int i=0; i<k;i++)
        {
            maxsum = maxsum +arr[i];
        }
        int current = maxsum;
        for(int i=1; i<=arr.length-k;i++)
        {
            current = current-arr[i-1]+arr[i+k-1];
            if(current>maxsum)
            {
                maxsum = current;
            }
        }
        return maxsum;
    }
}