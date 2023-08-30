import java.util.*;

public class teemoattack {
    public static void main(String[] args)
        {
        int timeSeries[] = {1,4};
        int duration = 2;
        int ans = 0;
        int n = timeSeries.length,d1 = duration,d2 = duration-1;
        
        for(int i = 0;i<n;i++){
            if(i == n-1){
                ans += d1;
                System.out.println(ans);
            } 
            if(timeSeries[i] + d2 >= timeSeries[i+1]){
                ans += timeSeries[i+1] - timeSeries[i];
            }

            else{
                ans += d1;
            }
             
        }
        
    }
}
