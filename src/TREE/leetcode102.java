package TREE;
import java.util.*;
public class leetcode102 {


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
    public List<List<Integer>> levelOrder(TreeNode root) {
          List<List<Integer>> result = new ArrayList<>();
          if(root == null){
              return result;
          }
          Queue<TreeNode> queue = new LinkedList<>();
          queue.offer(root); //add an element in the end of the queue
            while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currentnode = new ArrayList<>(levelsize);

            for (int i = 0; i < levelsize; i++) {
                TreeNode currentNode = queue.poll();
                currentnode.add(currentNode.val);
                if(currentNode.left !=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right !=null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentnode);
            
        }
            return result;
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currentnode = new ArrayList<>(levelsize);
            double averagelevel= 0;
            for (int i = 0; i < levelsize; i++) {
                TreeNode currentNode = queue.poll();
                averagelevel += currentNode.val;
                if(currentNode.left !=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right !=null){
                    queue.offer(currentNode.right);
                }
            }averagelevel = averagelevel/levelsize;
            result.add(averagelevel);
            }
        return result;
        }
    }

