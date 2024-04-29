import java.sql.*;
public class InsertResult{
public static void main(String args[]) throws Exception{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
String sQuery="select rnum,name,branch from annamacharya2";
ResultSet rs=stmt.executeQuery(sQuery);
rs.beforeFirst();
rs.moveToInsertRow();
rs.updateString("rnum","5T7");
rs.updateString("name","ARR");
rs.updateString("branch","Automation Engineer");
rs.insertRow();
}
}
