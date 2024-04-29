
import java.sql.*;
class JDBCInsert1{
public static void main(String[] args){
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
Statement stmt=con.createStatement();
String iQuery="insert into annamacharya2(empid,empname,empdes)values('Google551','Lakshmi Kanth','Cloud Specialist')";
int i=stmt.executeUpdate(iQuery);
if(i>0){
System.out.println(i+" record inserted");
}
else{
System.out.println("No Record ineserted,Insert Operation Unsuccessful");
}
}
catch(ClassNotFoundException e){
e.printStackTrace();
}
catch(SQLException e){
e.printStackTrace();
}
}
}