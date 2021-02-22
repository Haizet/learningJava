package webtesting;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
		String input = sc.nextLine();
		String[] stArray = input.split("\\s");
	    int[] intArray= new int[stArray.length];
		for (int i = 0;i<stArray.length;i++) {
			intArray[i]= Integer.parseInt(stArray[i]);
		}
	    int maxInt = findMaxIntInArray(intArray);
	
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		System.out.println(maxInt);
	}

	
	public static int findMaxIntInArray(int[] intArray) {
		int i = 0;
		int max = 0;
		while (i < intArray.length-1) {
			if (max<intArray[i]) {
				max = intArray[i];
			}
			System.out.println(max);
			i++;
		}
		return max;
	}
}
