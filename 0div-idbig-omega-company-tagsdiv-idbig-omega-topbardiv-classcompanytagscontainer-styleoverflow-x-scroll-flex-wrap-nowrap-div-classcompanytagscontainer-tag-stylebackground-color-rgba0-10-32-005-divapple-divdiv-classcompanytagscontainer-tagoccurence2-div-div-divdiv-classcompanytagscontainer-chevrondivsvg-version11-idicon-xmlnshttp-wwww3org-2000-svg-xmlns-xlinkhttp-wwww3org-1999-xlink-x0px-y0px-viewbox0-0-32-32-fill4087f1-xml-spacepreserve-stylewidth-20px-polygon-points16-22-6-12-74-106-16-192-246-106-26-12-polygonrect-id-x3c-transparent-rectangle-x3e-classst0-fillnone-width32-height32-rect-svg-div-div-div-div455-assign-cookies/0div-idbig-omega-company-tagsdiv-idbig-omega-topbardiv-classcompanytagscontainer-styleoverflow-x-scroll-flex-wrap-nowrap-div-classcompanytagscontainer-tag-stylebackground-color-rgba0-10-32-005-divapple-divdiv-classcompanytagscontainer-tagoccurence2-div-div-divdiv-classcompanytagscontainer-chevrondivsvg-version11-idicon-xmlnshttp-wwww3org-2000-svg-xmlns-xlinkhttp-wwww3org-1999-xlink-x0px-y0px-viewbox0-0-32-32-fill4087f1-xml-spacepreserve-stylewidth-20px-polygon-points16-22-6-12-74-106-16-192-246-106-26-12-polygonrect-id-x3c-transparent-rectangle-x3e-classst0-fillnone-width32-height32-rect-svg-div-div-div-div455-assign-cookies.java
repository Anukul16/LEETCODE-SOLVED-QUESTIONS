class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length,m=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0,cnt=0;
        while(i<n && j<m){
            if(s[j]>=g[i]){
                i++;j++;cnt++;
            }else{
                j++;
            }
        }
        return cnt;
    }
}