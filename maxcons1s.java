public class maxcons1s {
    public static void main(String[] args) {
    int nums[] = {1,1,0,1,1,1};
    int cnt =0, max =0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 1){
                cnt++;
                if(max < cnt){
                    max = cnt;
                }
            }
            if(nums[i] == 0){
                cnt = 0;
            }
        }
        System.out.println(max);
    }
}
