package Stack;

public class Stack {

    private int top;
    private double[] stackArray;
    private int maxSize;

    public Stack(int s) {
        this.top = -1;
        this.stackArray = new double[maxSize];
        this.maxSize = s;
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public void push(double ch){
        if(!isFull()){
            stackArray[++top] = ch;
        }
        else{
            System.out.println("Stack is Full");
        }
    }

    public double pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        }
        else {
            System.out.println("Stack is Empty");
        }
        return 0;
    }

    public double peek(){
        if(!isEmpty()){
            return stackArray[top];
        }
        else{
            System.out.println("Stack is Empty");
        }
        return 0;
    }

}
