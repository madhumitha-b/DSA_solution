class Solution {
    public int findKthPositive(int[] arr, int k) {

        Stack<Integer> stk= new Stack<>();

        int i=1;
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int j=0;j<arr.length;j++)
        {
            mp.put(arr[j],1);
        }

        while(stk.size()<k){
            if(!mp.containsKey(i))
            stk.push(i);
            i++;
        }

        return stk.peek();  
    }
}