class Solution {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length-1, sum = 0;
        while(i <= j){
            sum = i+(j-i)/2;
            if(nums[sum] == target){
                return sum;
            }
            if(nums[sum] < target){
                i = sum + 1;
            }
            else{
                j = sum-1;
            }
        }
        return -1;
    }
}