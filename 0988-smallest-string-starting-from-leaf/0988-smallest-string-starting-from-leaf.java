class Solution {
    public String smallestFromLeaf(TreeNode root) {
        PriorityQueue<String>pq=new PriorityQueue<>();
        StringBuilder sb=new StringBuilder();
        solve(root,pq,sb);
        return pq.poll();
    }
    public void solve(TreeNode root,PriorityQueue<String>pq,StringBuilder sb){
        if(root == null){
            return;
        }
        sb.append((char)('a'+root.val));
        if(root.left==null && root.right==null){
            pq.add(sb.reverse().toString());
            sb.reverse();
            sb.deleteCharAt(sb.length()-1);
            return;
        }
        solve(root.left,pq,sb);
        solve(root.right,pq,sb);
        sb.deleteCharAt(sb.length()-1);
    }
}