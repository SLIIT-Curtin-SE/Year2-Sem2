package com.Lab4;

public class Node {

    public String name;
    public int EmpNo;

    public Node leftChild;
    public Node rightChild;

    public void displayNode(){
        System.out.println("Employee No: "+EmpNo+"Name: "+name);
    }
}
