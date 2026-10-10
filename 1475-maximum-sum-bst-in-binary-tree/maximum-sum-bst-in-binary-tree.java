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
    static int maxsum;
    class Quad{
        int max;
        int min;
        int sum;
        boolean isBst;
        Quad(int max,int min,int sum,boolean isBst){
            this.min=min;
            this.max=max;
            this.sum=sum;
            this.isBst=isBst;
        }
    }
    public int maxSumBST(TreeNode root) {
        maxsum=0;
        helper(root);
        return maxsum;
        
    }
    Quad helper(TreeNode root){
        if(root==null) return new Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,true);
        Quad lst=helper(root.left);
        Quad rst=helper(root.right);
        int mx=Math.max(root.val,Math.max(lst.max,rst.max));
        int mn=Math.min(root.val,Math.min(lst.min,rst.min));
        int sum=root.val+lst.sum+rst.sum;
       boolean isBst=lst.isBst && rst.isBst && (lst.max<root.val && rst.min>root.val);
        if(isBst) maxsum=Math.max(sum,maxsum);
        return new Quad(mx,mn,sum,isBst);
    }
}