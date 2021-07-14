package Stack;

public class Q2 {

    public static void main(String[] args){

        Stack thestack = new Stack(10);
        thestack.push(10.5);
        thestack.push(11.6);
        thestack.push(20.5);
        thestack.push(30.5);

        System.out.println(thestack.peek());

        while (!thestack.isEmpty()){
            double num1 = thestack.pop();
            System.out.println("Top : "+num1);
        }

    }
}
