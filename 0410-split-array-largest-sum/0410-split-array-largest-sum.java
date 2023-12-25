class Solution {
    public int splitArray(int[] nums, int k) {
        int maxval = Integer.MIN_VALUE, total = 0;
        for(int i = 0; i< nums.length; i++){
            maxval = Math.max(nums[i], maxval);
            total += nums[i];
        }

        int low = maxval, high = total, mid = 0;
        if(nums.length < k) return -1;
        while(low <= high){
            mid = low + (high - low)/2;
            int partitions = calculatepartitions(nums, mid);
            if(partitions > k){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return low;
    }

    public int calculatepartitions(int arr[], int val){
        int sum = 0;
        int partitions = 1;
        for(int i = 0; i< arr.length; i++){
            if(sum + arr[i] <= val){
                sum += arr[i];
            }
            else{
                partitions += 1;
                sum = arr[i];
            }
        }
        return partitions;
    }
}
