class Stack<T> {

	private int top;
	private int max;
	private Object[] array;
	
	public Stack(int size) {
		this.max = size;
		this.array = new Object[max];
		this.top = -1;
	}
	
	public void push(double n) {
		if(top == max -1 ) return;
		array[++top] = n;
	}
	
	public T pop() {
		if(top == -1) return null;
		return (T)array[--top];
	}

	public T peek() {
		return (T)array[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

}

class LabOne {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>(10);
		stack.push(1);
		System.out.println(stack.peek());
		stack.push(2);
		System.out.println(stack.peek());
		stack.push(3);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.push(4);
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		stack.push(5);
		stack.pop();
		System.out.println(stack.peek());
	}

}
