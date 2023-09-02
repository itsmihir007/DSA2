package TREE;

import java.util.Stack;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
public class tree1 {



        protected static class Node {
            int data;
            Node left;
            Node right;

            Node(int data, Node left , Node right){
                this.data = data;
                this.left = left;
                this.right = right;
            }
        }
        public static class pair{
            Node node ;
            int state;
            pair(Node node, int state){
                this.node = node ;
                this.state = state;
            }



            public static void main(String[] args) throws Exception{
                Integer [] arr = {50,25,12,null,null,37,30,null
                        ,null, null,null,75,62,null, 70, null, null, 87,null,null};
                Stack<pair> st = new Stack<>();
                Node root = new Node(arr[0],null,null);
                pair rootpair = new pair(root, 1);
                st.push(rootpair);
                int idx = 0;
                while(st.size()>0){
                    pair top = st.peek();
                    if(top.state == 1){
                        idx++;
                        if(arr[idx] != null){
                            top.node.left= new Node(arr[idx],null,null);

                            pair lp = new pair(top.node.left,1);
                            st.push(lp);
                        }else{
                            top.node.left = null;

                        }
                        top.state++;
                    }else if(top.state == 2){
                        idx++;
                        if(arr[idx] != null){
                            top.node.right = new Node(arr[idx],null,null);

                            pair rp = new pair(top.node.right, 1);
                            st.push(rp);
                        }else{
                            top.node.right = null;

                        }
                        top.state++;
                    }
                    else{
                        st.pop();
                    }
                }
                display(root);
            }
            public static void display (Node node){
                if(node == null){
                    return;
                }
                String str = " ";
                str += node.left == null ? "." : node.left.data +"" ;
                str += " <- " + node.data + "->";
                str += node.right ==null ? "." : node.right.data + "" ;
                System.out.println(str);
                display(node.left);
                display(node.right);
            }
        }




}
