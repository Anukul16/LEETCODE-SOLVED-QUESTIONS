class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int x:piles)max=Math.max(max,x);
        if(piles.length==h)return max;
        int ls=0,hs=max,speed=Integer.MAX_VALUE;
        while(ls<=hs){
            int mid=ls+(hs-ls)/2;
            if(isPossible(piles,mid,h)){
                speed=mid;
                hs=mid-1;
            }else ls=mid+1;
        }
        return speed;
    }
    boolean isPossible(int[]piles,int mid,int h){
        int time=0;
        for(int i=0;i<piles.length;i++){
            time+=(int)Math.ceil(piles[i]*1.0/mid);
        }
        return h>=time;
    }
}