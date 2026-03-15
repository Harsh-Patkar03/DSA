class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if (n==0) return 0;
        int []a=Arrays.copyOf(nums,n);
        Arrays.sort(a);
        
        int k=1,l=1;
        for (int i=0 ; i<n-1 ; i++){
            if (a[i+1]==a[i]) continue;
            if (a[i+1]-a[i]==1) k++;
            if (a[i+1]-a[i]!=1){
                l=Math.max(k,l);
                k=1;
            }
            l=Math.max(k,l);
        }
        return l;
    }
}