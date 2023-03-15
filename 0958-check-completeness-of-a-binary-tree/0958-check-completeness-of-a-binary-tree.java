/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        if(root==null)return true;
        int totalNodes=countNodes(root);
        return dfs(root,1,totalNodes);
    }
    private int countNodes(TreeNode root){
        if(root==null)return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    private boolean dfs(TreeNode root,int i,int totalNodes){
        if(root==null)return true;
        if(i>totalNodes)return false;
        return dfs(root.left,2*i,totalNodes) && dfs(root.right,2*i+1,totalNodes);
    }
}