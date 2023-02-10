class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        Queue<Integer>pq=new PriorityQueue<>((a,b)->(b-a));

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                pq.offer(matrix[i][j]);
                if(pq.size()>k)pq.poll();
            }
        }
        
        return pq.poll();
    }
}