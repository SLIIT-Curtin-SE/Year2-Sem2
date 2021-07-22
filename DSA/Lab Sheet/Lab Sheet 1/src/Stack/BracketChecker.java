package Stack;

public class BracketChecker {

    private String input;

    public BracketChecker(String in){
        input = in;
    }
    public void check(){
        int size = input.length();
        StackX Bstack = new StackX(size);

        for (int i=0;i<size;i++){
            if(input.charAt(i)=='('){
                Bstack.push('(');
            }
            else if (input.charAt(i)==')'){
                char ch3 = Bstack.pop();
                if (ch3 != ')'){
                    System.out.println("Invalid String");
                }
            }
        }
        if (Bstack.isEmpty()){
            System.out.println("Invalid String");
        }
        else {
            System.out.println("Valid String");
        }
    }

}
