class Solution {
    public int trap(int[] height) {

       //left max array
       int n=height.length;
       int leftMax[]=new int[n];
       leftMax[0]=height[0];

       for(int i=1;i<n;i++){
        leftMax[i]=Math.max(height[i],leftMax[i-1]);
       } 
       //right max array
       int rightMax[]=new int[n];
       rightMax[n-1]=height[n-1];
       for(int j=(n-2);j>=0;j--){
         rightMax[j]=Math.max(height[j],rightMax[j+1]);
       }
       //loop-trapping water=(waterlevel-height)*width;
       int trappedWater=0;
       for(int i=0;i<n;i++){
        //waterlevel=Math.min(leftMax[i].rightMax[i]);
        int waterLevel=Math.min(leftMax[i],rightMax[i]);
        //trappedwater=(waterlevel-height[i]*width);
        trappedWater+=(waterLevel-height[i]);
       }
        return trappedWater; 
    }
  
}