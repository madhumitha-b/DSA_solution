class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int i=0;
        int minLen=Integer.MAX_VALUE;
        int sum=0;

        for(int j=0;j<nums.length;j++){
            sum=sum+nums[j];
            while(i<=j&&sum>=target){
                System.out.println("i"+i+",j"+j+",minLen"+minLen);
                if(minLen>j-i+1)
                minLen=j-i+1;
                sum=sum-nums[i];
                i++;
            }
        }
        if(minLen==Integer.MAX_VALUE)
        minLen=0;
        return minLen;
    }
}