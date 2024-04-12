class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int NGL[]=new int[n];
        int NGR[]=new int[n];
        NGL[0]=height[0];
        NGR[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            NGL[i]=Math.max(NGL[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            NGR[i]=Math.max(NGR[i+1],height[i]);
        }
        // System.out.println(Arrays.toString(NGL));
        // System.out.println(Arrays.toString(NGR));
        int ans = 0;
        for(int i=0;i<n;i++){
            ans+=Math.min(NGL[i],NGR[i])-height[i];
        }
        return ans;
    }
}