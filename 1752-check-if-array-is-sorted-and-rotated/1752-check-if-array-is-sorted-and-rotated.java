class Solution {
    public boolean check(int[] nums) {
        int size = nums.length;
        int count = 0;

        for(int i =0; i < size; i++){
            if(nums[i] > nums[(i+1)%size])
            count++;
        }
        return (count <= 1);
    }
}