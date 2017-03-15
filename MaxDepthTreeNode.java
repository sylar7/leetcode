/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
        	return 0;
        }else{
        	return 1 + compare(maxDepth(root.left), maxDepth(root.right));
        }
    }
    public int compare(int x, int y){
    	return x > y ? x : y;
    }
}