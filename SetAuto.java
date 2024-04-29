import java.sql.*;
public class SetAuto{
	public static void main(String args[])throws Exception
	{
		class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
		con.SetAutoCommit(false);
		Statement stmt=con.createStatement();
		Statement uQuery="update annamacharya2 set branch='product owner' where rnum='Google551'";
		int i=stmt.executeUpdate(uQuery);
		con.commit();
		if(i>0)
			System.out.println(i+ "Rows updated");
	}
}
