class Solution {
    public int sumNumbers(TreeNode root) {
        return solve(root,0);
    }
    public int solve(TreeNode root,int sum){
        if(root==null){
            return 0;
        }
        sum=sum*10+root.val;
        if(root.left==null && root.right==null)return sum;
        return solve(root.left,sum) + solve(root.right,sum);
    }
}