class LabOne<T> {

	private int top;
	private int max;
	private Object[] array;
	
	public LabOne(int size) {
		this.max = size;
		this.array = new Object[max];
		this.top = -1;
	}
	
	public void push(double n) {
		if(top == max -1 ) return;
		array[++top] = n;
	}
	
	public void pop() {
		if(top == -1) return;
		--top;
	}
	
	public T peek() {
		return (T)array[top];
	}
	
	public boolean isEmpty() {
		if(top == -1) return true;
		return false;
	}
	
}
