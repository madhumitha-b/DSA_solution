class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] res=new int[2];
        res[0]=-1;
        res[1]=-1;

       for(int i=0;i<numbers.length-1;i++){
        for(int j=i+1;j<numbers.length;j++){

            int sum=numbers[i]+numbers[j];

            if(sum==target){
                res[0]=i+1;
                res[1]=j+1;
                return res;
            }
        }
       } 
       return res;
    }
}