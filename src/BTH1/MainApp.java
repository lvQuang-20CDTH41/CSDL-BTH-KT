package BTH1;

public class MainApp {
	public static int LuyThua(int x, int n) {
		    if (n == 0) return 1;
		    else if (n % 2 == 0) return (int)Math.pow(LuyThua(x, n/2), 2);
		    else return (int) (x * Math.pow(LuyThua(x, (n - 1) / 2), 2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ket qua: " + LuyThua(2,8));
	}

}
