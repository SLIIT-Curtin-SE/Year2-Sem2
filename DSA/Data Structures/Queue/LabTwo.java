class LabTwo<T> {
	private int maxSize;
	private int front;
	private int rear;
	private int noElements;
	private Object[]	queArr;
	
	public LabTwo(char size) {
		queArr = new Object[size];
		noElements = 0;
		rear = -1;
		front = 0;
		maxSize = size;
	}
	
	public void insert(char n) {
		if (noElements == maxSize)
			return;
		if (rear == maxSize - 1)
			rear = -1;
		queArr[++rear] = n;
		++noElements;
	}
	
	public T remove() {
		if (noElements == 0)
			return null;
		if (front == maxSize) {
			front = 0;
			--noElements;
			return (T)queArr[front];
		}
		--noElements;
		return (T)queArr[++front];
	}
	
	public T peekFront(){
		return (T)queArr[front];
	}
	
}
