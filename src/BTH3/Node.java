package BTH3;

public class Node {
	Node next, prev;
	int data;
	Node(int data){
		this.data = data;
	}
	public void printNode() {
		System.out.print(this.data + " ");
	}
}
