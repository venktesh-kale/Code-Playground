class Solution {
    public int jump(int[] nums) {
        int cnt = 0, max = 0, end = 0;
        for(int i = 0; i< nums.length-1; i++){
            max = Math.max(max, i + nums[i]);
            if(i == end){
                cnt++;
                end = max;
            }
        }
        return cnt;
    }
}