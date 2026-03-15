package myPackage;

public class Query {
	//All the Queries required for CRUD Operations
		public static String insert="INSERT INTO Books VALUES (?,?,?,?)";
		public static String retrieve="SELECT * FROM Books";
		public static String update="Update Books SET Quantity=? where Title=?";
		public static String delete="DELETE FROM Books WHERE Title=?";
}
