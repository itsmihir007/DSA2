package LinkedList;

public class doublyll {
    public static class node{
        int data;
        node next;
        node prev;

        public node(int data , node next){
            this.data = data;
            this.next = null;
            // this.prev = null;
        }
        public node(){
            this.data = data;
            this.next = next;
        }
        public node(int data){
            this.data = data;
        }

    }
    public static node head;
    public static node tail;
    public static int size;

    public static void addfirst(int data){
        node newnode = new node(data);
        size++;
        if(head==null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
     //  head.prev = newnode; //incase of doubly linked list
         head = newnode;
    }
    public static void print(){
        node temp = head;
        while(temp!= null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static int remove(){
        if(head == null){
            System.out.println("doubly linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(size ==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head= head.next;
        head.prev = null;
        size--;
        return val;

    }
    public static void reverse(){
            node prev=null;
            node curr = head;
            node next;
            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                curr.prev = next;

                prev = curr;
                curr = next;
            }
            head = prev;
    }
    public node getintersectionnode(node head1 , node head2){
        while(head1!=null){
            node temp = head1;
            while(temp!= null){
                if(temp == head2){
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }


    public static void main(String[] args) {
        doublyll list = new doublyll();
        node head1 ,head2;
        head1 = new node();
        head2 = new node();

        node newNode = new node();
        head2.next = newNode;
        newNode = new node();
        head2.next.next = newNode;
        newNode = new node();
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new node();
        head1.next.next = newNode;
        head1.next.next.next = null;

    node intersectionpoint = list.getintersectionnode(head1,head2);
    if(intersectionpoint == null){
        System.out.println("no intersection point found");
    }
    else{
        System.out.println("Intersection point:" + intersectionpoint.data);
    }
//        doublyll stack = new doublyll();
//        stack.push(11);
//        stack.push(10);
//        stack.push(8);
//        stack.push(6);
//        stack.push(4);
//        stack.push(13);
//
//        System.out.println("Linked List");
//        stack.printlist();
//        stack.evenodd();
//        stack.printlist();

        doublyll stacks = new doublyll();
        stacks.addfirst(4);
        stacks.addfirst(6);
        stacks.addfirst(7);
        stacks.addfirst(9);
        stacks.addfirst(3);

        stacks.printlist();
        stacks.addinmiddle(99,3);
        stacks.printlist();


//
//        head = null;
//        int M=2, N=3;
//        head=push(head, 12);
//        head=push(head, 11);
//        head=push(head, 10);
//        head=push(head, 9);
//        head=push(head, 8);
//        head=push(head, 7);
//        head=push(head, 6);
//        head=push(head, 5);
//        head=push(head, 4);
//        head=push(head, 3);
//        head=push(head, 2);
//        head=push(head, 1);
//        skipndelete(head , 2,3);
//        System.out.printf("M = %d, N = %d \n" +
//                "Linked list we have is :\n", M, N);
//        printlist();
    }

//    public static node push(node head_ref , int data){
//        node newnode = new node();
//        newnode.data = data;
//        newnode.next = (head_ref);
//        head_ref = newnode;
//        return head_ref;
//    }

    static void printlist(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void skipndelete(node head , int m , int n){
      node curr = head,t;
      int count;
        for (count = 0; count <=m && curr!=null; count++) {
          //  curr = curr.next;
            System.out.print("Count is" + count + " ");
            System.out.print(curr.data+ "->");
            curr = curr.next;
        }
        if(curr ==null || curr.next ==null){
            return;
        }
        t = curr.next;
        for (count = 0; count <= n && t!=null; count++) {
            node temp = t;// VVIP in this temp stores all the useless data
            t = t.next;
            System.out.println(temp.data);
        }
        curr.next = t;
        curr = t;
    }
    //swapping the nodes with the given index number
    public static void swap(int x , int y ){ //x = 3 y = 5
        if(x == y){
            return;
        }
        node temp1 = null, currx1 = head;
        while(currx1 != null && currx1.data !=x){
            temp1 = currx1;
            currx1 = currx1.next;
        }
        //we will get the value of x in temp1

        node temp2 = null , curry1 = head;
        while(curry1 != null && curry1.data != y){
            temp2 = curry1;
            curry1 = curry1.next;
        }
        //we will get the value of y in temp2
        if(curry1==null && currx1 ==null){
            return;
        }

        // X = X1 = CURRX1
        // Y = Y1 = CURRY1


        //if both value is null then return nothing
        if(temp1 != null)
            temp1.next = curry1;
        else head = curry1;
        //in this process
        if(temp2 != null)
            temp2.next = currx1;
        else head = currx1;

        node temp = currx1.next;
        currx1.next = curry1.next;
        curry1 = temp;
    }
    static void evenodd(){
        node end = head;
        node prev = null;
        node curr = head;

        while(end.next!= null)
            end = end.next;

        node x = end;
        while(curr.data % 2 != 0 && curr!=end){
            x.next = curr;
            curr = curr.next;
            x.next.next = null;
            x = x.next;
        }

        if(curr.data % 2 == 0 ){
            head = curr;
            while(curr!=end){
                if(curr.data % 2 == 0){
                    prev = curr;
                    curr = curr.next;
                }
                else{
                    prev.next = curr.next ;
                    curr.next = null;
                    x.next = curr;
                    x = curr;
                    curr = prev.next;
                }
            }
        }
        else prev = curr;
        if(x != end && end.data % 2 != 0){
            prev.next = end.next;
            end.next = null;
            x.next = end;
        }
    }
    static void push(int data){
        node newnode = new node(data);
        newnode.next = head;
        head = newnode;

    }
    static void insertlast(int data){
        if(tail == head){
            addfirst(data);
            return;
        }
        node newnode = new node(data);
        tail.next = newnode;
        newnode = tail;
        size++;
    }
    static void addinmiddle(int data , int index){
        if(index == 0){
            addfirst(data);
            return;
        }
        if(index ==size){
            insertlast(data);
            return;
        }
        node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node newnode = new node(data , temp.next);
        temp.next = newnode;
        size++;
    }






















}
   // doublyll dll = new doublyll();
//        dll.addfirst(1);
//        dll.addfirst(2);
//        dll.addfirst(3);
//
//        dll.print();
//        dll.reverse();
//        dll.print();
