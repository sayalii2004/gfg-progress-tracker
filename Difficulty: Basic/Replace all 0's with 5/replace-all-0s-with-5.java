class Solution {
    int convertfive(int num) {
        // Your code here
        String s = String.valueOf(num);
        s = s.replace('0','5');
        return Integer.parseInt(s);
    }
}