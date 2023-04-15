package jdbc_demo;
import java.sql.*;
public class viewJdbc {

	public static void main(String[] args)
	{
		//Display record from database
		
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select * from student where sname like 'Anil'");
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2));
				}
			}catch(Exception e) {}
			}
		}



