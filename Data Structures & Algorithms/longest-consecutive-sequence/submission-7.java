class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();

        for( int n : nums)
        {
            st.add(n);
        }

        int longest = 0;

        for(int n : st){
            if(!st.contains(n-1)){
                int currLongest = 1;
                while(st.contains(n+currLongest)){
                    currLongest++;
                }
            longest = Math.max(longest,currLongest);

                
            }

        }

        return longest;
    
    }
}
