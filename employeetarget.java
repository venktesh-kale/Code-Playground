public class employeetarget {
    public static void main(String[] args) {
        {
            int hours[] = {0,1,2,3,4};
            int target =  2;
        int cnt = 0 ;
        for(int i =0 ; i<hours.length; i++){
            if(hours[i] >= target){
                cnt++;
            }
        }
         System.out.println(cnt);
    }
}
}
