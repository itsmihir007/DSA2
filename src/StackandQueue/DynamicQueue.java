package StackandQueue;

public class DynamicQueue extends circularqueue{
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }
    @Override
    public boolean insert(int item){
        if(isfull()){
            //double the array size so that we can fit more element
            int [] temp = new int[data.length*2];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = data[front +i];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
return super.insert(item);
    }
}
