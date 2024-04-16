class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int n = hand.length;
        if(n % groupSize != 0) return false;

        for(int card : hand){
            pq.add(card);
        }

        while(!pq.isEmpty()){
            int first = pq.poll();
            for(int i = 1; i < groupSize; i++){
               if(!pq.remove(first + i)) return false;
            }
        }

        return true;
    }
}