package fr.isen.java2.db.daos;

//import javax.sql.DataSource;

// Package nécessaire pour le bonus 1 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

//import org.sqlite.SQLiteDataSource;

public class DataSourceFactory {

	private DataSourceFactory() {
		// This is a static class that should not be instantiated.
		// Here's a way to remember it when this class will have 2K lines and you come
		// back to it in 2 years
		throw new IllegalStateException("This is a static class that should not be instantiated");
	}

	/**
	 * @return a connection to the SQLite Database
	 * 
	 */
	/* public static DataSource getDataSource() {
		if (dataSource == null) {
			dataSource = new SQLiteDataSource();
			dataSource.setUrl("jdbc:sqlite:sqlite.db");
		}
		return dataSource;
	} */

	/** URL de connexion JDBC à la base de données SQLite. */
	private static final String URL = "jdbc:sqlite:sqlite.db";
	
	/**
	 * Crée une nouvelle connexion a la base de données en utilisant DriverManager 
	 * @return connexiion a la bse de données
	 */
	public static Connection getConnection(){
		try{ 
			return DriverManager.getConnection(URL);
		} catch (SQLException e){
			throw new RuntimeException("Erreur de connexion", e);
		}
	}
}