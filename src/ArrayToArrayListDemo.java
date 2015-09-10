import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayListDemo {

	public static void main(String[] args) {
		
		String[] name = {"Loi", "Lien", "Hoa", "Ngat"};
		String str1 = "Thao";
		ArrayList<String> nameArray = new ArrayList<String>(Arrays.asList(name));
		nameArray.add(str1);
		System.out.println(nameArray);
		//System.out.println(Arrays.asList(name));
		//System.out.println(nameArray.get(0));
	}
}
