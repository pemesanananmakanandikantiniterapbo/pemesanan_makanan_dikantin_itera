package kantinku;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sinkronisasi {
    private static Connection koneksi;
    
    public static Connection getKoneksi() throws SQLException {
        if(koneksi==null) {
            try {
                String url = new String();
            String user = new String();
            String password = new String();
            url = "jdbc:mysql://localhost:/3306/kantinku";
            user = "root";
            password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url,user,password);
            } catch (Exception e) {
                System.out.println("Failed.");
            }  
        } return koneksi;
    }
    
}
