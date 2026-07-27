class Solution {

    List<List<Integer>> result = new ArrayList<>();

    void subset(int index, List<Integer> arr,
                int[] candidates, int target) {

        // Target reached
        if (target == 0) {
            result.add(new ArrayList<>(arr));
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            // Skip duplicate elements at the same level
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Since array is sorted,
            // all further elements will also be too large
            if (candidates[i] > target) {
                break;
            }

            // Choose
            arr.add(candidates[i]);

            // Move to i + 1 because
            // each candidate can be used only once
            subset(i + 1, arr,
                   candidates,
                   target - candidates[i]);

            // Backtrack
            arr.remove(arr.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(
            int[] candidates, int target) {

        Arrays.sort(candidates);

        subset(0, new ArrayList<>(),
               candidates, target);

        return result;
    }
}