class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        
        for (int num : arr)
        {
            if(num<smallest)
            {
                second_smallest= smallest;
                smallest=num;
            }
            else if(num > smallest && num < second_smallest)
            {
                second_smallest = num;
            }
        }
        ArrayList <Integer> result = new ArrayList <>();
            
        if (second_smallest == Integer.MAX_VALUE)
        {
            result.add(-1);
        }
        else
        {
            result.add(smallest);
            result.add(second_smallest);
        }
        return result;
    }
}
