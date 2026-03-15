package myPackage;

import java.util.Scanner;

public class AdminMenu {
	public static void Admin() {
		Scanner sc=new Scanner(System.in);
        BookService service=new BookService();

        while(true){
        	System.out.println();
            System.out.println("1 Add Book");
            System.out.println("2 View Books");
            System.out.println("3 Update Book");
            System.out.println("4 Delete Book");
            System.out.println("5 Exit");

            int choice=sc.nextInt();

            switch(choice){

                case 1:
                	System.out.print("Id: ");
                    int id=sc.nextInt();
                	
                    System.out.print("Title: ");
                    String title=sc.next();

                    System.out.print("Author: ");
                    String author=sc.next();

                    System.out.print("Quantity: ");
                    int q=sc.nextInt();

                    service.addBook(id,title,author,q);
                    break;

                case 2:
                    service.viewBooks();
                    break;

                case 3:
                	System.out.print("Book Title : ");
                    String bName=sc.next();
                    
                    System.out.print("Quantity : ");
                    int quantity=sc.nextInt();

                    service.updateBook(quantity,bName);
                    break;

                case 4:
                	System.out.print("Book Title : ");
                    String bookName=sc.next();

                    service.deleteBook(bookName);
                    break;
                 
                case 5:
                	return;
            }
        }
	}

}
