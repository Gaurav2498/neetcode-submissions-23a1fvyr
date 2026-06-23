class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();

        for(int i = 0; i<strs.length; i++){
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);

            if(!mp.containsKey(sortedStr)){
                mp.put(sortedStr,new ArrayList<>());
            }

            mp.get(sortedStr).add(strs[i]);
        }

        return new ArrayList<>(mp.values());

    }
}
