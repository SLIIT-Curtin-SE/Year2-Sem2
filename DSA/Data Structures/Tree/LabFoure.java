class Node<T> {

	public int index;
	public T data;
	public Node max;
	public Node min;
	
	public Node() {}
	
	public Node(int index, T data) {
		this.index = index;
		this.data = data;
	}

	public void display() {
		System.out.println(this.index + " : " + this.data);
	}

}

class Tree<T> {

	private Node root;
	
	public Tree() {
		root = null;
	}
/*	
	public void insert(int index, T data) {
		
		Node newNode = new Node(index, data);
		
		if (root == null) {
			root = newNode;
			return;
		}
		
		Node current = root;
		
		while(true) {
			Node pervies = current;
			
			if (index > current.index) {
				current = current.max;
				
				if (current != null) {
					continue;
				}
				
				pervies.max = newNode;
				return;
			}
			
			current = current.min;
			
			if (current != null) {
				continue;
			}
			
			pervies.min = newNode;
			return;
		}
	}
	
	public void display(int index) {
		if (root == null) {
			System.out.println("sorry rool is null");
			return;
		}
		
		Node current = root;
		
		while(true) {
			Node pervies = current;
			
			if (index > current.index) {
				current = current.max;
				
				if (current.index != index) {
					continue;
				}
				
				current.display();
				return;
			}
			
			current = current.min;
			
			if (current.index != index) {
				continue;
			}
			
			current.display();
			return;
		}
	}
*/
	public void insert(int index, T data) {

		Node newNode = new Node(index, data);

		if (root == null) {
			root = newNode;
			return;
		}
		
		Node current = root;
		
		while(true) {
			Node pervies = current;

			if (index > current.index) {
				current = current.max;
			} else {
				current = current.min;
			}

			if (current == null) {
				if (index > pervies.index) {
					pervies.max = newNode;
				} else {
					pervies.min = newNode;
				}
				return;
			}
		}

	}

	public void display(int index) {
		
		if (root == null) {
			System.out.println("sorry rool is null");
			return;
		}

		Node current = root;

		while(true) {
			if (index > current.index) {
				current = current.max;
			} else {
				current = current.min;
			}

			if (current.index != index) {
				continue;
			} else {
				current.display();
				return;
			}
		}	

	}

}

class LabFoure {

	public static void main(String []args) {
		Tree tree = new Tree();
		tree.insert(2, 5);
		tree.insert(3, 7);
		tree.insert(10, 5);
		tree.insert(5, 10);
		tree.insert(12, 5);
		tree.display(3);
		tree.display(10);
		Tree treeT = new Tree();
		treeT.insert(2, "foo");
		treeT.insert(5, "boo");
		treeT.insert(8, "coo");
		treeT.insert(9, "zoo");
		treeT.display(5);
		treeT.display(8);
	}
	
}
