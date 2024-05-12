class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int cnt = 0;
        int end = intervals[0][1];
        int start = intervals[0][0];

        if(intervals.length == 0) return cnt;
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] < end && intervals[i][0] >= start){
                cnt++;
            }
            else{
                end = intervals[i][1];
            }
        }

        return cnt;
    }
}