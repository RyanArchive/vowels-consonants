// Separating vowels and consonants

import java.util.Scanner;

public class VowelsConsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word, repeat;
		char yy = 'y';
		char nn = 'n';
		char yY = 'Y';
		char nN = 'N';

		do {
			int x = 0;
			String vowels = "", consonants = "";

			System.out.print("\nEnter a Word: ");
			word = sc.nextLine();

			while (x <= word.length() - 1) {
				char c = word.charAt(x);

				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
					vowels = vowels + c;
				} else {
					consonants = consonants + c;
				}

				x++;
			}

			System.out.println("\nWord: " + word);
			System.out.print("Vowel/s: " + vowels);
			System.out.print("\nConsonant/s: " + consonants + "\n\n");

			do {
				System.out.print("Repeat Again? [Y/N]: ");
				repeat = sc.nextLine();
			} while (!(repeat.equalsIgnoreCase("y") || repeat.equalsIgnoreCase("n")));
		} while (repeat.equalsIgnoreCase("y"));
	}
}