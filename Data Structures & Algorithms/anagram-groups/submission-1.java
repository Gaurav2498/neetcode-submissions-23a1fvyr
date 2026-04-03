class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
Map<String, List<String>> strsMap = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            if(!strsMap.containsKey(sortedStr))
            strsMap.put(sortedStr,new ArrayList<>());

            strsMap.get(sortedStr).add(strs[i]);
        }

        return new ArrayList<>(strsMap.values());
    }
}
