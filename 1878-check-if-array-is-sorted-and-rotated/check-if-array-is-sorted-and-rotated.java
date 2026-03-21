class Solution {
    public boolean check(int[] nums) {
        int breaks = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // Circular: last element compares with first
            if (nums[i] > nums[(i + 1) % n]) {
                breaks++;
            }
        }
        
        return breaks <= 1;
    }
}
