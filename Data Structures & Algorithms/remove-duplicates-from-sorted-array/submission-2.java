class Solution {
    public int removeDuplicates(int[] nums) {
        int l = nums.length;
        int k = 1;

        for(int i = 1; i<l; i++){
            if(nums[i-1] != nums[i]){
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}