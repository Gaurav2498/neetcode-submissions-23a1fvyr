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
    public boolean isValidBST(TreeNode root) {
        // The root has no min or max constraints initially
        return isValid(root, null, null);
    }

    private boolean isValid(TreeNode node, Integer min, Integer max) {
        // Base case: an empty node is inherently valid
        if (node == null) {
            return true;
        }

        // Check if the current node violates the min/max constraints.
        // We use Integer objects instead of int primitives so we can safely check for null.
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }

        // Recursively validate the left and right subtrees with updated constraints
        // For the left branch, the current node's value becomes the new maximum.
        // For the right branch, the current node's value becomes the new minimum.
        return isValid(node.left, min, node.val) && isValid(node.right, node.val, max);
    }
}