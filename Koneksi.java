/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kantinku;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Kris Cyber
 */
public class Koneksi {
    Connection con;
    Statement stm;
    
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/kantinku","root","");
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"koneksi gagal "+e.getMessage());
        }
    }
}
