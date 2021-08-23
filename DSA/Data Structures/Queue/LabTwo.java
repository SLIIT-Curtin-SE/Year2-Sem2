class Queue<T> {
	private int maxSize;
	private int front;
	private int rear;
	private int noElements;
	private Object[]	queArr;
	
	public Queue(char size) {
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

class LabTwo {

	public static void main(String[] args) {
		Queue<Character> q = new Queue<Character>('a');
		q.insert('a');
		q.insert('b');
		q.insert('c');
		System.out.println(q.peekFront());
		q.insert('d');
		q.remove();
		System.out.println(q.peekFront());
		q.remove();
		System.out.println(q.peekFront());
	}

}
