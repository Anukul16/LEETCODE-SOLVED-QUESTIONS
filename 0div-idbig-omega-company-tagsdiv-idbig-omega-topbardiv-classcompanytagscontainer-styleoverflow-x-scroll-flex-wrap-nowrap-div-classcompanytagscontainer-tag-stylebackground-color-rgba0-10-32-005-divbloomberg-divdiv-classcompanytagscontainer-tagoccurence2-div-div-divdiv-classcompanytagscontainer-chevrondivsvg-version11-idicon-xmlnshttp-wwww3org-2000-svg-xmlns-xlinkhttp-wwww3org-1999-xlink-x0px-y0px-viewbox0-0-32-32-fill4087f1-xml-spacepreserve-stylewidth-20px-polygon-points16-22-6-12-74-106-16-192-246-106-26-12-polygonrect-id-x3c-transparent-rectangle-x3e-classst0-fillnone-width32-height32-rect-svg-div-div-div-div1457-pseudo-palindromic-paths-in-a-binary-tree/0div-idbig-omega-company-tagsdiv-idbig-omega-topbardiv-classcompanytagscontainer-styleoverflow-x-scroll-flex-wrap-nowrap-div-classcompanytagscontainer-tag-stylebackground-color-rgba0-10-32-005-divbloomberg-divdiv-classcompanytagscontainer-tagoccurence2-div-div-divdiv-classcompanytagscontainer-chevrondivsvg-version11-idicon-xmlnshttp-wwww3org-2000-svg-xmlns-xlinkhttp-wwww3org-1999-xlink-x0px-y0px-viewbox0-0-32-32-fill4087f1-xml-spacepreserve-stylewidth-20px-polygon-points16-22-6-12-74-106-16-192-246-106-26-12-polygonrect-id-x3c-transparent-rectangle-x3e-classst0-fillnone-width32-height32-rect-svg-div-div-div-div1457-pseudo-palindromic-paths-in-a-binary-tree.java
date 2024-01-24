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
public class Solution {
    public int pseudoPalindromicPaths(TreeNode root) {
        return dfs(root, new int[10]);
    }

    private int dfs(TreeNode node, int[] digits) {
        if (node == null) {
            return 0;
        }

        digits[node.val]++;
        if (node.left == null && node.right == null) {
            int oddCount = countOdd(digits);
            digits[node.val]--;  // Backtrack
            return (oddCount <= 1) ? 1 : 0;
        }

        int leftCount = dfs(node.left, digits);
        int rightCount = dfs(node.right, digits);

        digits[node.val]--;  // Backtrack

        return leftCount + rightCount;
    }

    private int countOdd(int[] digits) {
        int oddCount = 0;
        for (int digit : digits) {
            if ((digit & 1) == 1) {
                oddCount++;
            }
        }
        return oddCount;
    }
}