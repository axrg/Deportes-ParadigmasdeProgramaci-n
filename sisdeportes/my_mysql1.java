package sisdeportes;

import java.sql.*;
public class my_mysql1 {

public  String[][] my_db_select() {
////////////
String[][] data = new String[10][3]; // [rows][columns]
	
try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/dbdeporte","root","");  
	Statement st=con.createStatement();  
	
  ResultSet rs=st.executeQuery("SELECT * FROM deportes LIMIT 0,10"); 
// Looping to store result in returning array data // 
	int i=0;
	while(rs.next())  {
	 for(int j=0;j<3;j++) {
	 //System.out.print(rs.getString(j+1));
	 data[i][j]=rs.getString(j+1);
	 }
	 //System.out.println();
	 i=i+1;
	}
// Below lines to check data before returning. // 	
/*		
 for (int x=0;x<data.length;x++) {
	 for (int y=0;(data[x]!= null && y <data[x].length);y++) {
		 System.out.print(data[x][y] + " ");
	 }
	 System.out.println();
 }
*/
con.close();  
}catch(Exception e){ System.out.println(e);} 
//////////////////////////////

return data;
	}
}