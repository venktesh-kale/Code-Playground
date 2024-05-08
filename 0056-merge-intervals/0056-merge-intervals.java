class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> result = new ArrayList<>();
        for(int i = 0; i <intervals.length ; i++){
            if(result.isEmpty() || intervals[i][0] > result.getLast()[1]){
                result.add(intervals[i]);
            }
            else{
                result.getLast()[1] = Math.max(result.getLast()[1], intervals[i][1]);
            }
        }

        return result.toArray(new int[0][]);
    }
}