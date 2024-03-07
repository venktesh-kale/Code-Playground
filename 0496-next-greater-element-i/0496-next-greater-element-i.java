class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int i = 0;
        int ans[] = new int[nums1.length];
        while(i < nums1.length){
            for(int j = 0; j< nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    int k = j;
                    while(k < nums2.length){
                        if(nums2[k] > nums2[j]){
                            ans[i] = nums2[k];
                            break;
                        }
                        else if(k == nums2.length-1){
                            ans[i] = -1;
                            break;
                        }
                        k++;
                    }
                }
            }
            i++;
        }
        return ans;
    }
}