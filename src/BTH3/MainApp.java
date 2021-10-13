package BTH3;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoubleLinkedList lk = new DoubleLinkedList();
		lk.AddLast(12);
		lk.AddLast(8);
		lk.AddLast(6);
		lk.AddLast(5);
		lk.AddLast(3);
		lk.AddLast(1);
		lk.PrintList();
		System.out.println("\nNhập số muốn đếm: ");
		int x = sc.nextInt();
		System.out.printf("Số phần tử có giá trị %d : " + lk.Countx(x), x);
		
		String kq = (lk.CheckSort() == true) ? "Có" : "không";
		System.out.println("\nDanh sách có giảm dần k: " + kq);
			
		System.out.println("Thêm đầu danh sách");
		lk.AddFirst(20);
		lk.PrintList();
		
		System.out.println("\nXoa phan tu sau k: ");
		int k = sc.nextInt();
		lk.DeleteLastK(k);
		System.out.println("Danh sach sau khi xoa");
		lk.PrintList();
		
		lk.NewNode();
		
	}

}
