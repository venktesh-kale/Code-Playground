class Solution {
    public int candy(int[] ratings) {
        int left[] = new int[ratings.length];
        Arrays.fill(left, 1);

        for(int i = 1; i< ratings.length; i++){
            if(ratings[i] > ratings[i-1]) left[i]= left[i-1] +1;
        }

        int right = 0 ;
        for(int j = ratings.length-2; j>=0; j--){
            if(ratings[j] > ratings[j+1]) {
                right++;
                left[j] = Math.max(left[j], right);
            }
            else right = 1;
        }

        int sum = 0;
        for(int i = 0; i < left.length; i++){
            sum += left[i];
        }

        return sum;
    }
}