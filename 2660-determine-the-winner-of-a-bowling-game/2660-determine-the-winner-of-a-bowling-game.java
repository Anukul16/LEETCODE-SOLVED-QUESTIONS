class Solution {
    public int isWinner(int[] p1, int[] p2) {
        int n=p1.length;
        int sum1=p1[0],sum2=p2[0];
        boolean f1=false,f2=false;
        for(int i=1;i<n;i++){
            if(p1[i-1]==10 || (i>1 && p1[i-2]==10) ){
                sum1+=2*p1[i];
            }else sum1+=p1[i];
            // if(p1[i]==10)f1=true;
             if(p2[i-1]==10 || (i>1 &&  p2[i-2]==10) ){
                sum2+=2*p2[i];
            }else sum2+=p2[i];

        }
        if(sum1>sum2)return 1;
        else if(sum2>sum1)return 2;
        return 0;
    }
}