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
    public boolean isEvenOddTree(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        Queue<TreeNode>queue=new LinkedList<>();
        if(root==null)return false;
        queue.add(root);
        int flag=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer>temp=new ArrayList<>();
            for(int i=0;i<size;i++){
                if(queue.peek().left!=null)queue.add(queue.peek().left);
                if(queue.peek().right!=null)queue.add(queue.peek().right);
                temp.add(queue.poll().val);
            }
            if(flag==1){
                Collections.reverse(temp);
                ans.add(temp);
                flag=0;
            }else{
                ans.add(temp);
                flag=1;
            }
        }
        System.out.print(ans);
        for(int i=0;i<ans.size();i++){
            List<Integer>list=ans.get(i);
             System.out.println(list.size());
           if(i%2==0){
               if(list.size()==1){
                   if(list.get(0)%2==0)return false;
               }else{
                   for(int j=0;j<list.size()-1;j++){
                       if(list.get(j)%2==0 || list.get(j+1)%2==0 || list.get(j)>=list.get(j+1)){
                           return false;
                       }
                   }
               }
               
           }else{
               if(list.size()==1){
                   if(list.get(0)%2!=0)return false;
               }else{
                   for(int j=0;j<list.size()-1;j++){
                       if(list.get(j)%2!=0 || list.get(j+1)%2!=0 || list.get(j)>=list.get(j+1)){
                           return false;
                       }
                   }
               }
           }
        }
        return true;
    }
}