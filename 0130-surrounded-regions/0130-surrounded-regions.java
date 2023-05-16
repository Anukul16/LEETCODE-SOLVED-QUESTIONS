class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean visited[][]=new boolean[n][m];
        // traverse the first and last row
        for(int i=0;i<m;i++){
            if(board[0][i]=='O'){
                dfs(0,i,visited,board);
            }
            if(board[n-1][i]=='O'){
                dfs(n-1,i,visited,board);
            }
        }
        // traverse the first and last column
        for(int i=0;i<n;i++){
            if(board[i][0]=='O'){
                dfs(i,0,visited,board);
            }
            if(board[i][m-1]=='O'){
                dfs(i,m-1,visited,board);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==false && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }
    void dfs(int r,int c,boolean[][]visited,char[][]board){
        int n=board.length,m=board[0].length;
        visited[r][c]=true;
        int dRow[]={-1,0,1,0};
        int dCol[]={0,1,0,-1};
        for(int i=0;i<4;i++){
            int nRow=r+dRow[i];
            int nCol=c+dCol[i];
            if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && board[nRow][nCol]=='O' && visited[nRow][nCol]==false){
                dfs(nRow,nCol,visited,board);
            }
        }
    }
}