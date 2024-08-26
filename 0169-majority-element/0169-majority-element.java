class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        } 

        for(int k : map.keySet()){
            if(map.get(k) > n){
                return k;
            }
        }

        return -1;
    }
}