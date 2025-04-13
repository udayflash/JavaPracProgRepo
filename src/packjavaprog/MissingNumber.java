package packjavaprog;

public class MissingNumber {
	public static int findMissing(int[] arr, int n) {
		int total = n * n + 1 / 2;
		for (int num : arr) {
			total -= num;
		}
		return total;
	}
	public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int missing = findMissing(arr, 6);
        System.out.println("Missing number: " + missing);
	}
}
