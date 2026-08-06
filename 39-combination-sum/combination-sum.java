class Solution {

    List<List<Integer>> res = new ArrayList<>();

    void recursion(int index,int[] candidates, int target,List<Integer> lst){

        if(target==0){
            res.add(new ArrayList<>(lst));
            return ;
        }
        if(index>=candidates.length)
        return ;
        if(target<0) return ;
        lst.add(candidates[index]);
        recursion(index,candidates,target-candidates[index],lst);
        lst.remove(lst.size()-1);
        recursion(index+1,candidates,target,lst);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    
        List<Integer> lst = new ArrayList<>();
        recursion(0,candidates,target,lst);
        return res;
    }
}