import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 
 * @author Ahmad 
 * 
 * 2/16/22 
 * Ha - 
 * I need a function to validate the account exists or not
 * I need a function get all the sales values in to an arraylist as double and return it 
 * 
 * 
 */
public class DbConnection {
	String userName, password;
	String dataBaseName;

	/**
	 * constructor.
	 * 
	 * @param dataBase
	 * @param user
	 * @param password
	 */
	public DbConnection(String dataBase, String user, String password) {
		this.dataBaseName = dataBase;
		this.password = password;
		this.userName = user;

	}

	/**
	 * set username.
	 * 
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * set password.
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * set database name.
	 * 
	 * @param dataBaseName
	 */
	public void setDataBaseName(String dataBaseName) {
		this.dataBaseName = dataBaseName;
	}

	/**
	 * connect to the database.
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Connection openConnection() throws ClassNotFoundException, SQLException {
		Connection c = null;
		try{
			Properties properties = new Properties();
			properties.put("user", userName);
			properties.put("password", password);
			String url = "jdbc:mysql://34.94.136.83/" + dataBaseName;

			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection(url, properties);
			System.out.println("Connected");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return c;
	}
}
