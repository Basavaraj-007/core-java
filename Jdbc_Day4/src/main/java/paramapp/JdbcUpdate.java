package paramapp;



	

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class JdbcUpdate {

		public static void main(String[] args) {
			String url ="jdbc:mysql://localhost:3306";
			String userName = "root";
			String pwd="Xworkzodc@123";
			Connection con = null;
			
//			Step 01
//			Load and register vendor driver
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
//				Step 02
//				Create Connection 
				 con =DriverManager.getConnection(url, userName, pwd);
//				Step 03
//				Create Statement
//				 By using statement interface we can pass only static sqp querry, hacker can hack data from static sql querry(sql injection will happen) to avoid sql injection in JDBC programme we use prepare statement interface.

//				 Prepare statement uses dynamic sql querry such as 
//					Table has 3 columns?
//				 insert into tableName values (?, ?, ?);
//				 Update from tablename setname =? where id =?
//				 Delete from tablename where id = ?
//				 Prepare statement is a sub interface of statement interface 
//				 Prepare statement uses dynamic sql querry to communicate with databse
//				SYnTAX: PreparedStatement  pst  = Connection.prepareStatement("String querry");
//				 pst.setXXX(); to set value for dynamic sql querry;
//				 XXX represents different datatypes.
//				 Examples : 

				 
	/*		 Step 03:
	 * PreparedStatement  pst  = Connection.prepareStatement("insert into xworkz.games values(?, ?)");
	 * pst.setInt(1,109); 
	 * first parameter is index of column
	 * second parameter value
	 * pst.setInt(1,109);
	 * pst.setString (2,"Veena Mandre Dullari");
	 * pst.execute();*/
				
				 
				 Statement   stat = con.createStatement();
//				Step 04
//				execute sql querry
				stat.execute("update xworkz.games set name ='Discuss throw' where name = 'abc';");
				stat.execute("delete from xworkz.games where name = 'Javelin';");

				System.out.println("Record updted");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
			
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			}
		
		
		}
		}

