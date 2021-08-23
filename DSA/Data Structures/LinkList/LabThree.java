class List<T> {

	public T data;
	public List next;
	
	public List(T n) {
		this.data = n;
		this.next = null;
	}

	public void display() {
		System.out.println(this.data);
	}

}

class LinkList<T> {

	private List first;

	public LinkList() {
		this.first = null;
	}

	public void insertFirst(T n) {
		List current = new List(n);
		current.next = first;
		first = current;
	}
	
	public void deleteFirst() {
		List current = first;
		first = current.next;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void displayAll() {
		List current = first;
		while(current.next != null){
			//System.out.print(current.data);
			current.display();
			current = current.next;
		}
	}

	public void insertMid(T id, int n) {
		List current = first;
		while(current.next != null){
			if(current.data == id) {
				List tmp = current;
				List e = new List(n);
				//e.next = current;
				e.next = tmp.next;
				//current.next = tmp.next;
				current.next = e;
				break;
			}
			current = current.next;
		}
	}

	public void insertAfter(T id, int n) {
		List current = first;
		while(current.next != null){
			if(current.data == id) {
				List tmp = current;
				List e = new List(n);
				e.next = tmp.next.next;
				current.next.next = e;
				break;
			}
			current = current.next;
		}
	}
	
		public void delete(T id) {
		List current = first;
		List pervies = current;
		while(current.next != null){
			if(current.data == id) {
				List tmp = current;
				pervies.next = current.next;
				break;
			}
			pervies = current;
			current = current.next;
		}
	}
	
	public List find(T id) {
		List current = first;
		while(current.next != null){
			if(current.data == id) {
				return current;
			}
			current = current.next;
		}
		
		return null;
	}

}

class LabThree {

	public static void main(String[] args){
        LinkList listOne = new LinkList();
		listOne.insertFirst(100);
		listOne.insertFirst(200);
		listOne.displayAll();
	}

}
