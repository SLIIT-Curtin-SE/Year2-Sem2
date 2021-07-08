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

