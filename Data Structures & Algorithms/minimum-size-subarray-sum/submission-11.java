class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int minC = 999999;
        int localSum  = 0;
        

        for(int r  = 0; r<nums.length; r++){
            localSum+=nums[r];

            if(localSum>=target){
                while(localSum>=target){
                    minC = Math.min(minC,r-l+1);
                    localSum -= nums[l];
                    l++;
                }
            }
        }

        return minC < 999999 ? minC : 0;


        // let minCount = Infinity;
        // let l = 0;
        // let localSum = 0;

        // for(let r = 0; r<nums.length; r++){
        //     localSum += nums[r];
            
        //     if(localSum >= target){
        //         while(localSum >= target){
        //         minCount = Math.min(minCount,r-l+1);
        //         localSum = localSum - nums[l];
        //         l++;
        //         }
        //     }
        // }

        // return minCount == Infinity ? 0 : minCount;
    }
}