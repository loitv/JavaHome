import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList student = new ArrayList();
		String str1 = "Loi";
		String str2 = "Lien";
		student.add(str1);
		student.add(str2);
		System.out.println(student);
		System.out.println(student.get(0) + " nho " + student.get(1));
	}
}
