package myPackage;

public class UserMenu {
	public static void User() {
		 BookService service=new BookService();
		 System.out.println();
	     System.out.println("Available Books:");
	     service.viewBooks();
	}
}
