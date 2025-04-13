package packjavaprog;

import java.util.ArrayList;

public class FirstLastArray {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		arrayList.add("Date");
		arrayList.add("ElderBerry");
		
		if (!arrayList.isEmpty()) {
			String firstElement = arrayList.get(0);
			String lastElement = arrayList.get(arrayList.size() - 1);
			
			System.out.println("First Element: " + firstElement);
			System.out.println("Last Element: " + lastElement);
		}
		else {
			System.out.println("The Array List is empty. ");
		}
	}
}