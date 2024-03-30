package TREE;

import java.util.*;

public class POTD {
    public class Node {
        int data;
        Node left;
        Node right;

        Node() {
        }

        Node(int data) {
            this.data= data;
        }

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
        class Solution
        {
            static ArrayList<Integer> ans;
            static HashSet<Integer> set;
            Solution(){
                ans = new ArrayList<>();
                set = new HashSet<>();
            }

            public static ArrayList<Integer> findCommon(Node root1,Node root2)
            {
                preorder(root1);
                preorder(root2);
                Collections.sort(ans);
                return ans;
            }
            public static void preorder(Node root){
                if(root == null){
                    return ;
                }
                if(set.contains(root.data)){
                    ans.add(root.data);
                }else{
                    set.add(root.data);
                }
                preorder(root.left);
                preorder(root.right);
            }
        }
        Node buildBalancedTree(Node root){

            ArrayList<Integer> list = new ArrayList<>();
            inOrderTraversal(root, list);
            Node newRoot = sortedArrayBST(0, list.size() -1 ,  list);

            return newRoot;
        }
        private void inOrderTraversal(Node root , ArrayList<Integer> list){
            if(root == null){
                return;
            }
            inOrderTraversal(root.left , list);
            list.add(root.data);
            inOrderTraversal(root.right, list);
        }
        private Node sortedArrayBST(int start, int end, ArrayList<Integer> list){
            if(start > end){
                return null;
            }
            int mid = (start + end) / 2 ;
            Node root = new Node(list.get(mid));
            root.left = sortedArrayBST(start, mid-1, list);
            root.right = sortedArrayBST(mid+1 , end, list);
            return root;
        }
    }
}
