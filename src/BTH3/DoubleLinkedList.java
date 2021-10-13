package BTH3;


public class DoubleLinkedList {
	Node first, last, firstk,lastk;
	DoubleLinkedList(){
		first = last = null;
	}
	// thêm cuối danh sách
	public void AddLast(int data) {
		Node node = new Node(data);
		this.AddLast(node);
	}
	public void AddLast(Node node) {
		if(first == null) {
			first = last = node;
		}else {
			last.next = node;
			node.prev = last;
			last = node;
			node.next = null;
		}
	}
	// b.	�?ếm xem có bao nhiêu phần tử có giá trị x, với x là tham số truy�?n vào.
	public int Countx(int data) {
		Node node = first;
		int count = 0;
		while(node != null) {
			if(node.data == data) {
				count++;
			}
			node = node.next;
		}
		return count;
	}
	//c.	Hãy kiểm tra danh sách theo thứ tự giảm dần hay không.
	public boolean CheckSort() {
		Node c = first;
		if (c != null) {
			while (c.next != null) {
				if (c.data < c.next.data) {
					return false;
				}
				c = c.next;
			}
			return true;
		} else {
			return false;
		}
	}
	//d.	Hãy chèn 1 phần từ có giá trị x vào đầu danh sách, với x là tham số truy�?n vào.
	public void AddFirst(int data) {
		Node node = new Node(data);
		AddFirst(node);
	}
	public void AddFirst(Node node) {
		if(first == null)first = last = node;
		else {
			node.next = first;
			first.prev = node;
			first = node;
		}
	}
	//e. Hãy xóa phần tử cuối cùng có giá trị x trong danh sách, với x là tham số truy�?n vào.
	public Node Find(int data) { // tìm kiếm khoá k có trong danh sách không
		Node node = first;
		while(node != null) {
			if(node.data == data)return node;
			node = node.next;
		}
		return null;
	}
	public Node Find(Node node) {
		return Find(node.data);
	}
	public void DeleteFirst() { // xoá đầu
		if (first == null) return;
		first = first.next;
		if (first == null) last = null;
	}
	public void DeleteAfter() { // xoá cuối
        if (first == null) return;
        if (first.next == null) {
            this.DeleteFirst();
            return;
        }
        last.prev.next = null;
        last = last.prev; 
	}
	public void DeleteLastK(int data) { 
		Node node = new Node(data);
		DeleteLastK(node);
	}
	public void DeleteLastK(Node node) { // xoá sau k
		Node k = Find(node);
		if(k == null) {
			System.out.println("Danh sach rong");
			return;
		}
		if(k.next == null) {
			System.out.println("k không có phần tử sau");
			return;
		}
		if (k.next.next == null) {
            this.DeleteAfter();
            return;
      	}
		k.next = k.next.next;
		k.next.prev = k;
	}
	//f.	Hãy tạo một danh sách mới L1 chỉ để chứa các số chẳn và chia hết cho 3 từ danh sách L.
	public void NewNode() {
		Node L = first;
		Node L1 = null;
		while(L != null) {
			if(L.data % 2 == 0 && L.data %3 == 0) {
				L1 = new Node(L.data);
				if(firstk == null)firstk = lastk = L1;
				else {
					L1.next = firstk;
					firstk.prev = L1;
					firstk = L1;
				}
			}
			L = L.next;
		}
		System.out.println("\nDanh sách số chẵn và chia hết cho 3: ");
		while(L1 != null) {
			L1.printNode();
			L1 = L1.next;
		}
	}
	// hien thi
	public void PrintList() {
		Node node = first;
		while(node != null) {
			node.printNode();
			node = node.next;
		}
	}
}
