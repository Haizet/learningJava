package webtesting;


import java.util.Arrays;
import java.util.Scanner;


/*public class stringtoarray {
	public static void main(String[] args) {
		System.out.print("Type something: ");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(input);
		String[] sentence = input.split("\\s");
		System.out.print(Arrays.toString(sentence)); 
	}
}*/
public class stringtoarray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		System.out.print("You entered these words: ");
		System.out.println(Arrays.toString(userInput.split("[\\p{P}\\s]+")));
	}

}