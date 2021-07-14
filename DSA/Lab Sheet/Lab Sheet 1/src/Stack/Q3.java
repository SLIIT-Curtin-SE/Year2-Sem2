package Stack;
import java.util.*;
import java.io.*;
import java.util.Stack;

public class Q3 {
    private String inputstr;

    public Q3(String in){
        inputstr = in;
    }

    public void CheckB() {
        int size = inputstr.length();
        Stack bStack = new Stack();

        for (int i = 0; i < size; i++) {
            if (inputstr.charAt(i) == '(') {
                bStack.push('(');
            } else if (inputstr.charAt(i) == ')') {
                double ch3 = (double) bStack.pop();
                if (ch3 != ')') {
                    System.out.println("Invalid String");
                }

            }
        }
        if (!bStack.isEmpty()) {
            System.out.println("Invalid String");
        }
        else {
            System.out.println("Valid String");
        }
    }
}
