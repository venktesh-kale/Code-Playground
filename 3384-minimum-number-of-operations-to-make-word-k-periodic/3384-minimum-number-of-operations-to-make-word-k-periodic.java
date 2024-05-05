class Solution {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
       HashMap<String, Integer> map = new HashMap<>();
       for(int i = 0; i< word.length(); i+=k){
        String sub = word.substring(i, Math.min(i+k, word.length()));
        map.put(sub, map.getOrDefault(sub, 0) + 1);
       }
        int max = 0;
       for(int count : map.values()){
            max = Math.max(count, max);
       }

       return word.length()/ k - max;
    }
}