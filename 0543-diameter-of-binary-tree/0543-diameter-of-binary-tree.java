class Solution {
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        dfs(root);
        return ans;
    }
    int dfs(TreeNode root){
        if(root==null)return 0;
        int l=dfs(root.left);
        int r=dfs(root.right);
        ans=Math.max(ans,l+r);
        return 1+Math.max(l,r);
    }
}