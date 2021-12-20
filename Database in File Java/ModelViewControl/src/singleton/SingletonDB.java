package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SingletonDB {
	protected Connection dataBase = null;
	protected Statement statement = null;
	private static SingletonDB me = null;

	private SingletonDB() {}

	public static SingletonDB getInstance() throws Exception {
		if(me == null) {
			me = new SingletonDB();			
			me.connect("localhost", "data", 3306, "root", "password");
			me.createStatement();
			System.out.println(me);
		}				
		return me;
	}	

	protected void createStatement() throws SQLException {
		if(this.statement != null)
			this.statement.close();
		statement = dataBase.createStatement();
	}

	public Statement getStatement() {
		return statement;
	}

	protected void connect(
			String server,
			String database,
			int port,
			String user,
			String password
		) throws Exception {
		String connectString = "jdbc:mysql://" + 
				server + ":" + port + "/" + database +
				"?verifyServerCertificate=false"+
				"&useSSL=false"+
				"&requireSSL=false"+
				"&useTimezone=true"+
				"&serverTimezone=UTC"+
				"&allowPublicKeyRetrieval=true";
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		if(this.dataBase != null)
			this.dataBase.close();
		dataBase = DriverManager.getConnection(connectString, user, password);
	}

	public String toString() {
		try{
			return "Status connection Banco database: " + (me.dataBase.isClosed() ? "closed" : "open");
		}catch(SQLException exception) {
			exception.printStackTrace();
		}
		return "";
	}

	public static void main(String[] args) {
		try{
			System.out.println(SingletonDB.getInstance());
		}catch(Exception exception) {			
			exception.printStackTrace();
		}
	}
}
