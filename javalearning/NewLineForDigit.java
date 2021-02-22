package webtesting;

import java.util.Arrays;
import java.util.Scanner;

public class NewLineForDigit {

	public static void main(String[] args) {
		System.out.print("Please, enter any integer: ");
		Scanner sc = new Scanner(System.in);
		int userinput = sc.nextInt();
		String uint = Integer.toString(userinput);
		int[] a = new int[uint.length()];
		for(int i=0;i<uint.length();i++) {
			a[i] = uint.charAt(i)- '0'; // 
		}
		int j = 0;
		while (j < a.length) {
			System.out.println(a[j]);
			j++;
			
		}
	/*
	 	System.out.print("Please, enter any integer: ");
		Scanner sc = new Scanner(System.in);
		String intString = sc.next();
		for (char digit: intString.toCharArray()){
			System.out.println(digit);
		}
	*/

	}

}
