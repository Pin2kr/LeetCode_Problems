class Solution {
    public int diagonalSum(int[][] mat) {
       int sum=0; 

       for(int i=0;i<mat.length;i++){
          // primary diagonal(i==i)
          sum+=mat[i][i];

          //secondary diagonal(i+j==matrix.length-1,j=matrix.length-i-1)
          if(i!=mat.length-i-1){
          sum+=mat[i][mat.length-i-1];
          }
       }
       return sum;
    }
}