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
    private int count = 0;
    private int result = -1;

    public int kthSmallest(TreeNode root, int k) {
        inorderT(root,k);
        return result;
    }

    private void inorderT(TreeNode node, int k){
        if(node == null || count >= k)
        return;

        inorderT(node.left,k);

        count++;
        if(count == k){
            result = node.val;
            return;
        }

        inorderT(node.right,k);
    }
}
