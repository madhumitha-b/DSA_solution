class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();  // ✅ Store strings directly
        
        for(String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            
            mp.computeIfAbsent(key, k -> new ArrayList<>()).add(str);  // ✅ One-liner
        }
        
        return new ArrayList<>(mp.values());  // ✅ Return all groups
    }
}
