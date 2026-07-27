class Solution {

    List<List<Integer>> res = new ArrayList<>();

    void subset(int index,List<Integer> arr,int[] candidates,int sum,int target){

        if(index>=candidates.length){
            if(target == sum){
            res.add(new ArrayList<>(arr));
            }
            return ;
        }
        if(target == sum){
            res.add(new ArrayList<>(arr));
            return ;
        }
        if(sum>target) return ;
        arr.add(candidates[index]);
        sum=sum+candidates[index];
        subset(index,arr,candidates,sum,target);
        sum=sum-candidates[index];
        arr.remove(arr.size()-1);
        subset(index+1,arr,candidates,sum,target);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<Integer> arr = new ArrayList<>();

        subset(0,arr,candidates,0,target);
        return res;
    }
}