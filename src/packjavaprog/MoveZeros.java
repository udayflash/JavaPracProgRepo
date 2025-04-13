package packjavaprog;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZerostoEnd(int[] arr) {
    	int j = 0;
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] != 0) {
    			arr[j++] = arr[i];
    		}
    	}
    	while (j < arr.length) {
    		arr[j++] = 0;   		
    	}
    }	
	public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZerostoEnd(arr);
        System.out.println("Zeros move to end: " + Arrays.toString(arr));
	}
}
