class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();

        if(nums.length == 0)
        return 0;

        for(int n: nums){
            st.add(n);
        }
        int res = 1;

        for(int i: st){
            if(!st.contains(i-1)){
                int curr = i;
                int l = 1;
                while(st.contains(curr+1)){
                    curr++;
                    l++;
                }
            res = Math.max(res,l);

            }
        }

        return res;
    }
}
