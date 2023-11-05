class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 1, high = nums.length-2, ans = 0;
        if(nums.length == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[nums.length-1] != nums[high]) return nums[nums.length-1];
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid-1] != nums[mid] && nums[mid+1] != nums[mid]){
                return nums[mid];
            }
            else if(mid%2 != 0){
                if(nums[mid+1] == nums[mid]) high = mid-1;
                if(nums[mid-1] == nums[mid]) low = mid+1;
            }
            else{
               if(nums[mid+1] == nums[mid]) low = mid+1;
                if(nums[mid-1] == nums[mid]) high = mid-1; 
            }
        }
        return -1;
    }
}