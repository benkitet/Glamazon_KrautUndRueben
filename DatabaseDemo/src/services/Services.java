package services;

import java.sql.SQLException;

import util.DatabaseManager;
public class Services {
	protected DatabaseManager dbm = DatabaseManager.getInstance();
	private String databaseName = "database_glamazon.db";
	
	public Services() {
		try {
			dbm.connect(databaseName);			
		} catch (SQLException e) {
			System.out.println("Fehler beim Verbinden mit der Datenbank.");
		}
	}
}
