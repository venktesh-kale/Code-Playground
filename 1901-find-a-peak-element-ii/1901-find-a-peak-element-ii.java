class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int low = 0, high = n-1;
        while(low <= high){
            int mid= low + (high - low)/2;
            int row = findRow(mat, mid, m , n);
            int left = mid-1 >= 0? mat[row][mid-1] : -1;
            int right = mid+1 < n? mat[row][mid+1] : -1;
            if(mat[row][mid] > left && mat[row][mid] > right) {
                return new int[]{row, mid};
            }
            else if(mat[row][mid] < left){
                high = mid-1;
            }
            else {
                low = mid +1;
            }
        }
        return new int[]{-1,-1};
    }

    public int findRow(int mat[][], int mid, int m, int n ){
        int i = 0, row = 0, maxval = Integer.MIN_VALUE;
        while(i < m){
            if(mat[i][mid] > maxval){
                maxval = mat[i][mid];
                row = i;
            }
            i++;
        }
        return row;
    }
}