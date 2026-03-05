// User function Template for Java

class Solution {
    String removeSpecialCharacter(String s) {
        // code here
        String result = s.replaceAll("[^a-zA-Z]","");
        
        if(result.length()==0)
        return "-1";
        
        return result;
    }
}