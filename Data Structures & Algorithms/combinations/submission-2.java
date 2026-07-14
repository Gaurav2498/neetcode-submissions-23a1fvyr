class Solution {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        dfs(1,n,k,new ArrayList<>());
        return res;
    }

    private void dfs(int x,int n,int k, List<Integer> arr){
        if(arr.size() == k){
            res.add(new ArrayList<>(arr));
            return;
        }

        for(int i=x; i<=n; i++){
            if(arr.contains(i)) continue;

            arr.add(i);
            dfs(i+1,n,k,arr);
            arr.remove(arr.size()-1);
        }
    }
}