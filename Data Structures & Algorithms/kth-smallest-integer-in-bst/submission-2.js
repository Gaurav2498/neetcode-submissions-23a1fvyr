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
     * @param {number} k
     * @return {number}
     */
    kthSmallest(root, k) {
        let res = [];

        const dfs = (node) => {
            if(node == null) return;
            res.push(node.val);
            dfs(node.left);
            dfs(node.right);
        }

        console.log(">>>>>>>>>>>>",res);

        dfs(root);
        res.sort((a,b) => a-b);

        return res[k-1];
    }
}
