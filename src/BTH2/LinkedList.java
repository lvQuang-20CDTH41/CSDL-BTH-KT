package BTH2;
public class LinkedList {
	Node first;	
	LinkedList(){
		first = null;
	}
	//b.	Viết hàm in ra các phòng còn trống.
	// Giả sử 0 là không có khách, 1 là có khách
	public void EmptyRoom() {
		Node node = first;
		while(node!=null) {
			if(node.getTinhtrang() == 0) {
				node.PrintNode();
			}
			node = node.next;
		}
	}
	//c.	Viết hàm đếm xem có bao nhiêu phòng đang được thuê
	public int RentedRoom() {
		Node node = first;
		int count = 0;
		while(node!=null) {
			if(node.getTinhtrang() == 1) {
				count++;
			}
			node = node.next;
		}
		return count;
	}
	//d.	Viết hàm cập nhật lại thông tin phòng với mã phòng, tên phòng, tình trạng, giá phòng, ngày thuê, ngày trả là tham số truyền vào.
	public void Update(int mk,int maphong, String tenphong, int tinhtrang, int giaphong, String ngaythue, String ngaytra) {
		Node node = first;
		while(node != null) {
			if(node.getMaphong() == mk) {
				node.setMaphong(maphong);
				node.setTenphong(tenphong);
				node.setTinhtrang(tinhtrang);
				node.setGiaphong(giaphong);
				node.setNgaythue(ngaythue);
				node.setNgaytra(ngaytra);
			}
			node = node.next;
		}
	}
	// e.	Viết hàm thêm 1 phòng vào đầu danh sách.
	public void AddFirst(Node node) {
		node.next = first;
		first = node;
	}
	public void PrintList() {
		Node node = first;
		while(node != null) {
			node.PrintNode();
			node = node.next;
		}
	}
	// f.	Viết hàm xóa phòng ở cuối danh sách.
	public void DeleteAfter() {
		 if (first == null) return;
		 if(first.next == null) {
			 first = null;
			 return;
		 }
         Node node = first;
         while (node != null) 
         { 
	        if(node.next.next == null) {
	       	 	node.next = null;
	        }
        	 node = node.next;
         }     
	}
}
