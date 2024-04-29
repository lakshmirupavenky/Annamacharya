import java.sql.*;
public class BatchUpdate{
public static void main(String args[]) throws Exception{
//Step 2:Registering with JDBC driver
Class.forName("oracle.jdbc.driver.OracleDriver");
//Step 3:Getting Connection object
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
con.setAutoCommit(false);
//Step 4:Create Statement object
Statement stmt=con.createStatement();
String q1="insert into annamacharya2 values(577,'Sankar','Programmer')";
stmt.addBatch(q1);
String q2="insert into annamacharya2 values(579,'hari','System Engineer')";
stmt.addBatch(q2);
String q3="update annamacharya2 set branch='CFO' where rnum='1'";
stmt.addBatch(q3);
stmt.executeBatch();
con.commit();
}
}
