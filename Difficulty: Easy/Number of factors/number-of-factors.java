class Solution {
    static int countFactors(int n) {
        // code here
        int count=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                if(n/i==i)
                {
                    count++;
                }
                else
                {
                    count=count+2;
                }
            }
        }
        return count;
    }
}