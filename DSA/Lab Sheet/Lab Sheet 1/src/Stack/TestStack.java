package Stack;

public class TestStack {
    public static void main(String[] args){
        StackX theStack = new StackX(5);

        theStack.push('A');
        theStack.push('B');
        theStack.push('C');
        theStack.push('D');

        while (!theStack.isEmpty()) {
            char var = theStack.pop();
            System.out.println(var);
        }
        // Order of insertion = A B C D
        // Order of removal = D C B A

        BracketChecker bracketChecker1 = new BracketChecker("3 + (( 6 * 2) – 3)");
        bracketChecker1.check();

    }
}
