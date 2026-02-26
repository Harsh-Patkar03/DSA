class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<n;i++){
            int count=0;
            if(map.containsKey(nums[i])){
                count=map.get(nums[i]);
                map.put(nums[i],count+1);
            }
            else map.put(nums[i],1);
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            if (entry.getValue()>1) return true;
        }
    return false;
}}