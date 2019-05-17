package com.kruwell.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author user
 */
public class Konfig {
    
    private static Connection MYSQLConfig;
    
    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/Tubes_Makanan";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MYSQLConfig = DriverManager.getConnection(url , user , pass);
            
        } catch (SQLException e) {
            System.out.println("Koneksi ke Database Gagal "+ e.getMessage());
        }
        
        return MYSQLConfig;
    }
}
