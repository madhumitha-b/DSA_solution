class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int cnt=0;
        int maxi = -1;
        
        for(int i=0;i<nums.length;i++){
            if(maxi<cnt)
                maxi=cnt;
            if(nums[i]==1)
            cnt++;
            else{
                cnt=0;
            }}

                        if(maxi<cnt)
                maxi=cnt;
        
        return maxi;
    }
}