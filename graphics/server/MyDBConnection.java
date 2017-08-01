package graphics.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import graphics.client.model.User;
import graphics.client.service.DBConnection;

public class MyDBConnection extends RemoteServiceServlet implements DBConnection {

	private static final long serialVersionUID = 1L;
	
	private Connection conn = null;
	private String url = "jdbc:sqlite:/home/dabija/Java/UsersData.sqlite";
	public boolean login = false;
	public MyDBConnection() {
		try {
			Class.forName("org.sqlite.JDBC").newInstance();
			conn = DriverManager.getConnection(url);
			GWT.log("Connected");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private Connection connect() {
		String url = "jdbc:sqlite:/home/dabija/Java/UsersData.sqlite";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			
		}
		return conn;
	}

	public User authenticateUser(String userName, String password) {

		User user = null;
		
		String uName, pass;
		String sql = "SELECT * FROM Users";
		try {
			Connection conn = this.connect();
			java.sql.Statement ps = conn.createStatement();
			ResultSet result = ps.executeQuery(sql);
			while (result.next()) {
				uName = result.getString(3);
				pass = result.getString(4);
				if (uName.equals(userName) && pass.equals(password)) {
					user = new User(result.getString(3), result.getString(4));
					login = true;
					System.out.println("Logged in");
				} else {
					System.out.println("Try again");
				}
			}
			result.close();
			ps.close();
		} catch (SQLException sqle) {
			//sqle.printStackTrace();
		}
		return user;
	}
	
	public void registerUser(String fName, String lName, String uName, String pass) {
		try {
			PreparedStatement ps = conn.prepareStatement("INSERT INTO users(FirstName, LastName, UserName, Password) VALUES (?, ?, ?, ?)");
			ps.setString(1, fName);
			ps.setString(2, lName);
			ps.setString(3, uName);
			ps.setString(4, pass);
			ps.executeUpdate();
			//conn.commit();
			conn.close();
		} catch (SQLException sqle) {
			//sqle.printStackTrace();
		}
	}
}
