/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     String val;
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<String>plist=new ArrayList<>();
        ArrayList<String>qlist=new ArrayList<>();
        Preorder(p,plist);
        Preorder(q,qlist);
        if(plist.size()!=qlist.size())return false;
        for(int i=0;i<plist.size();i++){
            if(!plist.get(i).equals(qlist.get(i)))return false;
        }
        return true;

    }
    private void Preorder(TreeNode root,List<String>list){
        if(root==null){
            list.add("null");
            return;
        }
        list.add(String.valueOf(root.val));
        Preorder(root.left,list);
        Preorder(root.right,list);
    }
}