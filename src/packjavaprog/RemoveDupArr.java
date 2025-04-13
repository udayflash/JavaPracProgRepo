package packjavaprog;

import java.util.Arrays;

public class RemoveDupArr {
	public static int removedup(int[] arr) {
		if (arr.length == 0) return 0;
		int index = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				arr[index++] = arr[i];
			}
		}
		return index;
	}
	public static void main(String[] args) {
          int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
          int len = removedup(arr);
          System.out.println("New length: " + len);
          System.out.println("Array without duplicate: " + Arrays.toString(Arrays.copyOf(arr, len)));
	}
}
