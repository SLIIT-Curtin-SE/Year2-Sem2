package com.Lab4;

public class Tree {
    private Node root;

    public void insert(int Eno, String Name){
        Node newNode = new Node();
        newNode.EmpNo = Eno;
        newNode.name = Name;

        if(root==null){
            root = newNode;
        }
        else{
            Node current = root;
            Node parent;

            while (true){
                parent = current;
                if (Eno<current.EmpNo){
                    current=current.leftChild;
                    if (current==null){
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else {
                    current = current.rightChild;
                    if(current==null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }
    private void inOrder(Node localRoot){
        if(localRoot != null){
            inOrder(localRoot.leftChild);
            localRoot.displayNode();
            inOrder(localRoot.rightChild);
        }
    }
    public void TraverseinOrder(){
        inOrder(root);
    }
    private void
}
