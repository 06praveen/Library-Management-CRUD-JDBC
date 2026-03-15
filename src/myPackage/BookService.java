package myPackage;

public class BookService {
	
	BooksDAO dao = new BooksDAO();
	public void addBook(int id,String title,String author,int quantity) {
		dao.addBook(id, title, author, quantity);
	}

	public void viewBooks() {
		dao.viewBooks();
	}
	
	public void updateBook(int q,String bName) {
		dao.updateBook(q,bName);
	}

	public void deleteBook(String bookName) {
		dao.deleteBook(bookName);
	}

}
