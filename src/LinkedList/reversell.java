package LinkedList;



public class reversell {
    public static class node{
        int data;
        node next;

        public node(int data){
            this.data = data;
        }
        public node(){
            this.data = data;
            this.next = null;
        }
    }
    public static node head;
    public static int size;
    public static node tail;

    public static void addfirst(int data){
        node newnode = new node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public static void print(){
        if(head == null){
            System.out.println(head);
            return;
        }
        node temp = head;
        while(temp!=null  ){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");

    }

    public static void main(String[] args) {
        reversell ll = new reversell();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.print();
        ll.iterativereverse();
        ll.print();
    }
//    private void reverse(node Node){
//       if(Node == tail){
//           tail = head;
//           return;
//       }
//       reverse(Node.next);
//       tail.next = Node;
//       tail = Node;
//       tail.next = null;
//    }
private void iterativereverse() {
    if(head == null ){
        return;
    }
    node prev = null;
    node curr = head;
    node temp ;
    while(curr != null){
        temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
    }
    head = prev;
}
    //reversing the linkedlist between two given node
    public static node reverselinkedlist(node head, int left, int right){
        if(left == right){
            return head;
        }
        node curr = head;
        node prev = null;
        // this was used for skipping first rest part
        for (int i = 0; curr!=null &&i < left - 1; i++) {
            prev = curr;
            curr = curr.next;
        }
        node last = prev;
        node newend = curr;
        node next = curr.next;
        for (int i = 0;curr!=null && i < right - left + 1; i++) {
            while(curr!= null){
                curr.next = prev;
                prev = curr;
                curr = next;
                if(next !=null){
                    next = next.next;
                }
            }
            if(last != null){
                last.next = prev;
            }
            else{
                head = prev;
            }
            newend.next  = curr;

        }
        return head;
    }
}
