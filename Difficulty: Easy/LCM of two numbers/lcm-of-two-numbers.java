class Solution {
    static int gcd(int a, int b)
    {
        while(b!=0)
        {
            int temp= b;
            b= a%b;
            a = temp;
        }
        return a;
    }
    public int lcm(int a, int b) {
        // code here
        return (a*b)/gcd(a,b);
    }
}