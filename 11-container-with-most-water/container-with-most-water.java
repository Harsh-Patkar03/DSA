class Solution {
    public int maxArea(int[] height) {
        int n =height.length;
        int left=0;
        int right=n-1;
        int most=0;
       while (left<right){
           int width = right-left;
           int area= Math.min(height[left],height[right])* width;
           most=Math.max(most,area);
           
           if (height[left]>=height[right]) right--;
           else left++;
        }
        return most;
    }
}