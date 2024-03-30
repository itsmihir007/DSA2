package TREE;

import com.sun.source.tree.Tree;

public class LeetcodeTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
         this.right = right;
         }

 }
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if(root == null) return true;
            return ischeck(root.left, root.right);
        }

        public boolean ischeck(TreeNode l , TreeNode r){
            if(l== null && r == null){
                return true;
            }
            if(l.val != r.val || l == null || r == null){
                return false;
            }
            return ischeck(l.left,r.right) && ischeck(l.right,r.left);
        }
    }

}
