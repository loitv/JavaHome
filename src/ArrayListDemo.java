import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList student;
		ArrayList student2 = new ArrayList();
		String str1 = "Loi";
		String str2 = "Lien";
		String[] name = {"Thao", "Phuong"};
		student = new ArrayList(Arrays.asList(name));
		student2.add(Arrays.asList(name));
		student.add(str1);
		student.add(str2);
		
		System.out.println(student);
		System.out.println((student2.get(0)));
		System.out.println(student.get(0) + " nho " + student.get(1));
	}
}
