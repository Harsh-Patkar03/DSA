class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> sn=new HashSet<>();
        for (int num:nums){
            if (sn.contains(num)) return true;
            sn.add(num);
        }
        return false;
    }
}