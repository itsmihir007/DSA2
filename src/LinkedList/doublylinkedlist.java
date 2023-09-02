package LinkedList;

public class doublylinkedlist {
    public static class node{
        int data;
        node next;
        node prev;


        public node(int data,node next){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
        public node(int data){
            this.data = data;
        }
        public node(){
            this.data = data;
            this.next = next;
        }
    }
    public static node head;
    public static node tail;
    public static void main(String[] args) {

    }
    public static void addfirst(int data){
        node newnode = new node(data);
        if(head == null){
            newnode = head = tail;
            return;
        }
        head.prev = newnode;
        newnode.prev = null;

    }
}
