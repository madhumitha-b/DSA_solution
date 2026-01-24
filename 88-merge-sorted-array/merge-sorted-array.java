class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        PriorityQueue<Integer> pq= new PriorityQueue<>();

        for(int i=0;i<m;i++){
            pq.offer(nums1[i]);
        }

        for(int i=0;i<n;i++){
            pq.offer(nums2[i]);
        }

        int k=0;
        while(pq.size()>0){
            int a=pq.poll();
            nums1[k++]=a;
        }
    }
}