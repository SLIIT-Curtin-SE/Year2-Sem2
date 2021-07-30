package com.queueX;

public class QueueX {
    private int [] QueueArr;
    private int maxSize;
    private int rear;
    private int front;
    private int nItems;

    public QueueX(int s) {
        QueueArr = new int[maxSize];
        maxSize = s;
        rear = -1;
        front = 0;
        nItems = 0;
    }

    public void insert(int j){
        if(rear==maxSize-1){
            System.out.println("Queue is full...");
        }
        else{
            QueueArr[++rear] = j;
            nItems++;
        }
    }

    public int remove(){
        if(nItems==0){
            System.out.println("Queue is Empty");
            return -99;
        }
        else{
            nItems--;
            return QueueArr[front++];
        }
    }

    public boolean isEmpty(){
        return (nItems != 0);
    }

    public boolean isFull(){
        return(rear==maxSize-1);
    }

}
