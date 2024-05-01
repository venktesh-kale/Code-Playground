class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        int subWithK = subwithAtMostK(nums, k);
        int reducedSubWithK = subwithAtMostK(nums, k-1);
        return subWithK - reducedSubWithK;
    }

    public int subwithAtMostK(int nums[], int k){
      HashMap<Integer, Integer> map = new HashMap<>();
      int cnt = 0, left = 0 , right = 0;
      while(right < nums.length){
        map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
        while(map.size() > k){
            map.put(nums[left], map.get(nums[left]) -1);
            if(map.get(nums[left]) == 0){
                map.remove(nums[left]);
            }
            left++;
        }
        cnt += right - left + 1;
        right++;
      }

      return cnt;
    }
}