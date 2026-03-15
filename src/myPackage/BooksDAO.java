package myPackage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BooksDAO {
	//addBook method
	public void addBook(int id,String title,String author,int quantity) {
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstm = conn.prepareStatement(Query.insert);
			pstm.setInt(1,id);
			pstm.setString(2,title);
			pstm.setString(3,author);
			pstm.setInt(4,quantity);
			pstm.execute();
			System.out.println("Data Inserted Successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	//viewBooks method
	public void viewBooks() {
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstm = conn.prepareStatement(Query.retrieve);
			ResultSet rs = pstm.executeQuery();
			System.out.println("The Books Available are :-");
			while(rs.next()) {
				System.out.println("ID:"+rs.getInt(1));
				System.out.println("Title:"+rs.getString(2));
				System.out.println("Author:"+rs.getString(3));
				System.out.println("Quantity:"+rs.getInt(4));
				System.out.println();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//updateBooks method
		public void updateBook(int quantity,String title) {
			try {
				Connection conn = DBConnection.getConnection();
				PreparedStatement pstm = conn.prepareStatement(Query.update);
				pstm.setInt(1,quantity);
				pstm.setString(2, title);
				pstm.executeUpdate();
				System.out.println("Data Updated Successfully!");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	//deleteBooks method
	public void deleteBook(String title) {
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstm = conn.prepareStatement(Query.delete);
			pstm.setString(1, title);
			int rowsAffected=pstm.executeUpdate();
			if(rowsAffected>0)
			{
				System.out.println("The Book Title:"+title+" is Deleted Successfully");
			}
			else {
				System.out.println("The Book doesn't Exist!");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
