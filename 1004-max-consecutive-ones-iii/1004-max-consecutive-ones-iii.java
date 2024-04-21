class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, maxlen = 0, zeros = 0;

        while(r < nums.length){
            if(nums[r] == 0) zeros++;
            if(zeros > k){
                if(nums[l] == 0) zeros--;
                l++;
            }
            if(zeros <= k){
                maxlen = Math.max(maxlen, r-l+1);
            }
            r++;
        }

        return maxlen;
    }
}