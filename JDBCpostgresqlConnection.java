package postgreSQL_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCpostgresqlConnection {
		//jdbc url
	//jdbc username
	// jdbc password
	private final String url="jdbc:postgresql://localhost/postgres";
	private final String user="postgres";
	private final String password="Darshu@1997";
//	connection doone - i will create a method to communication.
	private void connect() {
//		whenever we deal with server we always go for exception handling?
//				server may active , not responsive..may.
		try (Connection connection=DriverManager.getConnection(url, user, password)){
			if(connection != null ) {
				System.out.println("connected to postgreSql server successfully");
			}else {
				System.out.println("connection failed");
			}
			Statement statement= connection.createStatement();
//			ResultSet resultSet=statement.executeQuery("Select * from courses");
//			if(resultSet.next()) {
//				System.out.println(resultSet.getString(1)+ ":: "+ resultSet.getString(2)+":: "+resultSet.getString(3)+ " ::"+resultSet.getString(4));
//			}
//			if(resultSet.next()) {
//				System.out.println(resultSet.getInt(1)+ ":: "+ resultSet.getString(2)+":: "+resultSet.getString(3)+ ":: "+resultSet.getString(4));
//			}
//			if(resultSet.next()) {
//				System.out.println(resultSet.getInt(1)+ ":: "+ resultSet.getString(2)+":: "+resultSet.getString(3)+ ":: "+resultSet.getString(4));
//			}
//			if(resultSet.next()) {
//				System.out.println(resultSet.getInt(1)+ "::"+ resultSet.getString(2)+" ::"+resultSet.getString(3)+ ":: "+resultSet.getString(4));
//			}
			ResultSet display=statement.executeQuery("insert into courses values (6,'darshan','darsgahajj','1997-08-21');");
			System.out.println(display.getString(6));
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		JDBCpostgresqlConnection sqlConnect=new JDBCpostgresqlConnection();
		sqlConnect.connect();
	}
}
