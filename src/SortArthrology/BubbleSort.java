/**
 * 
 */
package SortArthrology;

import java.util.Random;

/**
 * @author Tran
 *
 */
public class BubbleSort {

	public static void sort(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j > 0; j--) {
				if (array[j] > array[j - 1]) {
					int temp = array[j];
					array[j]= array[j-1];
					array[j-1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] num = new int[20];
		for (int i = 0; i < num.length; i++) {
			int rand = new Random().nextInt(50);
			num[i] = rand;
		}
		BubbleSort.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
