package paramapp;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement; 
import java.util.Scanner; 

public class Jdbc_InsertionOperation {

	public static void main(String[] args) throws Exception { 
		 
		String url="jdbc:mysql://localhost:3306";
		String userName="root";
		String pwd="Xworkzodc@123";
        Scanner scanner = null; 
		Connection con=null;
        Statement statement = null; 

 
        try {
			con=DriverManager.getConnection(url, userName, pwd);
	
        
            int StdId = 0; 
            String StdName = null; 
            int StdRollNo = 0; 
            String StdAddress = null; 
            scanner = new Scanner(System.in); 
            if (scanner != null) { 
                System.out.println("Enter Student No"); 
                StdId = scanner.nextInt(); 
                System.out.println("Enter Student Name"); 
                StdName = scanner.next(); 
                System.out.println("Enter Student RollNo"); 
                StdRollNo = scanner.nextInt();
                System.out.println("Enter Student Address"); 
                StdAddress = scanner.next(); 
            }
            
            if (con != null) { 
                statement = con.createStatement(); 
            String insertSQL =String.format("insert into xworkz.student" 
                + " values(%d,'%s',%d,'%s')" 
            		+ "", StdId,StdName,StdRollNo,StdAddress);
            
			
			int result = statement.executeUpdate(insertSQL); 

            if (result == 0) { 
                System.out.println("Record Inserted Failed"); 
            } else { 
                System.out.println(result+ " Record(s) Inserted "); 
            } 
        
	  
            }	 
} catch (SQLException sqe) { 
    sqe.printStackTrace(); 

} catch (Exception e) { 
    e.printStackTrace(); 
} finally { 
    try { 
        if (statement != null) { 
            statement.close(); 
        } 
    } catch (SQLException sqe) { 
        sqe.printStackTrace(); 

    } 

    try { 
        if (con != null) { 
            con.close(); 
        } 
    } catch (SQLException sqe) { 
        sqe.printStackTrace(); 

    } 

}
	}
}


	

