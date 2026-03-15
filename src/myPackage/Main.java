package myPackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("---Welcome to Library Management ---\nLogin -");
		//Login input
		System.out.print("Enter Username : ");
		String user=in.nextLine();
		System.out.print("Enter Password : ");
		String pass=in.nextLine();
		LoginCheck login = new LoginCheck();
		login.getLogin(user,pass);
	}

}
