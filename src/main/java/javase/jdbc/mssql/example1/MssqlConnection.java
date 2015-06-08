package javase.jdbc.mssql.example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MssqlConnection {
    Connection conn = null;
    
    public MssqlConnection() {
        String protocol = "jtds:sqlserver";
        String servername = "192.168.1.103";
        String port = "1433";
        String databasename = "javase_jdbc_mssql_example1";
        String username = "root";
        String password = "";            
        String CONNECTION = "jdbc:" + protocol + "://" + servername + ":" + port + "/" + databasename;         
        String DRIVER_NAME = "net.sourceforge.jtds.jdbc.Driver";
        
        try {
            Class.forName(DRIVER_NAME);
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println(CONNECTION);
            conn = DriverManager.getConnection(CONNECTION, username, password);
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Connection getConnection() {
        return conn;
    }
}

