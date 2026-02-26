class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        int[] charo=new int[26];
        for (int i=0;i<s.length();i++){
            charo[s.charAt(i)-'a']++;
            charo[t.charAt(i)-'a']--;
        }
        for (int count:charo) if(count!=0) return false;
        return true;
    }
}