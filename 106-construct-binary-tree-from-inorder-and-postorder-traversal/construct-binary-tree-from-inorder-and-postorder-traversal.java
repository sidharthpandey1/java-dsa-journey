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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        return solve(0,n-1,0,n-1,inorder,postorder);
    }
    public TreeNode solve(int postlo,int posthi,int inlo,int inhi,int[] inorder,int[] postorder){
        if(postlo>posthi || inlo>inhi) return null;
        int val=postorder[posthi];
        TreeNode root=new TreeNode(val);
        int r=0;
        for(int i=inlo;i<=inhi;i++){
            if(inorder[i]==val){
                r=i;
                break;
            }
        }
        int c=r-inlo;
        root.left=solve(postlo,postlo+c-1,inlo,r-1,inorder,postorder);
        root.right=solve(postlo+c,posthi-1,r+1,inhi,inorder,postorder);
        return root;
    }
}