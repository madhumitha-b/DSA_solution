class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums1) {
            pq.add(num);
        }

        for (int num : nums2) {
            pq.add(num);
        }

        int n = pq.size();

        int prev = 0;
        int curr = 0;

        for (int i = 0; i <= n / 2; i++) {
            prev = curr;
            curr = pq.poll();
        }

        if (n % 2 == 0) {
            return (prev + curr) / 2.0;
        }

        return curr;
    }
}