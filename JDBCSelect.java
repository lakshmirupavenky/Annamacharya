import java.sql.*;
class JDBCSelect{
public static void main(String[] args){
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
Statement stmt=con.createStatement();
String sQuery="select *from annamacharya2";
ResultSet rs=stmt.executeQuery(sQuery);
int i=1;
while(rs.next()){
System.out.println("Google Employee:"+i);
System.out.println("********************");
System.out.print("num:"+rs.getString("rnum")+"\t");
System.out.print("Name:"+rs.getString("name")+"\t");
System.out.print("branch:"+rs.getString("branch")+"\n");
i++;
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
