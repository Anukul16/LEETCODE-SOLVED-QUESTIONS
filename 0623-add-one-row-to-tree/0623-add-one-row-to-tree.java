class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if(depth == 1){
            TreeNode newRoot = new TreeNode(val);
            newRoot.left=root;
            return newRoot;
        }
        return solve(root,val,depth,1);
    }
    public TreeNode solve(TreeNode root,int val,int depth,int currDepth){
        if(root==null){
            return null;
        }
        if(currDepth == depth-1){
            TreeNode tempLeft = root.left;
            TreeNode tempRight = root.right;
            root.left=new TreeNode(val);
            root.right=new TreeNode(val);
            root.left.left=tempLeft;
            root.right.right=tempRight;
            return root;
        }
        solve(root.left,val,depth,currDepth+1);
        solve(root.right,val,depth,currDepth+1);

        return root;
    }
}