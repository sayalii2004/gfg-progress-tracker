// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        for(char ch:s.toCharArray())
        {
            set.add(ch);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch: set)
        {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}
