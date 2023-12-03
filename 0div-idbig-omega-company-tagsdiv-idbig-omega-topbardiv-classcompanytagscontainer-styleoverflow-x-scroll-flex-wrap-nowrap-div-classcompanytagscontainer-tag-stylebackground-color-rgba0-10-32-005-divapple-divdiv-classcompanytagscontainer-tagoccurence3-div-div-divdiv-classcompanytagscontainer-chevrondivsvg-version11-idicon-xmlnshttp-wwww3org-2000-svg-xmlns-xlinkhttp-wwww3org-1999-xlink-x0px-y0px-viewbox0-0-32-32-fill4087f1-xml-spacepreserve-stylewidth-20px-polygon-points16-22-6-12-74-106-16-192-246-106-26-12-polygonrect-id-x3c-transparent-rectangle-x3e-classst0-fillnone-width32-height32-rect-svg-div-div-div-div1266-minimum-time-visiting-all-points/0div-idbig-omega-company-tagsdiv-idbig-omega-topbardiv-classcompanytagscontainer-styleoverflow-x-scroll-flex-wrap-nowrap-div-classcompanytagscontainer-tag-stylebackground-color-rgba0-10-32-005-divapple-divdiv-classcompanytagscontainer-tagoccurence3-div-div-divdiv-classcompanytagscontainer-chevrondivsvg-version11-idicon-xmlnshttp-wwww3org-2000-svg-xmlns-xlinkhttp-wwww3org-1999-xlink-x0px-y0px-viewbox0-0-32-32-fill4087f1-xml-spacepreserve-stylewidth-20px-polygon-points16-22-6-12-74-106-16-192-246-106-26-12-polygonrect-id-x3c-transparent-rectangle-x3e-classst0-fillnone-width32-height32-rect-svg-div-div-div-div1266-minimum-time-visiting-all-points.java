class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n=points.length;
        int ans=0;
        for(int i=1;i<n;i++){
           int x=points[i-1][0],y=points[i-1][1];
           int x1=points[i][0],y1=points[i][1];

           ans+=Math.max(Math.abs(x-x1),Math.abs(y-y1));
        }
        return ans;
    }
}