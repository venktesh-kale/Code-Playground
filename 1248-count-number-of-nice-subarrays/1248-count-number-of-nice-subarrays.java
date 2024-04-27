class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left = 0, no = 0, cnt = 0;

        while(left <= nums.length-1){
            no = 0;
            for(int right = left; right <= nums.length-1; right++){
                if(nums[right] % 2 != 0) no++;
            while(no > k){
                left++;
                    if(nums[left] % 2 != 0) no--;
            }
            if(no == k){
                cnt++;
            }
            }
            left++;
        }

        return cnt;
    }
}