import java.util.*;
public class sortcolr {
        public static void main(String srg[]) {
            int nums[] = {2,0,2,1,1,0}; 
            for(int i = 0 ; i< nums.length; i++){
                for(int j = 1; j < nums.length; j++){
                    if(nums[j-1] > nums[j]){
                    int temp =nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                 } 
                    
                }
                
            }
            for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
            }
        }
    }
