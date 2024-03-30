//package TREE;
//
//public class bsttree {
//    private class node {
//        public int value;
//       public int height;
//        public static node left;
//        public static node right;
//
//        public node(int value) {
//            this.value = value;
//        }
//
//        public int getValue() {
//            return value;
//        }
//    }
//
//    private node root;
//
//    public int height(node root) {
//        if (root == null) {
//            return -1;
//        }
//        return root.height;
//    }
//
//    public boolean isEmpty(node root) {
//        return root == null;
//    }
//
//    public boolean balanced(node root) {
//       return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
//
//    }
//}
