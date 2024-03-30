package TREE;

public class segmenttree {
    public static class node{
        int data;
        int startInterval;
        int endInterval;
        node left;
        node right;

        public node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
    node root;

    public segmenttree(int []arr ){
       this.root = constructTree(arr,0,arr.length-1);
    }
    public node constructTree(int []arr , int start, int end){
         if(start == end){
             node leaf = new node(start, end);
             leaf.data = arr[start];
             return leaf;
         }
         node Node = new node(start, end);
         int mid = (start + end)/2;
         Node.left = this.constructTree(arr,start,mid);
         Node.right = this.constructTree(arr,mid+1, end);
         Node.data = Node.left.data + Node.right.data;

         return Node;
    }

    public void display(node Node){
        String str = "";

        if(Node.left != null){
            str = str + "Interval = [" + Node.left.startInterval + "-" + Node.left.endInterval + "] and data: " + Node.left.data + "+ ->";

        }
        else{
            str = str + "no left child";
        }
        str = str + "Interval=[" + Node.left.startInterval + "-" + Node.left.endInterval + "] and data: " + Node.left.data + "+ ->";
        if(Node.right != null){
            str = str + "Interval = [" + Node.right.startInterval + "-" + Node.right.endInterval + "] and data: " + Node.right.data + "+ ->";

        }
        else{
            str = str + "no right child";
        }
        System.out.println(str);
        if(Node.left !=null){
            display(Node.left);
        }
        if(Node.right!=null){
            display(Node.right);
        }
    }
}
