class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        long N = n;
        if(N < 0){
            N = -N;
            x = 1/x;
        }
        return (N%2 == 0) ? myPow(x*x,(int) (N/2)) : x*myPow(x*x,(int) (N/2));
    }
    
}