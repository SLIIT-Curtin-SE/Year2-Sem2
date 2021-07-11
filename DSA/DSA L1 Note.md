# Lecture 1
# **Introduction to Stacks**

- Allows access to only one data item; the last item inserted 
- if you remove this item, then you can access the next-to-last item inserted

## Application of Stacks 

- String reverse 
- page visited history in web browser
- undo sequence of the text editor 
- Recursive function calling => Ex:
``` public class Main {
   public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
   public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}
```
- Auxiliary data structure for algorithms 
- Stack in memory for a process

# Stack
![stack](https://media.geeksforgeeks.org/wp-content/uploads/geek-stack-1.png)
<br>
- All insertions and deletions are made `at one end(top)`.Insertions and deletions are restricted from the `middle and at the end of the stack.`

- Adding an items is called **push**
- Removing an item is called **pop** 

- Elements are removed from a slack in `the reverse order` of that in which the elements were inserted into the slack

- The elements are inserted and removed according to the `Last-In-First-Out(LIFO)` principle
### Stack-Push
<br><br>
![push](https://www.tutorialspoint.com/data_structures_algorithms/images/stack_push_operation.jpg)

### Stack-Pop
<br><br>
![pop](https://www.tutorialspoint.com/data_structures_algorithms/images/stack_pop_operation.jpg)

### Stack-Peek
<br><br>
![peek](https://qph.fs.quoracdn.net/main-qimg-f22268230c00651b84db79c13bdb7ec9)
- Peek is used to read the value `from the top of the stack without removing it.`
- You can peek `only the top item,` all the other items are invisible to the stack use

## Uses of Stack
- The Stack operations are build into the microprocessor
- When a method is called, its return `address` and `arguments` are pushed onto a stack, and `when it returns they're popped off.`

## Stack - Implementation 
### Stack implementation using an array
- `Constructor creates a new stack` of a size specified in its arguments
- Variable top, which `stores the index of the item on the top of the stack`

```
class StackX{
  private int maxSize;  //size of stack array
  private double[] stackArray;
  private int top;   //top of the stack

  public StackX(int s){   //constructor
    maxSize = s;
    stackArray = new double[maxSize];   
    top = -1;    //no items 

  }

}
```


