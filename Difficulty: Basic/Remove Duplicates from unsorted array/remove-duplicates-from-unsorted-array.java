// User function Template for Java

class Solution {

    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        LinkedHashSet <Integer> set = new LinkedHashSet<>();
        for(int num : arr)
        {
            set.add(num);
        }
        
        return new ArrayList<>(set);
    }
}