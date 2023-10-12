class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1,mid= 0, ans = -1;
        while(low <= high){
            mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }
            if (nums[low] <= nums[mid]) {
            if (nums[low] <= target && target <= nums[mid]) {
                //element exists:
                high = mid - 1;
            }
            else {
                //element does not exist:
                low = mid + 1;
            }
        }
        else { //if right part is sorted:
            if (nums[mid] <= target && target <= nums[high]) {
                //element exists:
                low = mid + 1;
            }
            else {
                //element does not exist:
                high = mid - 1;
            }
        }
    }
    return -1;
    }
}