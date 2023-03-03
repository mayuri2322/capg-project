package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class Insertco {
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/capg","root","Mayuri@23");
			Statement st=(Statement) conn.createStatement();
			
			String str="insert into employee values(6,'abc',)"
			st.execute(str1);
			ResultSet rset=st.executeQuery("select * from employee");
			while(rset.next())
			{
				System.out.println(rset.getString(1)+"\t"+rset.getString(2)+"\t"+rset.getString(3)+"\t\t"+rset.getString(4)); 
			}
			
		} catch (Exception e) 
		{
			System.out.println("The error are:   " + e);
		}

	}
}
