class Solution {
    int ans=-1;
    public int maxAncestorDiff(TreeNode root) {
        solve(root,-1,Integer.MAX_VALUE);
        return ans;
    }
    void solve(TreeNode root,int max,int min){
        if(root==null){
            ans=Math.max(ans,Math.abs(max-min));
            return;
        }
        max=Math.max(max,root.val);
        min=Math.min(min,root.val);
        solve(root.left,max,min);
        solve(root.right,max,min);
    }
    
}