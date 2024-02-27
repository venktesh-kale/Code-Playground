class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans = new ArrayList<>();
        char[][] temp = new char[n][n];

        for(int i = 0; i< n ; i++){
            for(int j = 0; j< n; j++){
                temp[i][j] = '.';
            }
        }

        fnc(n, ans, temp, 0);
        return ans;
    }

    public void fnc(int n, List<List<String>>ans, char[][]temp, int row){
        if(row == n){
            ans.add(toBoard(temp));
            return;
        }

        for(int i = 0; i< n; i++){
            if(issafe(i , n , temp , row)){
                temp[row][i] = 'Q';
                fnc(n, ans, temp, row+1);
                temp[row][i] = '.';
            }
        }
    }

    public boolean issafe(int col, int n, char[][]temp , int row){

        for(int i =0 ; i< n; i++){
            if(temp[i][col] == 'Q' || temp[row][i] == 'Q') return false;
        }

        for(int l = 0; l<n; l++){
            if(inbound(row-l,col-l, n) && temp[row-l][col-l] == 'Q') return false;
            if(inbound(row+l,col-l, n) && temp[row+l][col-l] == 'Q') return false;
            if(inbound(row+l,col+l, n) && temp[row+l][col+l] == 'Q') return false;
            if(inbound(row-l,col+l, n) && temp[row-l][col+l] == 'Q') return false;
        }
        return true;
    }
    public boolean inbound(int i, int j, int n){
        if(i<0 || j<0 || i >=n || j >=n) return false;
        return true;
    }
    public List<String> toBoard(char[][] temp) {
        List<String> newBoard = new ArrayList<>();
        for (char[] row: temp) newBoard.add(new String(row));
        return newBoard;
    }
}