class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap <Integer, Integer> map = new HashMap<>();
        ArrayList <Integer> result = new ArrayList<>();
        
        for(int i=0;i<k;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        result.add(map.size());
        
        for(int i=1;i<=arr.length-k;i++)
        {
            map.put(arr[i-1],map.getOrDefault(arr[i-1],0)-1);
            
            if(map.get(arr[i-1])==0)
            {
                map.remove(arr[i-1]);
            }
            
            map.put(arr[i+k-1],map.getOrDefault(arr[i+k-1],0)+1);
            
            result.add(map.size());
        }
        return result;
    }
}