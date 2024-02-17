class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladder) {
        
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        int i=0;
        for(;i<heights.length-1;i++){
            int diff=heights[i+1]-heights[i];
            if(diff>0){
                bricks-=diff;
               pq.add(diff);
            } 
            if(bricks<0){
                ladder--;
                bricks+=pq.poll();
            }
            if(ladder<0)break;
        }
        return i;
    }
}