package StackandQueue;


public class customstack2 {
    private int []data;
    private int top;

    public customstack2(){
        data = new int[10];
        top =-1;
    }
    public customstack2(int capacity){
        data = new int[capacity];
        top = -1;
    }
    public boolean isempty(){
        if(top ==-1){
            return true;
        }
        return false;
    }
    public int top() throws stackException {
        if(size() == 0){
            stackException e = new stackException("Stack is empty");
            throw e;
        }
        return data[top];
    }
    public int size() {

        return top + 1;
    }
    public void push(int elem) {
        if(size() == data.length){
          doublecapacity();
        }
        top++;
        data[top] = elem;

    }
    public void doublecapacity(){
        int []temp = data;
        data = new int[2*temp.length];
        for (int i = 0; i <=top; i++) {
            data[i] = temp[i];
        }
    }
    public int pop()throws stackException{
        if(size() == 0){
            stackException m = new stackException("Stack is empty");
            throw m;
        }
        int temp = data[top];
        top--;
        return temp;


    }
    public class stackException extends Exception{
        public stackException(String message){
            super(message);
        }


}


    }
