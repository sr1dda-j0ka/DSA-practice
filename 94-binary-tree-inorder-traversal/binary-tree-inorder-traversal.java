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
 //Use recursive approach
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>(); //create array
        inorder(root,result);//call traversal function
        return result;
    }
    public void inorder(TreeNode node,List<Integer> result){
        if(node==null){
            return; //if null return
        }
        inorder(node.left,result); //Inorder-left,root,right 
        result.add(node.val); //order these lines based on the approach
        inorder(node.right,result);

    }
}