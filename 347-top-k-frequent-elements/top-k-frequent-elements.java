class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        // Step 1: Count frequencies
        for(int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Bucket sort by frequency
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for(int num : mp.keySet()) {
            int freq = mp.get(num);
            if(bucket[freq] == null) bucket[freq] = new ArrayList<>();
            bucket[freq].add(num);
        }
        
        // Step 3: Collect top K from highest freq
        List<Integer> result = new ArrayList<>();
        for(int i = bucket.length - 1; i >= 0 && result.size() < k; i--) {
            if(bucket[i] != null) {
                result.addAll(bucket[i]);
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
