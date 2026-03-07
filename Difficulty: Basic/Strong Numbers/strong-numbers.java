// User function Template for Java

class Solution {
    
    public static long factorial (int n)
    {
        if(n<=1)
        return 1;
        
        return n*factorial(n-1);
    }
    static int isStrong(int N) {
        // code here
        
        int num = N;
        int sum = 0;
        
        while(num>0)
        {
            int digit = num%10;
            sum += factorial(digit);
            num = num/10;
        }
        
        if(sum==N)
        return 1;
        
        else
        return 0;
        
    }
};