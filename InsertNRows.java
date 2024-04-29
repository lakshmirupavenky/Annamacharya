import java.sql.*;
import java.util.*;
class InsertNRows{
public static void main(String args[]) throws Exception{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
PreparedStatement pstmt=con.prepareStatement("insert into annamacharya2 values(?,?,?)");
Scanner sin=new Scanner(System.in);
int i=0;
while(i<3){
System.out.println("Enter Record:"+i);
System.out.println("Enter rnum");
String rnum=sin.nextLine();
System.out.println("Enter Name");
String name=sin.nextLine();
System.out.println("Enter branch");
String branch=sin.nextLine();
pstmt.setString(1,rnum);
pstmt.setString(2,name);
pstmt.setString(3,branch);
pstmt.executeUpdate();
i++;
}
}
}
