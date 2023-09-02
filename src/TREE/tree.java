package TREE;

import java.util.LinkedList;
import java.util.Queue;

public class tree {
    static class node {
        int data;
        node left;
        node right;
        node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree  {
        static int idx = -1;
        public static node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            node newnode = new node(nodes[idx]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);
            return newnode;
        }

        // preorder root -> left subtree -> right subtree
        public static void preorder (node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + "->");
            preorder(root.left);
            preorder(root.right);
        }
        // inorder left subtree -> root -> right subtree
        public static void inorder (node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + "->");
            inorder(root.right);
        }
        // postorder left subtree -> right subtree -> root
        public static void postorder(node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + "->");
        }

        //ordering tree on the basis of level of order
        public static void levelorder(node root){
            if(root == null){
                return;
            }
            Queue<node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                node currnode = q.remove();
                if(currnode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currnode.data + " ");
                    if(currnode.left != null){
                        q.add(currnode.left);
                    }
                    if(currnode.right != null){
                        q.add(currnode.right);
                    }
                }
            }
        }

    }
    public static int height(node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            int ans = Math.max(lh,rh)+1;
            return ans;
    }

    public static int count(node root){
        if(root == null){
            return 0;
        }
        int countlh = count(root.left);
        int countrh = count(root.right);
        int ans = countlh + countrh+1;
        return ans;
    }

    public static int sum(node root){
        if(root == null){
            return 0;
        }
        int leftsum = 0;
        int rightsum = 0;

        leftsum = sum(root.left);
        rightsum = sum(root.right);
       //here the rooot is the current root of that node not the grand-root


        int ans = leftsum + rightsum + root.data;
        return ans;

    }
    // Diameter of the tree is equal to the maximum distance between two leaf node
    // and it will always passes through root in maximum cases
    
    public static int diameter(node root){
        if(root == null){
            return 0;
        }
        int leftDiam = diameter(root.left);
        int leftht = height(root.left);
        int rightdiam =  diameter(root.right);
        int righht = height(root.right);

        int selfdiam = leftht + righht +1;
        return Math.max(selfdiam, Math.max(leftDiam,rightdiam));
    }
    static class info {
        int diam;
        int ht;
    }


    public static void main(String[] args) {
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        /*node root = tree.buildTree(nodes);
        System.out.println(root.data);
        tree.inorder(root);
        tree.preorder(root);
        tree.postorder(root);
        tree.levelorder(root);*/

        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);
        root.right.right.right = new node(8);

        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(sum(root));
        System.out.println(diameter(root));
    }
}
