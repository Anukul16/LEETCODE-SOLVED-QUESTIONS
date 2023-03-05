class Solution {
    public int passThePillow(int n, int time) {
        int x=1,y=1;
        for(int i=1;i<=time;i++){
            x+=y;
            if(x==n && y==1)y=-1;
            else if(y==-1 && x==1)y=1;
        } 
        return x;
    }
}