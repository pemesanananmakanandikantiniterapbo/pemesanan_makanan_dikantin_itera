/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kantinku;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kris Cyber
 */
public class Kasir extends javax.swing.JFrame {

    int dragxmouse;
    int dragymouse;
    
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    
    public Kasir() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        Koneksi DB = new Koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        tampilTabel();
    }

     public void tampilTabel(){
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("Nomor Meja");
        tb.addColumn("Nama Pembeli");
        tb.addColumn("Pesanan");
        tb.addColumn("Harga");
        tb.addColumn("Tanggal");
        Pesanan.setModel(tb);
        
        try{
            String a = "select * from (pesan left join pembeli on pesan.id_pembeli=pembeli.id_pembeli) left join menunya on pesan.id_menu=menunya.id_menu;";
            rs = stat.executeQuery(a);
                while(rs.next()){
                    Object[] obj = new Object[5];
                    obj[0] = rs.getString("Meja");
                    obj[1] = rs.getString("Nama_pembeli");
                    obj[2] = rs.getString("Nama_Menu");
                    obj[3] = rs.getString("Harga");
                    obj[4] = rs.getString("Tgl_beli");
                    tb.addRow(obj);                   
                }
            String b = "select sum(harga) from menunya inner join pesan on menunya.id_menu=pesan.id_menu;";
            rs = stat.executeQuery(b);
            while(rs.next()){
                jum.setText(rs.getString("sum(harga)"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pesanan = new javax.swing.JTable();
        Konfirm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        eksit = new javax.swing.JButton();
        layot = new javax.swing.JLabel();
        geser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(375, 165));
        setMinimumSize(new java.awt.Dimension(620, 440));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(620, 440));
        getContentPane().setLayout(null);

        jum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jum);
        jum.setBounds(399, 340, 210, 30);

        jLabel3.setFont(new java.awt.Font("BlackHole BB", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Total:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(324, 334, 170, 40);

        Pesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nomor Meja", "Nama Pembeli", "Pesanan", "Harga", "Tanggal"
            }
        ));
        jScrollPane1.setViewportView(Pesanan);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 140, 600, 180);

        Konfirm.setBackground(new java.awt.Color(0, 255, 0));
        Konfirm.setFont(new java.awt.Font("BlackHole BB", 1, 18)); // NOI18N
        Konfirm.setText("Konfirmasi");
        Konfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KonfirmActionPerformed(evt);
            }
        });
        getContentPane().add(Konfirm);
        Konfirm.setBounds(453, 387, 150, 30);

        jLabel2.setFont(new java.awt.Font("BlackHole BB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Konfirmasi Pembayaran");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 10, 620, 60);

        jLabel1.setMaximumSize(new java.awt.Dimension(620, 440));
        jLabel1.setMinimumSize(new java.awt.Dimension(620, 440));
        jLabel1.setPreferredSize(new java.awt.Dimension(620, 440));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 440);

        eksit.setBackground(new java.awt.Color(255, 0, 0));
        eksit.setFont(new java.awt.Font("BlackHole BB", 1, 14)); // NOI18N
        eksit.setText("X");
        eksit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eksitMouseClicked(evt);
            }
        });
        getContentPane().add(eksit);
        eksit.setBounds(560, 10, 50, 30);

        layot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kantinku/gambar/hexagonal-shape-technology-background_31543-348.jpg"))); // NOI18N
        layot.setPreferredSize(new java.awt.Dimension(620, 440));
        getContentPane().add(layot);
        layot.setBounds(0, 0, 620, 440);

        geser.setText("jLabel2");
        geser.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                geserMouseDragged(evt);
            }
        });
        geser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                geserMousePressed(evt);
            }
        });
        getContentPane().add(geser);
        geser.setBounds(0, 0, 620, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eksitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eksitMouseClicked
        this.dispose();
    }//GEN-LAST:event_eksitMouseClicked

    private void geserMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geserMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x-dragxmouse,y-dragymouse);
        System.out.println(x+","+y);
    }//GEN-LAST:event_geserMouseDragged

    private void geserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geserMousePressed
        dragxmouse = evt.getX();
        dragymouse = evt.getY();
    }//GEN-LAST:event_geserMousePressed

    private void KonfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KonfirmActionPerformed
        try{
            String don = "DELETE FROM Pesan"; 
            PreparedStatement ne = (PreparedStatement) con.prepareStatement(don);
            ne.executeUpdate();
            ne.close();
            JOptionPane.showMessageDialog(null, "Transaksi Selesai");
            tampilTabel();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        } 
    }//GEN-LAST:event_KonfirmActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Konfirm;
    private javax.swing.JTable Pesanan;
    private javax.swing.JButton eksit;
    private javax.swing.JLabel geser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jum;
    private javax.swing.JLabel layot;
    // End of variables declaration//GEN-END:variables
}