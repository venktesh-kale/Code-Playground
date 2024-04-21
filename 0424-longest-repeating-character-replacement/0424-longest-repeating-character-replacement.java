class Solution {
    public int characterReplacement(String s, int k) {
        int maxlen = 0, left = 0, right = 0, maxf = 0;
        int arr[] = new int[26];
        while(right < s.length()){ 
            arr[s.charAt(right) - 'A']++;
            maxf = Math.max(maxf, arr[s.charAt(right) - 'A']);

            if((right-left+1) - maxf > k){
                arr[s.charAt(right) - 'A']--;
                left += 1;
                maxf = 0;
            }

            if((right - left +1) - maxf  <= k){
                maxlen = Math.max(maxlen, right-left+1);
            }
            right++;
        }

        return maxlen;
    }
}