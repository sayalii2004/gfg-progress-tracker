// User function Template for Java

class Solution {
    String removeVowels(String s) {
        // code here
        char arr[]=new char[s.length()];
        int idx=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I' && ch!='O' &&ch!='U')
            {
                arr[idx]=ch;
                idx++;
            }
        }
        // String str = new String(arr); 
        return new String(arr,0,idx);
    }
}