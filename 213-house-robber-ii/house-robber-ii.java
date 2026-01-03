class Solution {

public int rob(int[] nums) {
    if (nums.length == 1) return nums[0];
    
    return Math.max(robLinear(nums, 0, nums.length - 2),  // Skip last
                    robLinear(nums, 1, nums.length - 1)); // Skip first
}

private int robLinear(int[] nums, int start, int end) {
    int prev2 = 0, prev1 = 0;
    for (int i = start; i <= end; i++) {
        int take = nums[i] + prev2;
        int skip = prev1;
        int curr = Math.max(take, skip);
        prev2 = prev1;
        prev1 = curr;
    }
    return prev1;
}

}