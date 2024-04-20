class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        int i = 0;
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            maxHeap.add(entry);
        }

        int arr[] = new int[k];
        
        while(k > 0){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            arr[i] = entry.getKey();
            i++;
            k--;
        }

        return arr;

    }
}