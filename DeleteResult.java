import java.sql.*;
public class DeleteResult{
public static void main(String args[]) throws Exception{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
String sQuery="select rnum,name,branch from annamacharya2";
ResultSet rs=stmt.executeQuery(sQuery);
int i=1;
rs.beforeFirst();
while(rs.next()){
if((rs.getString("rnum")).equals("577")){
rs.deleteRow();
}
}
rs.beforeFirst();
System.out.println("rnum \t name \t\t branch");
while(rs.next()){
System.out.println(rs.getString("rnum")+"\t"+rs.getString("name")+"\t"+rs.getString("branch"));
}
}
}
