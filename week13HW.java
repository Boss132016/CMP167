
public class week13HW {
// Write a recursive method that will calculate the product of all numbers from 1 up to a target
	public static void main (String[] args) {
		
	}
	public static int product (int a) {
		int result = 1;
		if (a <= 0) {
			result = 0;
		}
		else {
			for (int i = 1; i < a; i++) {
				result = result * i;
			}
		}
		return result;
	}
}
