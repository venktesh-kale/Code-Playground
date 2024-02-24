class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        findsubset(nums, 0, ans, new ArrayList<>());
        return ans;
    }
    public void findsubset(int[] arr, int start, List<List<Integer>>ans, List<Integer>ds ){
        ans.add(new ArrayList(ds));
        for(int i = start; i< arr.length; i++){
            if(i != start && arr[i] == arr[i-1]) continue;
            ds.add(arr[i]);
            findsubset(arr, i+1, ans, ds);
            ds.remove(ds.size()-1);
        }
    }
}