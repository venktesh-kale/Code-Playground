class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans = new ArrayList<>();
        findsum(k, n , ans, 1, new ArrayList<>());
        return ans;
    }
    public void findsum(int limit, int n, List<List<Integer>>ans, int start,List<Integer>ds){
        if(limit == 0 && n == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
            for(int i = start; i<= 9; i++){
                    ds.add(i);
                    findsum(limit-1, n-i, ans, i+1, ds);
                    ds.remove(ds.size()-1);
            }
    }
}