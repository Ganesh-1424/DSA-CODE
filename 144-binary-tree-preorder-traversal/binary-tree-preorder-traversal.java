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
// class Solution {
//     public static void preorderTravers(TreeNode root, List<Integer>ls){
//         if(root==null){
//             return;
//         }
//         ls.add(root.val);
//         preorderTravers(root.left,ls);
//         preorderTravers(root.right,ls);
//     }
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> ls= new ArrayList<>();
//         preorderTravers(root,ls);
//         return ls;
        
//     }
// }
class Solution{
    public static void preordertravers(TreeNode root,List<Integer> ls){
        if(root==null){
            return;
        }
        ls.add(root.val);
        preordertravers(root.left,ls);
        preordertravers(root.right,ls);
    }
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer>ls=new ArrayList<>();
        preordertravers(root,ls);
        return ls;
    }
}