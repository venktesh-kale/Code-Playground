//code for finding minimum comman value
import java.util.*;

public class minicommanval {
   // public int getCommon(int[] nums1, int[] nums2) {
    public static void main(String args[]){
        int nums1[] = {1,2,3};
        int nums2[] = {2,3};
        int in1 = 0, in2= 0;
        int n1 = nums1.length;
        int n2 = nums2.length;

        while(in1 < n1 && in2 < n2){
            if(nums1[in1] == nums2[in2]){
                System.out.println(nums1[in1]);
                break;
            }
            else if(nums1[in1] > nums2[in2]){
                in2++;
            }
            else{
                in1++;
            }
        }
       
    }
}
