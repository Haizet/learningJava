package webtesting;

import java.util.Scanner;

public class UserActivitySelector {

	public static void main(String[] args) {
		System.out.print("Please, enter action name: ");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		
		switch (userInput) {
			case "login":
				System.out.print("Please, enter your username");
				break;
			case "sign_up":
				System.out.print("Welcome!");
				break;
			case "terminate_program":
				System.out.print("Thank you! Good Bye!");
				break;
			case "main_menu":
				System.out.print("Main menu");
				break;
			case "about_app":
				System.out.print("This app is created by me with support"
						+ "of \u00AE It-Bulls.com");
				break;
			default:
				System.out.print("Please, enter one of these values:"
						+ "login, sing_up, terminate_program,"
						+ "main_menu, about_app");
		}
	}
	}


