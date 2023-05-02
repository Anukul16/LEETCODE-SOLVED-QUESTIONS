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
    int ans=-1001;
    public int maxPathSum(TreeNode root) {
        if(root==null)return 0;
        dfs(root);
        return ans;
    }
    int dfs(TreeNode root){
        if(root==null)return 0;
        int l= dfs(root.left);
        int r=dfs(root.right);
        
        int neeche_hi_milgya_answer=l+r+root.val;

        int koi_ek_accha=Math.max(l,r)+root.val;

        int only_root_accha=root.val;

        ans=Math.max(ans,Math.max(neeche_hi_milgya_answer,Math.max(koi_ek_accha,only_root_accha)));
        
        return Math.max(koi_ek_accha,only_root_accha);
    }
}
/*

onek vabar por intuition esechilo ,code o korechilam but what to return e jhamela kore dilo

so ,basically first e ami ber korchi path er jonno answer 
    second a lefside and rightside er moddhe jeta max tarsathe root.val er add kore
    third a only root.val 
    
    ami return korte parbo only second and third ..cause jodi ami path e  ekta optimal answer peye jai
    then why should i return the value it will be invalid cause it will not be a path 
    
    so ami second  & third  er moddhe ekta return korte pari so jeta kina max hobe keno ki amader maximum answer dorkar hobe
    


*/