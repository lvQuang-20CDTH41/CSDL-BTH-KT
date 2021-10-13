package BTH2;
import java.util.Scanner;
public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList lk = new LinkedList();
//		int n = 1;
//		do {
//			System.out.println("Nhập mã phòng: ");
//			int maphong = sc.nextInt();
//			System.out.println("Nhập tên phòng: ");
//			String tenphong  = sc.next();
//			System.out.println("Nhập tình trạng: ");
//			int tinhtrang = sc.nextInt();
//			System.out.println("Nhập giá phòng: ");
//			int giaphong = sc.nextInt();
//			System.out.println("Nhập ngày thuê: ");
//			String ngaytra = sc.next();
//			System.out.println("Nhập ngày trả: ");
//			String ngaythue = sc.next();
//			lk.AddFirst(new Node(maphong,tenphong,tinhtrang,giaphong,ngaythue,ngaytra));
//			System.out.println("Bạn có muốn nhập tiếp không");
//			n = sc.nextInt();
//		}while(n == 1);
		lk.AddFirst(new Node(1,"phong 01",0,19230,"19/07/1998", "19/07/2020"));
		lk.AddFirst(new Node(2,"phong 02",1,3475,"19/07/1998", "19/07/2020"));
		lk.AddFirst(new Node(3,"phong 03",0,54890,"19/07/1998", "19/07/2020"));
		lk.AddFirst(new Node(4,"phong 04",1,1500,"19/07/1998", "19/07/2020"));
		
		System.out.println("Danh sánh phòng trống");
		lk.EmptyRoom();
		
		System.out.println("Tổng phòng đang được thuê " + lk.RentedRoom());
		// udate
		lk.Update(2, 5,"phong 05",1,20000,"19/07/1990", "12/04/1999");
		lk.PrintList();
		// xoá node cuối
		lk.DeleteAfter();
		lk.PrintList();
	}

}
