class Solution {
    public int maxProduct(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int prod=nums[i];
            maxi=Math.max(maxi,prod);
            for(int j=i+1;j<nums.length;j++){
                prod=prod*nums[j];
                maxi=Math.max(maxi,prod);
            }
        }
        return maxi;
    }
}