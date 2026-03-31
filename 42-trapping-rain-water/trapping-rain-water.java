class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int total=0;
        int lm=height[0];
        int rm=height[r];

        while (l<r){
            if (height[l]<height[r]){
                lm=Math.max(lm,height[l]);
                if(lm-height[l]>0){
                    total+=lm-height[l];
                }
                l++;
            }
            else {
                rm=Math.max(rm,height[r]);
                if (rm-height[r]>0){
                    total+=rm-height[r];
                }
                r--;
            }
        }
        return total;
    }
}