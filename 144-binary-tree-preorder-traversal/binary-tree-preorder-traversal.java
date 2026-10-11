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
    //RECURSIVELY
    // public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> ans=new ArrayList<>();
    //     preorder(root,ans);
    //     return ans;
        
    // }
    // public void preorder(TreeNode root,List<Integer> ans){
    //     if(root==null) return;
    //     ans.add(root.val);
    //     preorder(root.left,ans);
    //     preorder(root.right,ans);
    // }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        if(root==null) return ans;
        s.push(root);
        while(s.size()>0){
            TreeNode top=s.pop();
            ans.add(top.val);
            if(top.right!=null) s.push(top.right);
            if(top.left!=null) s.push(top.left); 
        }
        return ans;
    }
    
}