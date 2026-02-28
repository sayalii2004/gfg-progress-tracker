class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if (s1.length()!=s2.length()) return false;
        
        char []sorted1=s1.toCharArray();
        char []sorted2=s2.toCharArray();
        
        Arrays.sort(sorted1);
        Arrays.sort(sorted2);
        return Arrays.equals(sorted1,sorted2);
    }
}