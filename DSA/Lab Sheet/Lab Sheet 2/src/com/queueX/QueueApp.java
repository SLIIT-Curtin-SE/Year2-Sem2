package com.queueX;
import java.util.*;
public class QueueApp {
    public static void main(String[] args){
        QueueX mainQueue = new QueueX(5);
        Scanner sc = new Scanner(System.in);
        int Str;

        for (int i=1;i<=5;i++){
            System.out.print("Enter Transaction ID "+i+ ":");
            Str = sc.nextInt();
            mainQueue.insert(Str);
        }

        QueueX evenQueue = new QueueX(5);
        QueueX oddQueue = new QueueX(5);
        int value;

        while(mainQueue.isEmpty()){
            value = mainQueue.remove();
            if (value%2==0){
                evenQueue.insert(value);
            }
            else{
                oddQueue.insert(value);
            }
        }
        System.out.println("PC 1");
        while (evenQueue.isEmpty()){
            System.out.println("Transaction "+ evenQueue.remove());
        }
        System.out.println("PC 2");
        while (oddQueue.isEmpty()){
            System.out.println("Transaction "+oddQueue.remove());
        }

    }
}
