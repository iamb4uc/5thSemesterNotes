package jdbc_demo;

//Insert operation using JDBC
import java.sql.*;
import java.util.*;
public class insert_jdbc {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","");
			Statement stmt=con.createStatement();
			Scanner dis=new Scanner(System.in);
			System.out.println("Enter Roll Number:");
          int s1=dis.nextInt();
          System.out.println("Enter Student Name:");
          String s2=dis.next();
          //System.out.println("Enter percentage:");
          //double s3=dis.nextDouble();
          //System.out.println("Enter address:");
          //String s4=dis.next();
          stmt.executeUpdate("insert into student values("+s1+",'"+s2+"')");
          System.out.println("One Record Inserted in the table");
          
	}catch(ClassNotFoundException e){}
   catch(SQLException e1){System.out.println(e1);}


}
}