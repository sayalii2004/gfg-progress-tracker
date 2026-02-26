class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int count=1;
        int max=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            max = Math.max(count, max);
        }
        return max;   
    }
}
