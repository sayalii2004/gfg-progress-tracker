// User function Template for Java

class Solution {
    public void Addition(int[][] matrixA, int[][] matrixB) {
        // code here
        int n= matrixA.length;
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrixA[i][j]=matrixA[i][j]+matrixB[i][j];
            }
        }
    }
}