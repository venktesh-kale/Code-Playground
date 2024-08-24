class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0, cnt = 0;
        for(int i=0; i < nums.length; i++){
            if(nums[i] == 1){
                cnt++;
            }
            else{
                res = Math.max(cnt, res);
                cnt = 0;
            }
        }

        res = Math.max(cnt, res);
        return res;
    }
}