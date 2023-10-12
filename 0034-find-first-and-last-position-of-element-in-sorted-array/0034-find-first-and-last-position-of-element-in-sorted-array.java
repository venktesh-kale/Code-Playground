class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length-1, mid =0;
        int arr[] = {-1,-1};
        while(left <= right){
            mid = left+(right-left)/2;
            if(nums[mid] == target){
                arr[0] = mid;
                right = mid-1;
            }
            else if(nums[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        left = 0;
        right = nums.length-1;
        mid = 0;
        while(left <= right){
            mid = left+(right-left)/2;
            if(nums[mid] == target){
                arr[1] = mid;
                left = mid+1;
            }
            else if(nums[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return arr;
    }
}