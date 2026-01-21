class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> setR = new HashSet<Integer>();
        HashSet<Integer> setC = new HashSet<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    setR.add(i);
                    setC.add(j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
                if(setR.contains(i)){
                    setR.remove(i); 
         for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=0;
         }
                }
        }
        for(int i=0;i<matrix[0].length;i++){
                if(setC.contains(i)){
                    setC.remove(i); 
         for(int j=0;j<matrix.length;j++){
                matrix[j][i]=0;
         }
                }
        }
    }
}