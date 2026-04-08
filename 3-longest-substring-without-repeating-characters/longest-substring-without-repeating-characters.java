class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s==null|| s.length()==0)return 0;
        if (s.length()==1) return 1;
        HashSet<Character>set=new HashSet<>();
        int n = s.length();
        int ans=0;
        int r=0;
        int l=0;

        while (r<n){
            char c=s.charAt(r);
            while (set.contains(c)){
                set.remove (s.charAt(l));
                l++;
            }
            set.add(c);
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}