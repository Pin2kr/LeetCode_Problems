class Solution {
    public int maxArea(int[] height) {
        //using two pointer

        int lp=0,rp=(height.length-1),max=0;

        while(lp<rp){
            //water contain-width*height

            int w=rp-lp;
            int h=Math.min(height[lp],height[rp]);
            int curW=w*h;
            max=Math.max(max,curW);

    // udate the container
       if(height[lp]<height[rp]){
        lp++;
       }else{
        rp--;
       }

        } 
         return max; 
    }
}