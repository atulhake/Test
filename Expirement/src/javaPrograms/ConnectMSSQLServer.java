package javaPrograms;

import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
	public class ConnectMSSQLServer
	{
	    public static void main(String[] args) {
	        // Connect to database
	        String hostName = "tide-srd-01-sql-01.database.windows.net"; // update me
	        String dbName = "TIDE-DEV-01-SYS-01"; // update me
	        String user = "tide-srd-01-sql-01-admin"; // update me
	        String password = "Mg^mFnXKvvAUBX9bQ8vpAYh!U"; // update me
	        String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
	            + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
	        Connection connection = null;
	        try {
	            connection = DriverManager.getConnection(url);
	            String schema = connection.getSchema();
	            System.out.println("Successful connection - Schema: " + schema);
	            System.out.println("Query data example:");
	            System.out.println("=========================================");

	            // Create and execute a SELECT SQL statement.
	            String selectSql = "select * from Bordereaux Where Id = '112a2c73-1b0a-4641-82ec-51bc61260d14'";

	           
	            String call = "{call DeleteBordereauxFormatOnCancel(?,?)}";
	            
	            String BFId = "DD8B9610-71E1-4F30-A313-F98DAFBDDE07";
	            String TId = "82CFF6B6-A5A3-449F-943C-541228C454D9";
	            
	            boolean checkSPIsExecuted = false;
	            
	            try (CallableStatement cstmt = connection.prepareCall(call)) {
		            cstmt.setString(1, BFId);
		            cstmt.setString(2, TId);
		            cstmt.execute();
		            checkSPIsExecuted = true;
	            }
	            Statement statement = (Statement) connection.createStatement();
	            ResultSet resultSet = ((java.sql.Statement) statement).executeQuery(selectSql) ;

	                // Print results from select statement
	                System.out.println("Top 20 categories:");
	                while (resultSet.next())
	                {
	                    System.out.println(resultSet.getString(1));
	                }
	                connection.close();
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	