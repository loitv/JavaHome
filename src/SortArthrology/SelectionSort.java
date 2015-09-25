package SortArthrology;

import java.util.Random;

public class SelectionSort {

	// sort by descending
	public static void sort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int max = array[i]; // store maximum element
			int index = i; // store position of max element
			for (int j = i + 1; j < array.length; j++) {
				if (max < array[j]) {
					max = array[j];
					index = j;
				}
			}
			// Neu chi so da thay doi, ta se hoan vi
			if (index != i) {
				int temp = array[i];
				array[i] = array[index];
				array[index] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] arrayNum2 = new int[20];
		for (int i = 0; i < arrayNum2.length; i++) {
			int rand = new Random().nextInt(100);
			arrayNum2[i] = rand;
		}
		SelectionSort.sort(arrayNum2);
		for (int i = 0; i < arrayNum2.length; i++) {
			System.out.print(arrayNum2[i] + " ");
		}
	}
}
