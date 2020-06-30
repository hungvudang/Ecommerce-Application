/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author hungv
 */
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;
    private String url = "jdbc:sqlserver://localhost:1433;databaseName=ecommerce";
    private String user = "admin";
    private String password = "admin";
    
    
    private DatabaseConnection() throws SQLException{
        try{
            this.connection = DriverManager.getConnection(url, user, password);
        } catch(ClassCastException ex){
            System.out.println("Database Connnection Create Failed");
        }
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
