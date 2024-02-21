class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        Arrays.sort(candidates);
        findsum(candidates,target, 0, ans, new ArrayList<>());
        return ans;
    }

    public void findsum(int[] arr, int target, int start, List<List<Integer>>ans, List<Integer>ds){
            if(target == 0){
            ans.add(new ArrayList<>(ds));
            return ;
            }
          
       
        for(int i = start; i< arr.length; i++){
            if(i > start && arr[i-1] == arr[i]) continue;
            if(arr[i] > target) break;
            ds.add(arr[i]);
            findsum(arr, target-arr[i], i+1, ans, ds);
            ds.remove(ds.size()-1);
        }
    }
}