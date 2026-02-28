// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        HashSet<Character> set = new HashSet <>();
        
        for(char ch : str2.toCharArray())
        {
            set.add(ch);
        }
        
        StringBuilder sb =new StringBuilder();
        // ArrayList <Character> arr= new ArrayList<>();
        for(char ch : str1.toCharArray())
        {
            if(!set.contains(ch))
            {
               sb.append(ch); 
            }
        }
        return sb.toString();
    }
}