class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtrack(new ArrayList<>(),nums);
        return res;
    }

    private void backtrack(List<Integer> arr,int[] nums){
        if(arr.size() == nums.length){
            res.add(new ArrayList<>(arr));
            return;
        }

        for(int num : nums){
            if(arr.contains(num)) continue;

            arr.add(num);
            backtrack(arr,nums);
            arr.remove(arr.size()-1);
        }
    }
}
