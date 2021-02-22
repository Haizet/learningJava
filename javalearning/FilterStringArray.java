package webtesting;

import java.util.Arrays;
import java.util.Scanner;
public class FilterStringArray {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any words separated by space: ");
		String userInput = sc.nextLine();
		System.out.print("Please, enter minumum word length to filter words: ");
		int minLength = sc.nextInt();
		
		String[] words = userInput.split("\\s+");
		String[] filteredWords = filterWordsByLength(minLength, words);
		System.out.println(Arrays.toString(filteredWords));
	}

	
	
	public static String[] filterWordsByLength(int minLength, String[] words) {
		String[] nwords = new String[words.length];
		int j = 0;
		for (int i = 0 ; i<words.length ; i++) {
			if (words[i].length() >= minLength) {
				nwords[j] = words[i];
				j++;
			}
		}
		String [] finalArray= filterNull(nwords);
		
		return finalArray;
	}

	public static String[] filterNull(String[] arr) {
		int newArraySize = 0;
		for (String word : arr) {
			if(word !=null) {
				newArraySize++;
			}
		}
		String[] finalArray = new String[newArraySize];
		int index = 0;
		for(String word : arr) {
			if (word !=null) {
				finalArray[index++]= word;
			}
		}
		return finalArray;
	}
}