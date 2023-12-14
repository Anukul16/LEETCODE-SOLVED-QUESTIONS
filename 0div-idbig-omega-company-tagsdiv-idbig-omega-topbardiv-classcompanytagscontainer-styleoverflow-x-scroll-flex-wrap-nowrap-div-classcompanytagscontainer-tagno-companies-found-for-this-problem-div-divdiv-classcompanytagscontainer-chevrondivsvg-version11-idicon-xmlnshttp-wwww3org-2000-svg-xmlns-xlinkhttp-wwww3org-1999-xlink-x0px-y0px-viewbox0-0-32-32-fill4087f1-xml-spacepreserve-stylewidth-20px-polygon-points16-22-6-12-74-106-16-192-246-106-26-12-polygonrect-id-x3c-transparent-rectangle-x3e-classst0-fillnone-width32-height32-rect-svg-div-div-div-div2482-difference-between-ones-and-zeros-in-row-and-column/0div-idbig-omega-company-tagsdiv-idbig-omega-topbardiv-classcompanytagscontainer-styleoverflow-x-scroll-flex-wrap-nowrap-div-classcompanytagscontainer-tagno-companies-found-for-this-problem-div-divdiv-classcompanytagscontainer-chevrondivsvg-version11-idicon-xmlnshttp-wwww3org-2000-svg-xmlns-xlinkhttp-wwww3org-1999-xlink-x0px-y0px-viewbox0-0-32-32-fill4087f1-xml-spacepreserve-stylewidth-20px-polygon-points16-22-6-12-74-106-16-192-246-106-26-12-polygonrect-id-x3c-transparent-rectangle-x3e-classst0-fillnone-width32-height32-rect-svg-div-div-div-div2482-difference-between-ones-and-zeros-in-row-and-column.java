class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n=grid.length,m=grid[0].length;

        int[]onesRowCount=new int[n];
        int[]onesColCount=new int[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    onesRowCount[i]++;
                    onesColCount[j]++;
                }
            }
        }
        // System.out.println(Arrays.toString(onesRowCount));

        int[][]diff=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                diff[i][j]=onesRowCount[i] + onesColCount[j] - (m-onesRowCount[i]) - (n-onesColCount[j]);
            }
        }
        return diff;
    }
}