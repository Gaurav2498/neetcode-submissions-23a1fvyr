class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int arr[] = new int[l];

        int left =1;
        int right = 1;

        for(int i =0;i<l;i++)
        {
            arr[i] = left;
            left *= nums[i];
        }

        for(int j = l-1 ; j>=0;j--)
        {
            arr[j] *= right;
            right *= nums[j];
        }

        return arr;
    }
}  
