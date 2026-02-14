class Solution {
    public int removeDuplicates(int[] nums) {
        int i,j=1;
        int n=nums.length;
        for (i=1;i<n;i++){
            if(nums[i]!=nums[j-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}