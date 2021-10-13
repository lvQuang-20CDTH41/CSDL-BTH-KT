package BTH2;

public class Node {
	Node next;
	int maphong, tinhtrang, giaphong;
	String tenphong,ngaythue, ngaytra;
	Node(int maphong, String tenphong, int tinhtrang, int giaphong, String ngaythue, String ngaytra){
		this.maphong = maphong;
		this.tinhtrang = tinhtrang;
		this.giaphong = giaphong;
		this.ngaythue = ngaythue;
		this.ngaytra = ngaytra;
		this.tenphong = tenphong;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

	public int getMaphong() {
		return maphong;
	}
	public void setMaphong(int maphong) {
		this.maphong = maphong;
	}
	public int getTinhtrang() {
		return tinhtrang;
	}
	public void setTinhtrang(int tinhtrang) {
		this.tinhtrang = tinhtrang;
	}
	public int getGiaphong() {
		return giaphong;
	}

	public void setGiaphong(int giaphong) {
		this.giaphong = giaphong;
	}
	public String getTenphong() {
		return tenphong;
	}
	public void setTenphong(String tenphong) {
		this.tenphong = tenphong;
	}
	public String getNgaythue() {
		return ngaythue;
	}
	public void setNgaythue(String ngaythue) {
		this.ngaythue = ngaythue;
	}
	public String getNgaytra() {
		return ngaytra;
	}
	public void setNgaytra(String ngaytra) {
		this.ngaytra = ngaytra;
	}
	public void PrintNode() {
		System.out.println("Khach san:  maphong = " + maphong + ", tenphong = " + tenphong + ", tinhtrang = " + tinhtrang + ", giaphong = " + giaphong
				+ ", ngaythue = " + ngaythue + ", ngaytra = " + ngaytra);
	}
}
