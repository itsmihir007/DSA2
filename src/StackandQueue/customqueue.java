package StackandQueue;

public class customqueue {
    private int[] data;
    private static final int Default_size = 10;

    int end = 0;

    public customqueue(){
        this(Default_size);
    }
    public customqueue(int size){
        this.data = new int[size];
    }



    public boolean isfull(){
        return end == data.length;
    }
    public boolean isempty(){
        return end == 0;
    }

    public boolean insert(int item){
        if(isfull()){
            return false;
        }
        data[end++] = item;


        return true;
    }
    public int remove() throws Exception{
        if(isempty()){
            throw new Exception("you queue is empty");
        }
        int removed = data[0];
        for (int i = 0; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front(){
        if(isempty()){
            System.out.println("your queue is empty");
        }

        return data[0];
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + "<-");
        }
        System.out.println("End");
    }
}
