class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int m = matrix.length;
    int n = matrix[0].length;
    int col = matrix[0].length-1;
    for(int i =0; i < m; i++){
        if(target < matrix[i][col]){
            return fun(i,matrix,target);
        }
        if(target == matrix[i][col]) return true;
    }
    return false;
    }
    public boolean fun(int i,int matrix[][],int target){
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0,high = n;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[i][mid] == target ) return true;
            else if(target < matrix[i][mid]){
               high = mid-1;
            }
             else{
                low = mid+1;
            }
        }
        return false;
    }
}