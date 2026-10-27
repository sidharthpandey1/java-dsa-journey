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
    static int s;
    public boolean isCompleteTree(TreeNode root) {
        s=size(root);
        return iscbt(root,1);
        
    }
    public int size(TreeNode root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public boolean iscbt(TreeNode root,int idx){
        if(root==null) return true;
        if(idx>s) return false;
        return iscbt(root.left,2*idx) && iscbt(root.right,2*idx+1);
    }
}