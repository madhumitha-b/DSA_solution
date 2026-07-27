class Solution {

    List<List<Integer>> res = new ArrayList<>();

    void subset(int index, List<Integer> arr,
                Set<List<Integer>> st, int[] nums) {

        if (index >= nums.length) {
            st.add(new ArrayList<>(arr));
            return;
        }

        arr.add(nums[index]);

        subset(index + 1, arr, st, nums);

        arr.remove(arr.size() - 1);

        subset(index + 1, arr, st, nums);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<Integer> arr = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        Arrays.sort(nums);

        subset(0, arr, st, nums);

        // After recursion is complete
        res.addAll(st);

        return res;
    }
}