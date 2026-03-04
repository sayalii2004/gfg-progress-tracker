class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        HashMap <Character, Integer> map = new HashMap<>();
        
        for(char ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0)+1);   
        }
        int max=-1;
        char result = 'z';
        for(char ch: map.keySet())
        {
            int freq = map.get(ch);
            if(freq>max||(freq==max && ch<result))
            {
                max= freq;
                result=ch;
            }
        }
        return result;
    }
}