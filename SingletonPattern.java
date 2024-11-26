package com.edu;
class DatabaseConnection{
	private static DatabaseConnection databaseConnection;
	private DatabaseConnection() {
		
	}
	public static DatabaseConnection getObject() {
		if(databaseConnection == null) {
			databaseConnection = new DatabaseConnection();
		}
		return databaseConnection;
		
	}
	void displayData() {
		System.out.println("display the output");
	}
	void insertData() {
		System.out.println("insert the data");
	}
}


public class SingletonPattern {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DatabaseConnection dc = new DatabaseConnection();
		DatabaseConnection databaseConnection = DatabaseConnection.getObject();
		databaseConnection.displayData();
		databaseConnection.insertData();
	}


}

