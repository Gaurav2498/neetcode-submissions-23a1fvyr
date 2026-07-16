class Solution {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        dfs(new ArrayList<>(),nums,target,0);
        return res;
    }

    private void dfs(List<Integer> arr, int[] nums, int target,int start){
        if(target<0) return;

        if(target == 0){
            res.add(new ArrayList<>(arr));
            return;
        }

        for(int i = start; i<nums.length; i++){
            arr.add(nums[i]);
            dfs(arr,nums,target-nums[i],i);
            arr.remove(arr.size()-1);
        }
    }
}
