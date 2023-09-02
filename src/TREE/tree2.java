package TREE;

public class tree2 {

    public static class node {
        int data;
        node left;
        node right;

        public node(int data, node left, node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    //    public static String reverseWord(String str)
//    {
//        // Reverse the string str
//        StringBuilder str1 = new StringBuilder(str.length());
//        int j = 0;
//        for(int i = str.length(); i> 0; i++){
//            str1.append(str.charAt(i));
//
//        }
//        return str1.toString();
//    }
    public static boolean issubtree(node root, node subroot) {
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isidentical(root, subroot)) {
                return true;
            }
        }
        boolean leftans = issubtree(root.left, subroot);
        boolean rightans = isidentical(root.right, subroot);

        return leftans || rightans;
    }

    public static boolean isidentical(node root, node subroot) {
        if (root == null && subroot == null) {
            return true;
        } else if (root == null || subroot == null || root.data != subroot.data)
            {
                return false;
            }
            if (!isidentical(root.left, subroot.left)) {
                return false;
            }
            if (!isidentical(root.right, subroot.right)) {
                return false;
            }
            return true;
    }

}
