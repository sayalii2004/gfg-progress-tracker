class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        int i=0;
        int j=0;
        
        while(s1.length()>i && s2.length()>j)
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                i++;
            }
            j++;
        }
        return i==s1.length();
    }
};