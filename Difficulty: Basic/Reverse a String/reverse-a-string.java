class Solution {
    static String revStr(String s) {
        // code here
        char arr[]=s.toCharArray();
        
        int n=arr.length;
        int left=0;
        int right=n-1;
        
        while(left<right)
        {
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        
        return new String(arr);
    }
}