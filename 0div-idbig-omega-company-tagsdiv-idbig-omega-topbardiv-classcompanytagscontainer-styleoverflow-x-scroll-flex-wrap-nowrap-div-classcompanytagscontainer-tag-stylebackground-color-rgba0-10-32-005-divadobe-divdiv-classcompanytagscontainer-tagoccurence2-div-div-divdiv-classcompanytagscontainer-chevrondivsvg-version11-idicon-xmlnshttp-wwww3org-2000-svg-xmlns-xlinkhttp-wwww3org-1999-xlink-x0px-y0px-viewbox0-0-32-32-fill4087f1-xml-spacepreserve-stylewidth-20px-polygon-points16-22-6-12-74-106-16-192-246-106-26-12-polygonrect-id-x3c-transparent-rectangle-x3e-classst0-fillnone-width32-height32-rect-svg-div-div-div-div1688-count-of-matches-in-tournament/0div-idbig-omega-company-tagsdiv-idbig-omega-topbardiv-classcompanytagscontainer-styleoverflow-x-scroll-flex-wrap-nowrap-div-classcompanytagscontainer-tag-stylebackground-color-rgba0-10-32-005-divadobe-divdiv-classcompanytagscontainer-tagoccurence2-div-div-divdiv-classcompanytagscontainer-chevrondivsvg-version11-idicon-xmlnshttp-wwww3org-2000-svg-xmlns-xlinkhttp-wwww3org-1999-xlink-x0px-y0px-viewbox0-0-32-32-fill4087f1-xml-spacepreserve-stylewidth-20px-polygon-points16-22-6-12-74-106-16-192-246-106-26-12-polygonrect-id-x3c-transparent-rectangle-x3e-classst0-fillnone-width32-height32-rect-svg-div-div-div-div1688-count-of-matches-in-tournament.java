class Solution {
    public int numberOfMatches(int n) {
        int ans=0;
        while(n!=1){
            if(n%2 == 0){
                ans+=n/2;
                // System.out.println(ans);
                n/=2;
            }else{
                ans+=1;
                // System.out.println(ans);
                n-=1;
            }
        }
        return ans;
    }
}