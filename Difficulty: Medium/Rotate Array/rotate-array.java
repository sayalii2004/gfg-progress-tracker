class Solution {
    static void rotateArr(int arr[], int d) {
        // code here
        d=d%arr.length;
        reverseArr(arr,0,d-1);
        reverseArr(arr,d,arr.length-1);
        reverseArr(arr,0,arr.length-1);
    }
    
    static void reverseArr(int arr[], int start, int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}