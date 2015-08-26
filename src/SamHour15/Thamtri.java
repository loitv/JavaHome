package SamHour15;

public class Thamtri {
	private int number;

	public Thamtri() {
		number = 0;
	}

	public static void swap(Thamtri a, Thamtri b) {
		int tg = a.number;
		a.number = b.number;
		b.number = tg;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int value) {
		number = value;
	}

	public static void swapNumber(int a, int b) {
		int tg = a;
		a = b;
		b = tg;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		Thamtri x = new Thamtri();
		Thamtri y = new Thamtri();
		x.setNumber(10);
		y.setNumber(15);
		System.out.println("Truoc khi thuc hien method swap");
		System.out.println("x = " + x.getNumber() + " y = " + y.getNumber());
		swap(x, y);
		System.out.println("Sau khi thuc hien method swap");
		System.out.println("x = " + x.getNumber() + " y = " + y.getNumber());
		System.out.println("Truoc khi thuc hien method swapNumber");
		System.out.println("So a = " + a + " So b = " + b);
		swapNumber(a, b);
		System.out.println("Sau khi thuc hien method swapNumber");
		System.out.println("So a = " + a + " So b = " + b);
	}
}