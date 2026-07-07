class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMin(nums) {
        let n = nums.length;

        let low = 0;
        let high = n - 1;

        while(low<high){
            const mid = low + Math.floor((high-low)/2);

           if(nums[mid] > nums[high]) {
                low = mid + 1;
           }
           else if(nums[mid] <= nums[high]){
                high = mid;
            }
        } 

        return nums[low];
    }
}
