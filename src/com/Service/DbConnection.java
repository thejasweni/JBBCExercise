package com.Service;
import java.sql.Connection;

public interface DbConnection {

	public void registerConnection();
	public Connection makeConnection();
	
}
