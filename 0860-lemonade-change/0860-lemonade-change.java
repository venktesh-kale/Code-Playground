class Solution {
    public boolean lemonadeChange(int[] bills) {
        int cnt = 0;
        boolean flag = false;
        for(int amount : bills){
            if(amount == 5) cnt++;
            if(amount == 10 && cnt >= 1){
                cnt = cnt -1 +1;
                flag = true;
            }
            else if(amount == 20 && cnt >=3){
                cnt = cnt -3 +1;
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}