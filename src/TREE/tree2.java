package TREE;

import java.util.*;

public class tree2 {

    public static class node {
        int data;
        node left;
        node right;

        public node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
        public node(int data , node left, node right){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
       node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);
        root.right.right.right = new node(8);
        root.right.right.right.right = new node(9);

        node root1 =  new node(3);
        root1.left = new node(6);
        root1.right = new node(7);
        root1.right.right = new node(8);

        System.out.println(issubtree(root,root1));
        int k =4;
        levelup(root, 1, k);
    }

    public static void levelup(node root, int level ,int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.println(root.data + " " );
        }
        levelup(root.left, level+1 , k);
        levelup(root.right , level+1 , k);

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
    static class info{
        node Node;
        int hd;
        public info(node Node , int hd){
            Node = this.Node;
            hd = this.hd;
        }
    }
    public static void topview (node root){
        Queue<info> q = new LinkedList<>();
        HashMap<Integer, node> map = new HashMap<>();
        int min = 0 , max = 0;
        q.add(new info(root,0));
        q.add(null);

        while(!q.isEmpty()){
            info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }

            if(!map.containsKey(curr.hd)){
                map.put(curr.hd , curr.Node);
            }

            if(curr.Node.left != null){
                q.add(new info(curr.Node.left , curr.hd -1));
                min = Math.min(min, curr.hd -1);
            }
            if(curr.Node.right != null){
                q.add(new info(curr.Node.right, curr.hd+1));
                max = Math.max(max, curr.hd+1);
            }

        }
        for (int i = min; i < max; i++) {
            System.out.println(map.get(i).data);
        }
        System.out.println();
    }

    public node insert(int value, node Node){
        if(Node == null){
            Node = new node(value);
            return Node;
        }
        if(value < Node.data){
            Node.left = insert(value, Node.left);
        }
        if(value > Node.data){
            Node.right = insert(value ,Node.right);
        }
       return Node;
    }


//    public static node lca(node root , int n1 , int n2){
//        ArrayList<node> path1 = new ArrayList<>();
//        ArrayList<node> path2 = new ArrayList<>();
//
//        getpath(root, n1, path1);
//        getpath(root, n2, path2);
//    }
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
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
                if(root == null){
                    return list;
                }
                inorderTraversal(root.left);
                list.add(root.val);
                inorderTraversal(root.right);
                return list;
        }
    }
}
