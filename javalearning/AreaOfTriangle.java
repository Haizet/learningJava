package webtesting;

import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter A side of a triangle: ");
		int a = sc.nextInt();
		
		System.out.print("Please, enter B side of a triangle: ");
		int b = sc.nextInt();
		
		System.out.print("Please, enter C side of a triangle: ");
		int c = sc.nextInt();
		
		float perim = (a + b + c)/2;
		float p = perim*(perim-a)*(perim-b)*(perim-c);
		float triangleArea = (float) Math.sqrt(p);
		
		System.out.println("Triangle area is: " + triangleArea);

	}
}
