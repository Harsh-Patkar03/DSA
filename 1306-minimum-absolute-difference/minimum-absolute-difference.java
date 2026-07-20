class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> num= new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0 ;i<arr.length-1;i++){
            min=Math.min(min,arr[i+1]-arr[i]);
        }
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]-arr[i]==min){
                num.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return num;
    }
}