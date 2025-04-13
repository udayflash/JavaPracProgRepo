package packjavaprog;

public class SumOfDigits {

	public static void main(String[] args) {
           int number = 12345;
           int sumofDigits = calculateSumOfDigits(number);
           System.out.println(" Sum of digits of " + number + " is: " + sumofDigits);
           	}
	       
	public static int calculateSumOfDigits(int number) {
		   int sum = 0;
		   while (number > 0) {
			   int digit = number % 10;
			   sum = sum + digit;
			   number = number / 10;
		   }
		   return sum;
	}
}
