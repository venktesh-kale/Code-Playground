import java.util.*;
public class jumpgame {
    public static void main(String[] args) {
        int nums[] = {2,3,1,1,4};
        // int nums[] = {3,2,1,0,4};
        int index = nums.length-1;
        for(int i = nums.length-1; i>= 0; i--){
            if(nums[i]+i >= index)
            index = i;
        }
        if(index == 0)
        System.out.println("True");
        else
        System.out.println("false");
    }
} 
    

