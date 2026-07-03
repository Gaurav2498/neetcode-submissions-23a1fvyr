/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     constructor(val = 0, left = null, right = null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    /**
     * @param {TreeNode} root
     * @return {boolean}
     */
    isValidBST(root) {

        const valid = (node, min, max) => {
            // Base case: an empty node is inherently valid
            if (!node) {
                return true;
            } 
            
            // Check if the current node violates the min/max constraints
            // Using != null safely handles the case where a value is exactly 0
            if ((min != null && min >= node.val) || (max != null && max <= node.val)) {
                return false;
            }

            // Recursively validate the left and right subtrees with updated constraints
            return valid(node.left, min, node.val) && valid(node.right, node.val, max);
        }

        // The root has no min or max constraints initially
        return valid(root, null, null);
    }
}