import java.util.Scanner;

// A quick and messy method of dealing with a ceasar encryption.

public class CEncryption {

	static String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the phrase you want to change?");
		String original = scan.nextLine();
		System.out.println("How many rotations?");
		int rotations = scan.nextInt();
		char[] originalChange = original.toCharArray();
		original = original.toUpperCase();
		for(int i = 0; i < original.length(); i++) {
			for(int j = 0; j < letters.length; j++) {
				if(original.charAt(i) == letters[j].toCharArray()[0]) {
					originalChange[i] = letters[(j + rotations) % 26].toCharArray()[0];
				}
			}
		}
		System.out.println(originalChange);
	}

}
