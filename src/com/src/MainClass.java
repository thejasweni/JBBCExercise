
package com.src;
import java.sql.Connection;
import java.sql.SQLException;
import com.src.Service.impl.DBlibraryImpl;
import com.src.Service.impl.DbConnectionImpl;

public class MainClass {
	public static void main(String args[]) throws SQLException{
		DbConnectionImpl connectionImpl= new DbConnectionImpl();
		DBlibraryImpl dBlibraryImpl = new DBlibraryImpl();
		Connection connection;
		String createQuery= "Create table Thej("+
							"emp_id integer not null,"+
							"name varchar(30));";
		String insertQuery= "insert into Thej values"+
							"(1,'Thej');";
		String deleteQuery= "Delete from Thej where emp_id = 1";
		String dropTable = 	"drop table Thej";
		
		connectionImpl.registerConnection();
		connection = connectionImpl.makeConnection();
		dBlibraryImpl.dropTable(dropTable, connection);
		connection = connectionImpl.makeConnection();
		dBlibraryImpl.createQuery(createQuery, connection);
		connection = connectionImpl.makeConnection();
		dBlibraryImpl.insertQuery(insertQuery, connection);
		connection = connectionImpl.makeConnection();
		dBlibraryImpl.deleteQuery(deleteQuery, connection);
		
		
	}
}
