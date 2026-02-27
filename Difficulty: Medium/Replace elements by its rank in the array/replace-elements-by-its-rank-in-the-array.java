// User function Template for Java

class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        // code here
        int temp []= arr.clone();
        
        Arrays.sort(temp);
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        for(int num : temp)
        {
            if(!map.containsKey(num))
            {
                map.put(num, rank++);
            }
        }
        
        for(int i=0;i<N;i++)
        {
            arr[i]=map.get(arr[i]);   
        }
        
        return arr;
    }
}
