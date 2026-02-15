class Solution {
    int recursion(int[] nums){

        int n=nums.length;
        int prev=nums[0];
        int prev2=0;

        for(int i=0;i<n;i++){
            int take=nums[i];

            if(i>1) take +=prev2;
            int nottake = 0+prev;

            int curi=Math.max(take,nottake);
            prev2=prev;
            prev=curi;
        }
        return prev;
    }

    public int rob(int[] nums) {

        int[] ver1=new int[nums.length];
        int[] ver2=new int[nums.length];
        if(nums.length==1)return nums[0];
        int k=0;
        for(int i=1;i<nums.length;i++){
            ver1[k++]=nums[i];
        }
        k=0;
        for(int i=0;i<nums.length-1;i++){
            ver2[k++]=nums[i];
        }

        int a= recursion(ver1);
        int b= recursion(ver2);
        return Math.max(a,b);
    }
}