package Stack;

public class StackX {
    private int top;
    private char[] stackArray;
    private int maxSize;

    public StackX(int s){
        this.top = -1;
        this.maxSize = s;
        this.stackArray = new char[maxSize];
    }
    public boolean isFull(){
        if (top == maxSize -1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(char j){
        if(!isFull()){
            stackArray[++top] = j;
        }
        else{
            System.out.println("Stack is Full!");
        }
    }
    public char pop(){
        if(!isEmpty()){
            return stackArray[top--];
        }
        else {
            System.out.println("Stack is Empty!");
        }
        return 1;
    }
    public char peek(){
        if(!isEmpty()){
            return stackArray[top];
        }
        else {
            System.out.println("Stack is Empty!");
        }
        return 1;
    }

}