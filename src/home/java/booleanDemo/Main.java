package home.java.booleanDemo;

public class Main {

	public static boolean isEqual(int a, int b) {
		if (a == b) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int a = 5, b = 5;
		boolean c = isEqual(a,b);
		System.out.println(c);
	}
}
