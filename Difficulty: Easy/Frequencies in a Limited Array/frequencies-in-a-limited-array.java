class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList <Integer> res = new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            res.add(0);
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=1 && arr[i]<=n)
            {
                int idx= arr[i]-1;
                res.set(idx,res.get(idx)+1);
            }
        }
        return res;
    }
}
