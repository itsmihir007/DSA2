package StackandQueue;

public class queueusingarray {
    private int data[];
    private int size;
    private int front;
    private int rear;
    public queueusingarray(){
        data = new int[10];
        size = 0;
        front = -1;
        rear = -1;
    }
    public queueusingarray(int capacity){
        data = new int[capacity];
        size = 0;
        front = -1;
        rear = -1;
    }
    int size(){
        return size;
    }
    boolean isempty(){
//        if(data.length ==0) {
//            return true;
//        }
//        return false;
        return size ==0;
    }

    int front(){
        if(size ==0){
            front = -1;
        }
        return data[front];
    }

    int enqueue(int val) throws fullexception{
        if(size == data.length){
            throw new fullexception("your queue is full");
        }
        if(size == 0){
            front = 0; //earliar it was at -1 pos
        }

        size++;
        rear = (rear +1) % data.length;
        data[rear] = val;
        return data[rear];
    }
    void dequeue() throws fullexception{
        if(size == 0){
            throw new fullexception("queue is empty");
        }
        size--;
        int temp = data[front];
        front++;
        if(size ==0){
            front= -1;
            rear = -1;
        }
    }
    void fullcapacity(){
        int [] temp = data;
        data = new int[2 * data.length];
        int index = 0;
        for (int i = front; i < data.length; i++) {
            data[index] = temp[i];
            index++;
        }
        for (int i = 0; i <= front -1; i++) {
            data[index] = temp[i];
            index++;
        }
        front = 0;
        rear = data.length-1;
    }

}
