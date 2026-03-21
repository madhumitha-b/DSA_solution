class Solution {
    public void moveZeroes(int[] nums) {
        
        List<Integer> arr= new ArrayList<>();

        if(nums.length == 1) return;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            arr.add(nums[i]);
        }

        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }

        for(int i=arr.size();i<nums.length;i++){
            nums[i]=0;
        }
    }
}