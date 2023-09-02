package StackandQueue;

public class queuemain {
    public static void main(String[] args) throws Exception {
        customqueue queue = new customqueue();
        //first part say which type of function you can run and second one says how can be accessed
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.display();
        System.out.println(queue.remove());
queue.display();
    }
}
