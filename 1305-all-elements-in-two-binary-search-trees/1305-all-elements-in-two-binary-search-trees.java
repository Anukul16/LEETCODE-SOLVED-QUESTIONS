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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer>ans=new ArrayList<>();
        dfs(root1,ans);
        dfs(root2,ans);
        Collections.sort(ans);
        return ans;

    }
    private void dfs(TreeNode root,List<Integer>ans)
    {
        if(root==null)return;
        dfs(root.left,ans);
        ans.add(root.val);
        dfs(root.right,ans);
    }
}