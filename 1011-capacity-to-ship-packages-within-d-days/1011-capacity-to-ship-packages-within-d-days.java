class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int ls=0,hs=0;
        for(int x:weights){
            ls=Math.max(ls,x);
            hs+=x;
        }
        int ans=0;
        while(ls<=hs){
            int mid=ls+(hs-ls)/2;
            if(is_Possible(mid,days,weights)){
                ans=mid;
                hs=mid-1;
            }else ls=mid+1;
        }
        return ans;
    }
    boolean is_Possible(int mid,int days,int[]weights){
        int limit=0;
        for(int i=0;i<weights.length;i++){
           limit+=weights[i];
           if(limit>mid){
               days--;
               limit=weights[i];
           }
           if(i==weights.length-1){
               if(limit<=mid){
                   days--;
               }
           }
        }
        return days>=0;
    }
}