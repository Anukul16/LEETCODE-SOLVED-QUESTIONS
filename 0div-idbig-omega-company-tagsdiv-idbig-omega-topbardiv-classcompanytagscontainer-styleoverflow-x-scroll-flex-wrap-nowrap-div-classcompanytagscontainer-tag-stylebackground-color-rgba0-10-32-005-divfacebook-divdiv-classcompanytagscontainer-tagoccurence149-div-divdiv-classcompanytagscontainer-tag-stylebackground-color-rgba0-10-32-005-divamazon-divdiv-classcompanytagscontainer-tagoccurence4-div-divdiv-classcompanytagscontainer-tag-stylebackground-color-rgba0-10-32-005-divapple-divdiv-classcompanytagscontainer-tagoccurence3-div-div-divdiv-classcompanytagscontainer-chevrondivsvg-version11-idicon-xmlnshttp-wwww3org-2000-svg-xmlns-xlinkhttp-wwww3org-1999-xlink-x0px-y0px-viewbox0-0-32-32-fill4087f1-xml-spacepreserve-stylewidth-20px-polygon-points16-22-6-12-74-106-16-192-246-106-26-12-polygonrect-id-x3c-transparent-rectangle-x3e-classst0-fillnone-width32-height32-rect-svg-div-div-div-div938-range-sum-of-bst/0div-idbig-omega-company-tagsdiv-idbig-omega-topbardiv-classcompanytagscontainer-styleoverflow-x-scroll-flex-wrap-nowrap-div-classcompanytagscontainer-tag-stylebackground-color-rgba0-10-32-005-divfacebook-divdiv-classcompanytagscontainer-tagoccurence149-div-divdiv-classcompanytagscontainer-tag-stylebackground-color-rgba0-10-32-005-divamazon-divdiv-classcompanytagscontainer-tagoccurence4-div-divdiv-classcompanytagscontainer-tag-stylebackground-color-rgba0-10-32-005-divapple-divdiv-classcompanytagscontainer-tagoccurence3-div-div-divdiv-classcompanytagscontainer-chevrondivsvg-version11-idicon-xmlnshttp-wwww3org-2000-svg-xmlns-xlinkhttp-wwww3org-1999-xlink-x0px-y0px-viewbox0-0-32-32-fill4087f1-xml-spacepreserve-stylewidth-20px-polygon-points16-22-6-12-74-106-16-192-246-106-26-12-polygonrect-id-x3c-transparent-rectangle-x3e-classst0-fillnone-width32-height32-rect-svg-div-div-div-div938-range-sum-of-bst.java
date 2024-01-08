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
    int dfs(TreeNode root,int low,int high){
        if(root==null)
            return 0;
        int sum = 0;
        if(root.val>=low && root.val<=high){
            sum+=root.val + dfs(root.left,low,high) + dfs(root.right,low,high);
        }else if(root.val<low){
            sum+=dfs(root.right,low,high);   
        }else if(root.val>high){
            sum+=dfs(root.left,low,high);
        }
        return sum;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        return dfs(root,low,high);
    }
}