package StackandQueue;

public class circularqueue {
    public int[] data;
    private static final int Default_size = 10;

    int end = 0;
    protected int front = 0;
    private int size =0;


    public circularqueue(){
        this(Default_size);
    }
    public circularqueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isfull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isempty()){
            throw new Exception("you queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    public int front(){
        if(isempty()){
            System.out.println("your queue is empty");
        }
        return data[front];
    }
    public void display(){
        if(isempty()){
            System.out.println("queue is empty");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i] + "->");
            i++;
            i %= data.length;
        } while(i!=end);
        System.out.println("END");
    }


    public boolean isfull(){
        return size == data.length;
    }
    public boolean isempty(){
        return size == 0;
    }

    public static void main(String[] args) throws Exception {
        circularqueue x = new circularqueue();
        x.insert(1);
        x.insert(2);
        x.insert(3);
        x.insert(4);
        x.insert(5);
        x.display();
        System.out.println(x.remove());
        x.insert(133);
        x.display();
    }
}
