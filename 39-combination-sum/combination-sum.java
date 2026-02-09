class Solution {

    List<List<Integer>> res = new ArrayList<>();

    void subsequence(int index, int[] candidates, int target, List<Integer> lst, int sum) {

        if (sum == target) {
            res.add(new ArrayList<>(lst)); // copy list
            return;
        }

        if (sum > target || index == candidates.length) {
            return;
        }

        // Take current element (can reuse)
        lst.add(candidates[index]);
        subsequence(index, candidates, target, lst, sum + candidates[index]);

        // Backtrack
        lst.remove(lst.size() - 1);

        // Skip current element
        subsequence(index + 1, candidates, target, lst, sum);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        subsequence(0, candidates, target, new ArrayList<>(), 0);
        return res;
    }
}
