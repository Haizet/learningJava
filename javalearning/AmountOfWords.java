package webtesting;

import java.util.Scanner;

public class AmountOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String input = sc.nextLine();
		int amountOfWords = getWordsAmount(input);
	
		System.out.println("Amount of words in your text: " + amountOfWords);
	}

	private static int getWordsAmount(String text) { //public for web
		int num = 0;
		String[] stArray = text.split("\\s");
		num = stArray.length;
		return num;
	}
}